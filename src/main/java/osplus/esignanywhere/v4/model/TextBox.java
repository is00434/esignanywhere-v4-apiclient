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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TextBox form.
 */
@ApiModel(description = "TextBox form.")
@JsonPropertyOrder({
  TextBox.JSON_PROPERTY_IS_SCROLL_ALLOWED,
  TextBox.JSON_PROPERTY_IS_COMB,
  TextBox.JSON_PROPERTY_VALUE,
  TextBox.JSON_PROPERTY_MAX_LENGTH,
  TextBox.JSON_PROPERTY_IS_MULTI_LINE,
  TextBox.JSON_PROPERTY_IS_PASSWORD,
  TextBox.JSON_PROPERTY_IS_FILE_SELECT,
  TextBox.JSON_PROPERTY_FONT_SETTINGS,
  TextBox.JSON_PROPERTY_FORM_FIELD_VALIDATION,
  TextBox.JSON_PROPERTY_IS_REQUIRED,
  TextBox.JSON_PROPERTY_ID,
  TextBox.JSON_PROPERTY_POSITION_PAGE,
  TextBox.JSON_PROPERTY_DOC_REF_NUMBER,
  TextBox.JSON_PROPERTY_POSITION,
  TextBox.JSON_PROPERTY_SIZE,
  TextBox.JSON_PROPERTY_IS_HIDDEN,
  TextBox.JSON_PROPERTY_EXPORT_VALUE,
  TextBox.JSON_PROPERTY_DESCRIPTION,
  TextBox.JSON_PROPERTY_KEEP_EXISTING_VALUE,
  TextBox.JSON_PROPERTY_CUSTOM_ORDER,
  TextBox.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("TextBox")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)

public class TextBox extends Form {
  public static final String JSON_PROPERTY_IS_SCROLL_ALLOWED = "IsScrollAllowed";
  private Boolean isScrollAllowed = false;

  public static final String JSON_PROPERTY_IS_COMB = "IsComb";
  private Boolean isComb = false;

  public static final String JSON_PROPERTY_VALUE = "Value";
  private String value;

  public static final String JSON_PROPERTY_MAX_LENGTH = "MaxLength";
  private Integer maxLength = 0;

  public static final String JSON_PROPERTY_IS_MULTI_LINE = "IsMultiLine";
  private Boolean isMultiLine = false;

  public static final String JSON_PROPERTY_IS_PASSWORD = "IsPassword";
  private Boolean isPassword = false;

  public static final String JSON_PROPERTY_IS_FILE_SELECT = "IsFileSelect";
  private Boolean isFileSelect = false;

  public static final String JSON_PROPERTY_FONT_SETTINGS = "FontSettings";
  private FontSettingsAdvanced fontSettings;

  public static final String JSON_PROPERTY_FORM_FIELD_VALIDATION = "FormFieldValidation";
  private FormFieldValidation formFieldValidation;

  public static final String JSON_PROPERTY_IS_REQUIRED = "IsRequired";
  private Boolean isRequired = false;

  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_POSITION_PAGE = "PositionPage";
  private Integer positionPage = 1;

  public static final String JSON_PROPERTY_DOC_REF_NUMBER = "DocRefNumber";
  private Integer docRefNumber;

  public static final String JSON_PROPERTY_POSITION = "Position";
  private Position position;

  public static final String JSON_PROPERTY_SIZE = "Size";
  private Size size;

  public static final String JSON_PROPERTY_IS_HIDDEN = "IsHidden";
  private Boolean isHidden = false;

  public static final String JSON_PROPERTY_EXPORT_VALUE = "ExportValue";
  private String exportValue;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_KEEP_EXISTING_VALUE = "KeepExistingValue";
  private Boolean keepExistingValue;

  public static final String JSON_PROPERTY_CUSTOM_ORDER = "CustomOrder";
  private Integer customOrder;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  protected String discriminatorType;


  public TextBox isScrollAllowed(Boolean isScrollAllowed) {
    
    this.isScrollAllowed = isScrollAllowed;
    return this;
  }

   /**
   * Define if scrolling is allowed.
   * @return isScrollAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if scrolling is allowed.")
  @JsonProperty(JSON_PROPERTY_IS_SCROLL_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsScrollAllowed() {
    return isScrollAllowed;
  }


  public void setIsScrollAllowed(Boolean isScrollAllowed) {
    this.isScrollAllowed = isScrollAllowed;
  }


  public TextBox isComb(Boolean isComb) {
    
    this.isComb = isComb;
    return this;
  }

   /**
   * Define if the field is automatically divided into as many equally spaced positions, or combs, as the value of &#39;MaxLength&#39;, and the text is laid out into those combs.
   * @return isComb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if the field is automatically divided into as many equally spaced positions, or combs, as the value of 'MaxLength', and the text is laid out into those combs.")
  @JsonProperty(JSON_PROPERTY_IS_COMB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsComb() {
    return isComb;
  }


  public void setIsComb(Boolean isComb) {
    this.isComb = isComb;
  }


  public TextBox value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value of the textbox.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the textbox.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public TextBox maxLength(Integer maxLength) {
    
    this.maxLength = maxLength;
    return this;
  }

   /**
   * The maximum of characters in the textBox. -1 means it is not limited.
   * @return maxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum of characters in the textBox. -1 means it is not limited.")
  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxLength() {
    return maxLength;
  }


  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public TextBox isMultiLine(Boolean isMultiLine) {
    
    this.isMultiLine = isMultiLine;
    return this;
  }

   /**
   * Define if the textbox is multiline.
   * @return isMultiLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if the textbox is multiline.")
  @JsonProperty(JSON_PROPERTY_IS_MULTI_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMultiLine() {
    return isMultiLine;
  }


  public void setIsMultiLine(Boolean isMultiLine) {
    this.isMultiLine = isMultiLine;
  }


  public TextBox isPassword(Boolean isPassword) {
    
    this.isPassword = isPassword;
    return this;
  }

   /**
   * Define if the textbox is a password.
   * @return isPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if the textbox is a password.")
  @JsonProperty(JSON_PROPERTY_IS_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPassword() {
    return isPassword;
  }


  public void setIsPassword(Boolean isPassword) {
    this.isPassword = isPassword;
  }


  public TextBox isFileSelect(Boolean isFileSelect) {
    
    this.isFileSelect = isFileSelect;
    return this;
  }

   /**
   * Define if it is a file selection.
   * @return isFileSelect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if it is a file selection.")
  @JsonProperty(JSON_PROPERTY_IS_FILE_SELECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFileSelect() {
    return isFileSelect;
  }


  public void setIsFileSelect(Boolean isFileSelect) {
    this.isFileSelect = isFileSelect;
  }


  public TextBox fontSettings(FontSettingsAdvanced fontSettings) {
    
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

  public FontSettingsAdvanced getFontSettings() {
    return fontSettings;
  }


  public void setFontSettings(FontSettingsAdvanced fontSettings) {
    this.fontSettings = fontSettings;
  }


  public TextBox formFieldValidation(FormFieldValidation formFieldValidation) {
    
    this.formFieldValidation = formFieldValidation;
    return this;
  }

   /**
   * Get formFieldValidation
   * @return formFieldValidation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORM_FIELD_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormFieldValidation getFormFieldValidation() {
    return formFieldValidation;
  }


  public void setFormFieldValidation(FormFieldValidation formFieldValidation) {
    this.formFieldValidation = formFieldValidation;
  }


  public TextBox isRequired(Boolean isRequired) {
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Defines if the checkbox is required,
   * @return isRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if the checkbox is required,")
  @JsonProperty(JSON_PROPERTY_IS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public TextBox id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier for the form.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier for the form.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TextBox positionPage(Integer positionPage) {
    
    this.positionPage = positionPage;
    return this;
  }

   /**
   * Page number for the form.
   * @return positionPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page number for the form.")
  @JsonProperty(JSON_PROPERTY_POSITION_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPositionPage() {
    return positionPage;
  }


  public void setPositionPage(Integer positionPage) {
    this.positionPage = positionPage;
  }


  public TextBox docRefNumber(Integer docRefNumber) {
    
    this.docRefNumber = docRefNumber;
    return this;
  }

   /**
   * Document number for the form.
   * @return docRefNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document number for the form.")
  @JsonProperty(JSON_PROPERTY_DOC_REF_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDocRefNumber() {
    return docRefNumber;
  }


  public void setDocRefNumber(Integer docRefNumber) {
    this.docRefNumber = docRefNumber;
  }


  public TextBox position(Position position) {
    
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


  public TextBox size(Size size) {
    
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


  public TextBox isHidden(Boolean isHidden) {
    
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Define if it is hidden.
   * @return isHidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if it is hidden.")
  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsHidden() {
    return isHidden;
  }


  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  public TextBox exportValue(String exportValue) {
    
    this.exportValue = exportValue;
    return this;
  }

   /**
   * The export value of the form field.
   * @return exportValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The export value of the form field.")
  @JsonProperty(JSON_PROPERTY_EXPORT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExportValue() {
    return exportValue;
  }


  public void setExportValue(String exportValue) {
    this.exportValue = exportValue;
  }


  public TextBox description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description to provide details about the element.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description to provide details about the element.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TextBox keepExistingValue(Boolean keepExistingValue) {
    
    this.keepExistingValue = keepExistingValue;
    return this;
  }

   /**
   * If true, form value from Pdf is used.
   * @return keepExistingValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, form value from Pdf is used.")
  @JsonProperty(JSON_PROPERTY_KEEP_EXISTING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKeepExistingValue() {
    return keepExistingValue;
  }


  public void setKeepExistingValue(Boolean keepExistingValue) {
    this.keepExistingValue = keepExistingValue;
  }


   /**
   * Increasing order number. Can be used for tabbing through the form elements.
   * @return customOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Increasing order number. Can be used for tabbing through the form elements.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCustomOrder() {
    return customOrder;
  }




  public TextBox discriminatorType(String discriminatorType) {
    
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
    TextBox textBox = (TextBox) o;
    return Objects.equals(this.isScrollAllowed, textBox.isScrollAllowed) &&
        Objects.equals(this.isComb, textBox.isComb) &&
        Objects.equals(this.value, textBox.value) &&
        Objects.equals(this.maxLength, textBox.maxLength) &&
        Objects.equals(this.isMultiLine, textBox.isMultiLine) &&
        Objects.equals(this.isPassword, textBox.isPassword) &&
        Objects.equals(this.isFileSelect, textBox.isFileSelect) &&
        Objects.equals(this.fontSettings, textBox.fontSettings) &&
        Objects.equals(this.formFieldValidation, textBox.formFieldValidation) &&
        Objects.equals(this.isRequired, textBox.isRequired) &&
        Objects.equals(this.id, textBox.id) &&
        Objects.equals(this.positionPage, textBox.positionPage) &&
        Objects.equals(this.docRefNumber, textBox.docRefNumber) &&
        Objects.equals(this.position, textBox.position) &&
        Objects.equals(this.size, textBox.size) &&
        Objects.equals(this.isHidden, textBox.isHidden) &&
        Objects.equals(this.exportValue, textBox.exportValue) &&
        Objects.equals(this.description, textBox.description) &&
        Objects.equals(this.keepExistingValue, textBox.keepExistingValue) &&
        Objects.equals(this.customOrder, textBox.customOrder) &&
        Objects.equals(this.discriminatorType, textBox.discriminatorType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isScrollAllowed, isComb, value, maxLength, isMultiLine, isPassword, isFileSelect, fontSettings, formFieldValidation, isRequired, id, positionPage, docRefNumber, position, size, isHidden, exportValue, description, keepExistingValue, customOrder, discriminatorType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBox {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isScrollAllowed: ").append(toIndentedString(isScrollAllowed)).append("\n");
    sb.append("    isComb: ").append(toIndentedString(isComb)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    isMultiLine: ").append(toIndentedString(isMultiLine)).append("\n");
    sb.append("    isPassword: ").append(toIndentedString(isPassword)).append("\n");
    sb.append("    isFileSelect: ").append(toIndentedString(isFileSelect)).append("\n");
    sb.append("    fontSettings: ").append(toIndentedString(fontSettings)).append("\n");
    sb.append("    formFieldValidation: ").append(toIndentedString(formFieldValidation)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    positionPage: ").append(toIndentedString(positionPage)).append("\n");
    sb.append("    docRefNumber: ").append(toIndentedString(docRefNumber)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    exportValue: ").append(toIndentedString(exportValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keepExistingValue: ").append(toIndentedString(keepExistingValue)).append("\n");
    sb.append("    customOrder: ").append(toIndentedString(customOrder)).append("\n");
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

