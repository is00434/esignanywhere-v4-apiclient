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
 * AttachmentAllOf
 */
@JsonPropertyOrder({
  AttachmentAllOf.JSON_PROPERTY_POSITION_PAGE,
  AttachmentAllOf.JSON_PROPERTY_POSITION,
  AttachmentAllOf.JSON_PROPERTY_SIZE,
  AttachmentAllOf.JSON_PROPERTY_ICON_NAME,
  AttachmentAllOf.JSON_PROPERTY_APPEARANCE_IMAGE_DOCUMENT_ID,
  AttachmentAllOf.JSON_PROPERTY_FILE_NAME,
  AttachmentAllOf.JSON_PROPERTY_IS_REQUIRED,
  AttachmentAllOf.JSON_PROPERTY_ID,
  AttachmentAllOf.JSON_PROPERTY_DISPLAY_NAME,
  AttachmentAllOf.JSON_PROPERTY_DOC_REF_NUMBER,
  AttachmentAllOf.JSON_PROPERTY_ADDITIONAL_INFORMATION,
  AttachmentAllOf.JSON_PROPERTY_BATCH_ID,
  AttachmentAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("Attachment_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class AttachmentAllOf {
  public static final String JSON_PROPERTY_POSITION_PAGE = "PositionPage";
  private Integer positionPage;

  public static final String JSON_PROPERTY_POSITION = "Position";
  private Position position;

  public static final String JSON_PROPERTY_SIZE = "Size";
  private Size size;

  public static final String JSON_PROPERTY_ICON_NAME = "IconName";
  private String iconName;

  public static final String JSON_PROPERTY_APPEARANCE_IMAGE_DOCUMENT_ID = "AppearanceImageDocumentId";
  private String appearanceImageDocumentId;

  public static final String JSON_PROPERTY_FILE_NAME = "FileName";
  private String fileName;

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


  public AttachmentAllOf positionPage(Integer positionPage) {
    
    this.positionPage = positionPage;
    return this;
  }

   /**
   * Page number for the attachment.
   * @return positionPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page number for the attachment.")
  @JsonProperty(JSON_PROPERTY_POSITION_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPositionPage() {
    return positionPage;
  }


  public void setPositionPage(Integer positionPage) {
    this.positionPage = positionPage;
  }


  public AttachmentAllOf position(Position position) {
    
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


  public AttachmentAllOf size(Size size) {
    
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


  public AttachmentAllOf iconName(String iconName) {
    
    this.iconName = iconName;
    return this;
  }

   /**
   * The name of the adobe default icon to be displayed. Values that should be displayed by most viewers are: &#39;Graph&#39;, &#39;PushPin&#39;, &#39;Paperclip&#39; and &#39;Tag&#39;. Others may be implemented by the pdf viewer. Default value: &#39;Paperclip&#39; if no iconName or appearance image is given.
   * @return iconName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the adobe default icon to be displayed. Values that should be displayed by most viewers are: 'Graph', 'PushPin', 'Paperclip' and 'Tag'. Others may be implemented by the pdf viewer. Default value: 'Paperclip' if no iconName or appearance image is given.")
  @JsonProperty(JSON_PROPERTY_ICON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIconName() {
    return iconName;
  }


  public void setIconName(String iconName) {
    this.iconName = iconName;
  }


  public AttachmentAllOf appearanceImageDocumentId(String appearanceImageDocumentId) {
    
    this.appearanceImageDocumentId = appearanceImageDocumentId;
    return this;
  }

   /**
   * The document id of the image used for the appearance. If set this appearance overwrites the icon.
   * @return appearanceImageDocumentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The document id of the image used for the appearance. If set this appearance overwrites the icon.")
  @JsonProperty(JSON_PROPERTY_APPEARANCE_IMAGE_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppearanceImageDocumentId() {
    return appearanceImageDocumentId;
  }


  public void setAppearanceImageDocumentId(String appearanceImageDocumentId) {
    this.appearanceImageDocumentId = appearanceImageDocumentId;
  }


   /**
   * A hint for the client to name the attachment, but the name has to be set by the client.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A hint for the client to name the attachment, but the name has to be set by the client.")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }




  public AttachmentAllOf isRequired(Boolean isRequired) {
    
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


  public AttachmentAllOf id(String id) {
    
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


  public AttachmentAllOf displayName(String displayName) {
    
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


  public AttachmentAllOf docRefNumber(Integer docRefNumber) {
    
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


  public AttachmentAllOf additionalInformation(String additionalInformation) {
    
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


  public AttachmentAllOf batchId(String batchId) {
    
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


  public AttachmentAllOf discriminatorType(String discriminatorType) {
    
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
    AttachmentAllOf attachmentAllOf = (AttachmentAllOf) o;
    return Objects.equals(this.positionPage, attachmentAllOf.positionPage) &&
        Objects.equals(this.position, attachmentAllOf.position) &&
        Objects.equals(this.size, attachmentAllOf.size) &&
        Objects.equals(this.iconName, attachmentAllOf.iconName) &&
        Objects.equals(this.appearanceImageDocumentId, attachmentAllOf.appearanceImageDocumentId) &&
        Objects.equals(this.fileName, attachmentAllOf.fileName) &&
        Objects.equals(this.isRequired, attachmentAllOf.isRequired) &&
        Objects.equals(this.id, attachmentAllOf.id) &&
        Objects.equals(this.displayName, attachmentAllOf.displayName) &&
        Objects.equals(this.docRefNumber, attachmentAllOf.docRefNumber) &&
        Objects.equals(this.additionalInformation, attachmentAllOf.additionalInformation) &&
        Objects.equals(this.batchId, attachmentAllOf.batchId) &&
        Objects.equals(this.discriminatorType, attachmentAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionPage, position, size, iconName, appearanceImageDocumentId, fileName, isRequired, id, displayName, docRefNumber, additionalInformation, batchId, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentAllOf {\n");
    sb.append("    positionPage: ").append(toIndentedString(positionPage)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    iconName: ").append(toIndentedString(iconName)).append("\n");
    sb.append("    appearanceImageDocumentId: ").append(toIndentedString(appearanceImageDocumentId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

