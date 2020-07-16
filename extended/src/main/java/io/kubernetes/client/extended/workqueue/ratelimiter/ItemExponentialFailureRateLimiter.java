/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.extended.workqueue.ratelimiter;

import com.google.common.util.concurrent.AtomicLongMap;
import java.time.Duration;

/**
 * ItemExponentialFailureRateLimiter does a simple baseDelay*10<sup>num-failures</sup> limit dealing
 * with max failures and expiration are up to the caller
 */
public class ItemExponentialFailureRateLimiter<T> implements RateLimiter<T> {

  private Duration baseDelay;
  private Duration maxDelay;

  private AtomicLongMap<T> failures;

  public ItemExponentialFailureRateLimiter(Duration baseDelay, Duration maxDelay) {
    this.baseDelay = baseDelay;
    this.maxDelay = maxDelay;

    failures = AtomicLongMap.create();
  }

  @Override
  public Duration when(T item) {
    long exp = failures.getAndIncrement(item);
    long d = maxDelay.toMillis() >> exp;
    return d > baseDelay.toMillis() ? baseDelay.multipliedBy(1 << exp) : maxDelay;
  }

  @Override
  public void forget(T item) {
    failures.remove(item);
  }

  @Override
  public int numRequeues(T item) {
    return (int) failures.get(item);
  }
}
