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
 * TimemarkAllOf
 */
@JsonPropertyOrder({
  TimemarkAllOf.JSON_PROPERTY_DOC_REF_NUMBERS,
  TimemarkAllOf.JSON_PROPERTY_SPC_ID,
  TimemarkAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("Timemark_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class TimemarkAllOf {
  public static final String JSON_PROPERTY_DOC_REF_NUMBERS = "DocRefNumbers";
  private String docRefNumbers = "*";

  public static final String JSON_PROPERTY_SPC_ID = "SpcId";
  private String spcId = "";

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  private String discriminatorType;


  public TimemarkAllOf docRefNumbers(String docRefNumbers) {
    
    this.docRefNumbers = docRefNumbers;
    return this;
  }

   /**
   * Document number for this timestamp.
   * @return docRefNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document number for this timestamp.")
  @JsonProperty(JSON_PROPERTY_DOC_REF_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocRefNumbers() {
    return docRefNumbers;
  }


  public void setDocRefNumbers(String docRefNumbers) {
    this.docRefNumbers = docRefNumbers;
  }


  public TimemarkAllOf spcId(String spcId) {
    
    this.spcId = spcId;
    return this;
  }

   /**
   * SignaturePluginConfiguration Id for this timestamp.
   * @return spcId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SignaturePluginConfiguration Id for this timestamp.")
  @JsonProperty(JSON_PROPERTY_SPC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpcId() {
    return spcId;
  }


  public void setSpcId(String spcId) {
    this.spcId = spcId;
  }


  public TimemarkAllOf discriminatorType(String discriminatorType) {
    
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
    TimemarkAllOf timemarkAllOf = (TimemarkAllOf) o;
    return Objects.equals(this.docRefNumbers, timemarkAllOf.docRefNumbers) &&
        Objects.equals(this.spcId, timemarkAllOf.spcId) &&
        Objects.equals(this.discriminatorType, timemarkAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docRefNumbers, spcId, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimemarkAllOf {\n");
    sb.append("    docRefNumbers: ").append(toIndentedString(docRefNumbers)).append("\n");
    sb.append("    spcId: ").append(toIndentedString(spcId)).append("\n");
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
