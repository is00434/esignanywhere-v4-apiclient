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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TypeWriterAnnotation task. Information about predefined typewriter annotation.
 */
@ApiModel(description = "TypeWriterAnnotation task. Information about predefined typewriter annotation.")
@JsonPropertyOrder({
  TypewriterAnnotation.JSON_PROPERTY_PAGE_NUMBER,
  TypewriterAnnotation.JSON_PROPERTY_TEXT_ALIGN,
  TypewriterAnnotation.JSON_PROPERTY_POSITION,
  TypewriterAnnotation.JSON_PROPERTY_DEFAULT_TEXT,
  TypewriterAnnotation.JSON_PROPERTY_TEXT_FORMAT,
  TypewriterAnnotation.JSON_PROPERTY_DEFAULT_TEXT_TYPE,
  TypewriterAnnotation.JSON_PROPERTY_FONT_SETTINGS,
  TypewriterAnnotation.JSON_PROPERTY_IS_EDITABLE_POSITION,
  TypewriterAnnotation.JSON_PROPERTY_IS_EDITABLE_DEFAULT_TEXT,
  TypewriterAnnotation.JSON_PROPERTY_IS_EDITABLE_FONT_SETTINGS,
  TypewriterAnnotation.JSON_PROPERTY_IS_REQUIRED,
  TypewriterAnnotation.JSON_PROPERTY_ID,
  TypewriterAnnotation.JSON_PROPERTY_DISPLAY_NAME,
  TypewriterAnnotation.JSON_PROPERTY_DOC_REF_NUMBER,
  TypewriterAnnotation.JSON_PROPERTY_ADDITIONAL_INFORMATION,
  TypewriterAnnotation.JSON_PROPERTY_BATCH_ID,
  TypewriterAnnotation.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("TypewriterAnnotation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)

public class TypewriterAnnotation extends WorkstepTask {
  public static final String JSON_PROPERTY_PAGE_NUMBER = "PageNumber";
  private Integer pageNumber;

  /**
   * The typewriter annotation text alignment.
   */
  public enum TextAlignEnum {
    LEFT("Left"),
    
    RIGHT("Right"),
    
    CENTER("Center");

    private String value;

    TextAlignEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TextAlignEnum fromValue(String value) {
      for (TextAlignEnum b : TextAlignEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TEXT_ALIGN = "TextAlign";
  private TextAlignEnum textAlign = TextAlignEnum.LEFT;

  public static final String JSON_PROPERTY_POSITION = "Position";
  private Position position;

  public static final String JSON_PROPERTY_DEFAULT_TEXT = "DefaultText";
  private String defaultText;

  public static final String JSON_PROPERTY_TEXT_FORMAT = "TextFormat";
  private String textFormat;

  public static final String JSON_PROPERTY_DEFAULT_TEXT_TYPE = "DefaultTextType";
  private String defaultTextType;

  public static final String JSON_PROPERTY_FONT_SETTINGS = "FontSettings";
  private FontSettings fontSettings;

  public static final String JSON_PROPERTY_IS_EDITABLE_POSITION = "IsEditablePosition";
  private Boolean isEditablePosition = false;

  public static final String JSON_PROPERTY_IS_EDITABLE_DEFAULT_TEXT = "IsEditableDefaultText";
  private Boolean isEditableDefaultText = false;

  public static final String JSON_PROPERTY_IS_EDITABLE_FONT_SETTINGS = "IsEditableFontSettings";
  private Boolean isEditableFontSettings = false;

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
  protected String discriminatorType;


  public TypewriterAnnotation pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * The page number the annotation is on.
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The page number the annotation is on.")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public TypewriterAnnotation textAlign(TextAlignEnum textAlign) {
    
    this.textAlign = textAlign;
    return this;
  }

   /**
   * The typewriter annotation text alignment.
   * @return textAlign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The typewriter annotation text alignment.")
  @JsonProperty(JSON_PROPERTY_TEXT_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TextAlignEnum getTextAlign() {
    return textAlign;
  }


  public void setTextAlign(TextAlignEnum textAlign) {
    this.textAlign = textAlign;
  }


  public TypewriterAnnotation position(Position position) {
    
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


  public TypewriterAnnotation defaultText(String defaultText) {
    
    this.defaultText = defaultText;
    return this;
  }

   /**
   * Default text shown by the client.
   * @return defaultText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default text shown by the client.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultText() {
    return defaultText;
  }


  public void setDefaultText(String defaultText) {
    this.defaultText = defaultText;
  }


  public TypewriterAnnotation textFormat(String textFormat) {
    
    this.textFormat = textFormat;
    return this;
  }

   /**
   * The format of the text. For example if the text should be a date, the date format can be specified. The client can than format the text accordingly.
   * @return textFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The format of the text. For example if the text should be a date, the date format can be specified. The client can than format the text accordingly.")
  @JsonProperty(JSON_PROPERTY_TEXT_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextFormat() {
    return textFormat;
  }


  public void setTextFormat(String textFormat) {
    this.textFormat = textFormat;
  }


  public TypewriterAnnotation defaultTextType(String defaultTextType) {
    
    this.defaultTextType = defaultTextType;
    return this;
  }

   /**
   * The type of the predefined text annotation. If the client is familiar with the type it can display predefined values.
   * @return defaultTextType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the predefined text annotation. If the client is familiar with the type it can display predefined values.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_TEXT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultTextType() {
    return defaultTextType;
  }


  public void setDefaultTextType(String defaultTextType) {
    this.defaultTextType = defaultTextType;
  }


  public TypewriterAnnotation fontSettings(FontSettings fontSettings) {
    
    this.fontSettings = fontSettings;
    return this;
  }

   /**
   * Get fontSettings
   * @return fontSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FONT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FontSettings getFontSettings() {
    return fontSettings;
  }


  public void setFontSettings(FontSettings fontSettings) {
    this.fontSettings = fontSettings;
  }


  public TypewriterAnnotation isEditablePosition(Boolean isEditablePosition) {
    
    this.isEditablePosition = isEditablePosition;
    return this;
  }

   /**
   * Defines if the position can be edited by the client.
   * @return isEditablePosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if the position can be edited by the client.")
  @JsonProperty(JSON_PROPERTY_IS_EDITABLE_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEditablePosition() {
    return isEditablePosition;
  }


  public void setIsEditablePosition(Boolean isEditablePosition) {
    this.isEditablePosition = isEditablePosition;
  }


  public TypewriterAnnotation isEditableDefaultText(Boolean isEditableDefaultText) {
    
    this.isEditableDefaultText = isEditableDefaultText;
    return this;
  }

   /**
   * Specifies if the text can be changed by the user, or if it should be autofilled by the client without user interaction.
   * @return isEditableDefaultText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the text can be changed by the user, or if it should be autofilled by the client without user interaction.")
  @JsonProperty(JSON_PROPERTY_IS_EDITABLE_DEFAULT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEditableDefaultText() {
    return isEditableDefaultText;
  }


  public void setIsEditableDefaultText(Boolean isEditableDefaultText) {
    this.isEditableDefaultText = isEditableDefaultText;
  }


  public TypewriterAnnotation isEditableFontSettings(Boolean isEditableFontSettings) {
    
    this.isEditableFontSettings = isEditableFontSettings;
    return this;
  }

   /**
   * Defines if the &#39;fontSettings&#39; can be edited by the client.
   * @return isEditableFontSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if the 'fontSettings' can be edited by the client.")
  @JsonProperty(JSON_PROPERTY_IS_EDITABLE_FONT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEditableFontSettings() {
    return isEditableFontSettings;
  }


  public void setIsEditableFontSettings(Boolean isEditableFontSettings) {
    this.isEditableFontSettings = isEditableFontSettings;
  }


  public TypewriterAnnotation isRequired(Boolean isRequired) {
    
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


  public TypewriterAnnotation id(String id) {
    
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


  public TypewriterAnnotation displayName(String displayName) {
    
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


  public TypewriterAnnotation docRefNumber(Integer docRefNumber) {
    
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


  public TypewriterAnnotation additionalInformation(String additionalInformation) {
    
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


  public TypewriterAnnotation batchId(String batchId) {
    
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


  public TypewriterAnnotation discriminatorType(String discriminatorType) {
    
    this.discriminatorType = discriminatorType;
    return this;
  }

   /**
   * Property for parsing abstract base classes (polymorphism) in auto generated Swagger code.
   * @return discriminatorType
  **/
  @ApiModelProperty(required = true, value = "Property for parsing abstract base classes (polymorphism) in auto generated Swagger code.")
  @JsonProperty(JSON_PROPERTY_DISCRIMINATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
    TypewriterAnnotation typewriterAnnotation = (TypewriterAnnotation) o;
    return Objects.equals(this.pageNumber, typewriterAnnotation.pageNumber) &&
        Objects.equals(this.textAlign, typewriterAnnotation.textAlign) &&
        Objects.equals(this.position, typewriterAnnotation.position) &&
        Objects.equals(this.defaultText, typewriterAnnotation.defaultText) &&
        Objects.equals(this.textFormat, typewriterAnnotation.textFormat) &&
        Objects.equals(this.defaultTextType, typewriterAnnotation.defaultTextType) &&
        Objects.equals(this.fontSettings, typewriterAnnotation.fontSettings) &&
        Objects.equals(this.isEditablePosition, typewriterAnnotation.isEditablePosition) &&
        Objects.equals(this.isEditableDefaultText, typewriterAnnotation.isEditableDefaultText) &&
        Objects.equals(this.isEditableFontSettings, typewriterAnnotation.isEditableFontSettings) &&
        Objects.equals(this.isRequired, typewriterAnnotation.isRequired) &&
        Objects.equals(this.id, typewriterAnnotation.id) &&
        Objects.equals(this.displayName, typewriterAnnotation.displayName) &&
        Objects.equals(this.docRefNumber, typewriterAnnotation.docRefNumber) &&
        Objects.equals(this.additionalInformation, typewriterAnnotation.additionalInformation) &&
        Objects.equals(this.batchId, typewriterAnnotation.batchId) &&
        Objects.equals(this.discriminatorType, typewriterAnnotation.discriminatorType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, textAlign, position, defaultText, textFormat, defaultTextType, fontSettings, isEditablePosition, isEditableDefaultText, isEditableFontSettings, isRequired, id, displayName, docRefNumber, additionalInformation, batchId, discriminatorType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypewriterAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    defaultText: ").append(toIndentedString(defaultText)).append("\n");
    sb.append("    textFormat: ").append(toIndentedString(textFormat)).append("\n");
    sb.append("    defaultTextType: ").append(toIndentedString(defaultTextType)).append("\n");
    sb.append("    fontSettings: ").append(toIndentedString(fontSettings)).append("\n");
    sb.append("    isEditablePosition: ").append(toIndentedString(isEditablePosition)).append("\n");
    sb.append("    isEditableDefaultText: ").append(toIndentedString(isEditableDefaultText)).append("\n");
    sb.append("    isEditableFontSettings: ").append(toIndentedString(isEditableFontSettings)).append("\n");
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

