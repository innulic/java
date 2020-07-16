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
package io.kubernetes.client.extended.generic.options;

public class PatchOptions {
  private String dryRun;
  private String fieldManager;
  private Boolean force;

  public String getDryRun() {
    return dryRun;
  }

  public void setDryRun(String dryRun) {
    this.dryRun = dryRun;
  }

  public Boolean getForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }

  public String getFieldManager() {
    return fieldManager;
  }

  public void setFieldManager(String fieldManager) {
    this.fieldManager = fieldManager;
  }
}
