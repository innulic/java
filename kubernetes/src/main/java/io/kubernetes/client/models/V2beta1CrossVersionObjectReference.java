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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CrossVersionObjectReference contains enough information to let you identify the referred resource.
 */
@ApiModel(description = "CrossVersionObjectReference contains enough information to let you identify the referred resource.")

public class V2beta1CrossVersionObjectReference {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  public V2beta1CrossVersionObjectReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * API version of the referent
   * @return apiVersion
  **/
  @ApiModelProperty(value = "API version of the referent")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V2beta1CrossVersionObjectReference kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds\&quot;
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds\"")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V2beta1CrossVersionObjectReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1CrossVersionObjectReference v2beta1CrossVersionObjectReference = (V2beta1CrossVersionObjectReference) o;
    return Objects.equals(this.apiVersion, v2beta1CrossVersionObjectReference.apiVersion) &&
        Objects.equals(this.kind, v2beta1CrossVersionObjectReference.kind) &&
        Objects.equals(this.name, v2beta1CrossVersionObjectReference.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1CrossVersionObjectReference {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

