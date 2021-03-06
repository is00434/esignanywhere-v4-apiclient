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

import io.swagger.annotations.ApiModelProperty;

/**
 * AutomaticSignatureAllOf
 */
@JsonPropertyOrder({
  AutomaticSignatureAllOf.JSON_PROPERTY_SIG_ID,
  AutomaticSignatureAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("AutomaticSignature_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class AutomaticSignatureAllOf {
  public static final String JSON_PROPERTY_SIG_ID = "SigId";
  private String sigId;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  private String discriminatorType;


  public AutomaticSignatureAllOf sigId(String sigId) {
    
    this.sigId = sigId;
    return this;
  }

   /**
   * Signature Id from automatic signature.
   * @return sigId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Signature Id from automatic signature.")
  @JsonProperty(JSON_PROPERTY_SIG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSigId() {
    return sigId;
  }


  public void setSigId(String sigId) {
    this.sigId = sigId;
  }


  public AutomaticSignatureAllOf discriminatorType(String discriminatorType) {
    
    this.discriminatorType = discriminatorType;
    return this;
  }

   /**
   * DiscriminatorType.
   * @return discriminatorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DiscriminatorType.")
  @JsonProperty(JSON_PROPERTY_DISCRIMINATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDiscriminatorType() {
    return discriminatorType;
  }


  public void setDiscriminatorType(String discriminatorType) {
    this.discriminatorType = discriminatorType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomaticSignatureAllOf automaticSignatureAllOf = (AutomaticSignatureAllOf) o;
    return Objects.equals(this.sigId, automaticSignatureAllOf.sigId) &&
        Objects.equals(this.discriminatorType, automaticSignatureAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sigId, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomaticSignatureAllOf {\n");
    sb.append("    sigId: ").append(toIndentedString(sigId)).append("\n");
    sb.append("    discriminatorType: ").append(toIndentedString(discriminatorType)).append("\n");
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

