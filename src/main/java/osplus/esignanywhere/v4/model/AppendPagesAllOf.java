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
 * AppendPagesAllOf
 */
@JsonPropertyOrder({
  AppendPagesAllOf.JSON_PROPERTY_IS_REQUIRED,
  AppendPagesAllOf.JSON_PROPERTY_ID,
  AppendPagesAllOf.JSON_PROPERTY_DISPLAY_NAME,
  AppendPagesAllOf.JSON_PROPERTY_DOC_REF_NUMBER,
  AppendPagesAllOf.JSON_PROPERTY_ADDITIONAL_INFORMATION,
  AppendPagesAllOf.JSON_PROPERTY_BATCH_ID,
  AppendPagesAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("AppendPages_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class AppendPagesAllOf {
  public static final String JSON_PROPERTY_IS_REQUIRED = "IsRequired";
  private Boolean isRequired = false;

  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "DisplayName";
  private String displayName;

  public static final String JSON_PROPERTY_DOC_REF_NUMBER = "DocRefNumber";
  private Integer docRefNumber;

  public static final String JSON_PROPERTY_ADDITIONAL_INFORMATION = "AdditionalInformation";
  private String additionalInformation;

  public static final String JSON_PROPERTY_BATCH_ID = "BatchId";
  private String batchId;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  private String discriminatorType;


  public AppendPagesAllOf isRequired(Boolean isRequired) {
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Define if the task is required.
   * @return isRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if the task is required.")
  @JsonProperty(JSON_PROPERTY_IS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public AppendPagesAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Define the identifier for the task.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define the identifier for the task.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AppendPagesAllOf displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Define the name to be displayed.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define the name to be displayed.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public AppendPagesAllOf docRefNumber(Integer docRefNumber) {
    
    this.docRefNumber = docRefNumber;
    return this;
  }

   /**
   * Document number of the task.
   * @return docRefNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document number of the task.")
  @JsonProperty(JSON_PROPERTY_DOC_REF_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDocRefNumber() {
    return docRefNumber;
  }


  public void setDocRefNumber(Integer docRefNumber) {
    this.docRefNumber = docRefNumber;
  }


  public AppendPagesAllOf additionalInformation(String additionalInformation) {
    
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Additional information for the client
   * @return additionalInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information for the client")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalInformation() {
    return additionalInformation;
  }


  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  public AppendPagesAllOf batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * Defines multiple tasks which can be executed as a batch (e.g. signatures which accept same data).
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines multiple tasks which can be executed as a batch (e.g. signatures which accept same data).")
  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  public AppendPagesAllOf discriminatorType(String discriminatorType) {
    
    this.discriminatorType = discriminatorType;
    return this;
  }

   /**
   * Property for parsing abstract base classes (polymorphism) in auto generated Swagger code.
   * @return discriminatorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Property for parsing abstract base classes (polymorphism) in auto generated Swagger code.")
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
    AppendPagesAllOf appendPagesAllOf = (AppendPagesAllOf) o;
    return Objects.equals(this.isRequired, appendPagesAllOf.isRequired) &&
        Objects.equals(this.id, appendPagesAllOf.id) &&
        Objects.equals(this.displayName, appendPagesAllOf.displayName) &&
        Objects.equals(this.docRefNumber, appendPagesAllOf.docRefNumber) &&
        Objects.equals(this.additionalInformation, appendPagesAllOf.additionalInformation) &&
        Objects.equals(this.batchId, appendPagesAllOf.batchId) &&
        Objects.equals(this.discriminatorType, appendPagesAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRequired, id, displayName, docRefNumber, additionalInformation, batchId, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendPagesAllOf {\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    docRefNumber: ").append(toIndentedString(docRefNumber)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
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

