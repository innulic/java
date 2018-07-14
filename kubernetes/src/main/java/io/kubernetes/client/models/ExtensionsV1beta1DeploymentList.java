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
import io.kubernetes.client.models.ExtensionsV1beta1Deployment;
import io.kubernetes.client.models.V1ListMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeploymentList is a list of Deployments.
 */
@ApiModel(description = "DeploymentList is a list of Deployments.")

public class ExtensionsV1beta1DeploymentList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<ExtensionsV1beta1Deployment> items = new ArrayList<ExtensionsV1beta1Deployment>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ListMeta metadata = null;

  public ExtensionsV1beta1DeploymentList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ExtensionsV1beta1DeploymentList items(List<ExtensionsV1beta1Deployment> items) {
    this.items = items;
    return this;
  }

  public ExtensionsV1beta1DeploymentList addItemsItem(ExtensionsV1beta1Deployment itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items is the list of Deployments.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Items is the list of Deployments.")
  public List<ExtensionsV1beta1Deployment> getItems() {
    return items;
  }

  public void setItems(List<ExtensionsV1beta1Deployment> items) {
    this.items = items;
  }

  public ExtensionsV1beta1DeploymentList kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ExtensionsV1beta1DeploymentList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard list metadata.
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard list metadata.")
  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionsV1beta1DeploymentList extensionsV1beta1DeploymentList = (ExtensionsV1beta1DeploymentList) o;
    return Objects.equals(this.apiVersion, extensionsV1beta1DeploymentList.apiVersion) &&
        Objects.equals(this.items, extensionsV1beta1DeploymentList.items) &&
        Objects.equals(this.kind, extensionsV1beta1DeploymentList.kind) &&
        Objects.equals(this.metadata, extensionsV1beta1DeploymentList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionsV1beta1DeploymentList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

