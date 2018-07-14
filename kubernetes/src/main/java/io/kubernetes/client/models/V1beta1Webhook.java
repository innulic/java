/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1LabelSelector;
import io.kubernetes.client.models.V1beta1RuleWithOperations;
import io.kubernetes.client.models.V1beta1WebhookClientConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Webhook describes an admission webhook and the resources and operations it applies to.
 */
@ApiModel(description = "Webhook describes an admission webhook and the resources and operations it applies to.")

public class V1beta1Webhook {
  @SerializedName("clientConfig")
  private V1beta1WebhookClientConfig clientConfig = null;

  @SerializedName("failurePolicy")
  private String failurePolicy = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespaceSelector")
  private V1LabelSelector namespaceSelector = null;

  @SerializedName("rules")
  private List<V1beta1RuleWithOperations> rules = null;

  public V1beta1Webhook clientConfig(V1beta1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
    return this;
  }

   /**
   * ClientConfig defines how to communicate with the hook. Required
   * @return clientConfig
  **/
  @ApiModelProperty(required = true, value = "ClientConfig defines how to communicate with the hook. Required")
  public V1beta1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }

  public void setClientConfig(V1beta1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }

  public V1beta1Webhook failurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

   /**
   * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
   * @return failurePolicy
  **/
  @ApiModelProperty(value = "FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.")
  public String getFailurePolicy() {
    return failurePolicy;
  }

  public void setFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
  }

  public V1beta1Webhook name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \&quot;imagepolicy\&quot; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \"imagepolicy\" is the name of the webhook, and kubernetes.io is the name of the organization. Required.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1beta1Webhook namespaceSelector(V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.  For example, to run the webhook on any objects whose namespace is not associated with \&quot;runlevel\&quot; of \&quot;0\&quot; or \&quot;1\&quot;;  you will set the selector as follows: \&quot;namespaceSelector\&quot;: {   \&quot;matchExpressions\&quot;: [     {       \&quot;key\&quot;: \&quot;runlevel\&quot;,       \&quot;operator\&quot;: \&quot;NotIn\&quot;,       \&quot;values\&quot;: [         \&quot;0\&quot;,         \&quot;1\&quot;       ]     }   ] }  If instead you want to only run the webhook on any objects whose namespace is associated with the \&quot;environment\&quot; of \&quot;prod\&quot; or \&quot;staging\&quot;; you will set the selector as follows: \&quot;namespaceSelector\&quot;: {   \&quot;matchExpressions\&quot;: [     {       \&quot;key\&quot;: \&quot;environment\&quot;,       \&quot;operator\&quot;: \&quot;In\&quot;,       \&quot;values\&quot;: [         \&quot;prod\&quot;,         \&quot;staging\&quot;       ]     }   ] }  See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.  Default to the empty LabelSelector, which matches everything.
   * @return namespaceSelector
  **/
  @ApiModelProperty(value = "NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.  For example, to run the webhook on any objects whose namespace is not associated with \"runlevel\" of \"0\" or \"1\";  you will set the selector as follows: \"namespaceSelector\": {   \"matchExpressions\": [     {       \"key\": \"runlevel\",       \"operator\": \"NotIn\",       \"values\": [         \"0\",         \"1\"       ]     }   ] }  If instead you want to only run the webhook on any objects whose namespace is associated with the \"environment\" of \"prod\" or \"staging\"; you will set the selector as follows: \"namespaceSelector\": {   \"matchExpressions\": [     {       \"key\": \"environment\",       \"operator\": \"In\",       \"values\": [         \"prod\",         \"staging\"       ]     }   ] }  See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.  Default to the empty LabelSelector, which matches everything.")
  public V1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }

  public void setNamespaceSelector(V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }

  public V1beta1Webhook rules(List<V1beta1RuleWithOperations> rules) {
    this.rules = rules;
    return this;
  }

  public V1beta1Webhook addRulesItem(V1beta1RuleWithOperations rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<V1beta1RuleWithOperations>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
   * @return rules
  **/
  @ApiModelProperty(value = "Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.")
  public List<V1beta1RuleWithOperations> getRules() {
    return rules;
  }

  public void setRules(List<V1beta1RuleWithOperations> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1Webhook v1beta1Webhook = (V1beta1Webhook) o;
    return Objects.equals(this.clientConfig, v1beta1Webhook.clientConfig) &&
        Objects.equals(this.failurePolicy, v1beta1Webhook.failurePolicy) &&
        Objects.equals(this.name, v1beta1Webhook.name) &&
        Objects.equals(this.namespaceSelector, v1beta1Webhook.namespaceSelector) &&
        Objects.equals(this.rules, v1beta1Webhook.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientConfig, failurePolicy, name, namespaceSelector, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1Webhook {\n");
    
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

