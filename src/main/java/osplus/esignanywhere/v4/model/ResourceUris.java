/*
 * eSignAnywhere.Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: V4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package osplus.esignanywhere.v4.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Rescource uris.
 */
@ApiModel(description = "Rescource uris.")
@JsonPropertyOrder({
  ResourceUris.JSON_PROPERTY_DELEGATION_URI,
  ResourceUris.JSON_PROPERTY_SIGNATURE_IMAGES_URI
})
@JsonTypeName("ResourceUris")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class ResourceUris {
  public static final String JSON_PROPERTY_DELEGATION_URI = "DelegationUri";
  private String delegationUri;

  public static final String JSON_PROPERTY_SIGNATURE_IMAGES_URI = "SignatureImagesUri";
  private String signatureImagesUri;


  public ResourceUris delegationUri(String delegationUri) {
    
    this.delegationUri = delegationUri;
    return this;
  }

   /**
   * Uri which will be used to retreive form data for a client.
   * @return delegationUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uri which will be used to retreive form data for a client.")
  @JsonProperty(JSON_PROPERTY_DELEGATION_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDelegationUri() {
    return delegationUri;
  }


  public void setDelegationUri(String delegationUri) {
    this.delegationUri = delegationUri;
  }


  public ResourceUris signatureImagesUri(String signatureImagesUri) {
    
    this.signatureImagesUri = signatureImagesUri;
    return this;
  }

   /**
   * Urif of the signature images.
   * @return signatureImagesUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Urif of the signature images.")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_IMAGES_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignatureImagesUri() {
    return signatureImagesUri;
  }


  public void setSignatureImagesUri(String signatureImagesUri) {
    this.signatureImagesUri = signatureImagesUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceUris resourceUris = (ResourceUris) o;
    return Objects.equals(this.delegationUri, resourceUris.delegationUri) &&
        Objects.equals(this.signatureImagesUri, resourceUris.signatureImagesUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegationUri, signatureImagesUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceUris {\n");
    sb.append("    delegationUri: ").append(toIndentedString(delegationUri)).append("\n");
    sb.append("    signatureImagesUri: ").append(toIndentedString(signatureImagesUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

