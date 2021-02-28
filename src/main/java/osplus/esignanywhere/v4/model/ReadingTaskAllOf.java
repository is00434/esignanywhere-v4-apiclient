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
 * ReadingTaskAllOf
 */
@JsonPropertyOrder({
  ReadingTaskAllOf.JSON_PROPERTY_POSITION_PAGE,
  ReadingTaskAllOf.JSON_PROPERTY_ALL_PAGES,
  ReadingTaskAllOf.JSON_PROPERTY_ALL_DOCUMENTS,
  ReadingTaskAllOf.JSON_PROPERTY_POSITION,
  ReadingTaskAllOf.JSON_PROPERTY_SIZE,
  ReadingTaskAllOf.JSON_PROPERTY_IS_REQUIRED,
  ReadingTaskAllOf.JSON_PROPERTY_ID,
  ReadingTaskAllOf.JSON_PROPERTY_DISPLAY_NAME,
  ReadingTaskAllOf.JSON_PROPERTY_DOC_REF_NUMBER,
  ReadingTaskAllOf.JSON_PROPERTY_ADDITIONAL_INFORMATION,
  ReadingTaskAllOf.JSON_PROPERTY_BATCH_ID,
  ReadingTaskAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("ReadingTask_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class ReadingTaskAllOf {
  public static final String JSON_PROPERTY_POSITION_PAGE = "PositionPage";
  private Integer positionPage;

  public static final String JSON_PROPERTY_ALL_PAGES = "AllPages";
  private Boolean allPages;

  public static final String JSON_PROPERTY_ALL_DOCUMENTS = "AllDocuments";
  private Boolean allDocuments;

  public static final String JSON_PROPERTY_POSITION = "Position";
  private Position position;

  public static final String JSON_PROPERTY_SIZE = "Size";
  private Size size;

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


  public ReadingTaskAllOf positionPage(Integer positionPage) {
    
    this.positionPage = positionPage;
    return this;
  }

   /**
   * Page number that has to be read.
   * @return positionPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page number that has to be read.")
  @JsonProperty(JSON_PROPERTY_POSITION_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPositionPage() {
    return positionPage;
  }


  public void setPositionPage(Integer positionPage) {
    this.positionPage = positionPage;
  }


  public ReadingTaskAllOf allPages(Boolean allPages) {
    
    this.allPages = allPages;
    return this;
  }

   /**
   * Defines if all pages in the document have to be read.
   * @return allPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if all pages in the document have to be read.")
  @JsonProperty(JSON_PROPERTY_ALL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllPages() {
    return allPages;
  }


  public void setAllPages(Boolean allPages) {
    this.allPages = allPages;
  }


  public ReadingTaskAllOf allDocuments(Boolean allDocuments) {
    
    this.allDocuments = allDocuments;
    return this;
  }

   /**
   * Defines if all documents have to be read.
   * @return allDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if all documents have to be read.")
  @JsonProperty(JSON_PROPERTY_ALL_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllDocuments() {
    return allDocuments;
  }


  public void setAllDocuments(Boolean allDocuments) {
    this.allDocuments = allDocuments;
  }


  public ReadingTaskAllOf position(Position position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Position getPosition() {
    return position;
  }


  public void setPosition(Position position) {
    this.position = position;
  }


  public ReadingTaskAllOf size(Size size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Size getSize() {
    return size;
  }


  public void setSize(Size size) {
    this.size = size;
  }


  public ReadingTaskAllOf isRequired(Boolean isRequired) {
    
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


  public ReadingTaskAllOf id(String id) {
    
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


  public ReadingTaskAllOf displayName(String displayName) {
    
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


  public ReadingTaskAllOf docRefNumber(Integer docRefNumber) {
    
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


  public ReadingTaskAllOf additionalInformation(String additionalInformation) {
    
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


  public ReadingTaskAllOf batchId(String batchId) {
    
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


  public ReadingTaskAllOf discriminatorType(String discriminatorType) {
    
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
    ReadingTaskAllOf readingTaskAllOf = (ReadingTaskAllOf) o;
    return Objects.equals(this.positionPage, readingTaskAllOf.positionPage) &&
        Objects.equals(this.allPages, readingTaskAllOf.allPages) &&
        Objects.equals(this.allDocuments, readingTaskAllOf.allDocuments) &&
        Objects.equals(this.position, readingTaskAllOf.position) &&
        Objects.equals(this.size, readingTaskAllOf.size) &&
        Objects.equals(this.isRequired, readingTaskAllOf.isRequired) &&
        Objects.equals(this.id, readingTaskAllOf.id) &&
        Objects.equals(this.displayName, readingTaskAllOf.displayName) &&
        Objects.equals(this.docRefNumber, readingTaskAllOf.docRefNumber) &&
        Objects.equals(this.additionalInformation, readingTaskAllOf.additionalInformation) &&
        Objects.equals(this.batchId, readingTaskAllOf.batchId) &&
        Objects.equals(this.discriminatorType, readingTaskAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionPage, allPages, allDocuments, position, size, isRequired, id, displayName, docRefNumber, additionalInformation, batchId, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadingTaskAllOf {\n");
    sb.append("    positionPage: ").append(toIndentedString(positionPage)).append("\n");
    sb.append("    allPages: ").append(toIndentedString(allPages)).append("\n");
    sb.append("    allDocuments: ").append(toIndentedString(allDocuments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

