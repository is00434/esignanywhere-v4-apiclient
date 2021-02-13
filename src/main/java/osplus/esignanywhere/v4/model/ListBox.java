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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ListBox form.
 */
@ApiModel(description = "ListBox form.")
@JsonPropertyOrder({
  ListBox.JSON_PROPERTY_ITEMS,
  ListBox.JSON_PROPERTY_FONT_SETTINGS,
  ListBox.JSON_PROPERTY_IS_REQUIRED,
  ListBox.JSON_PROPERTY_ID,
  ListBox.JSON_PROPERTY_POSITION_PAGE,
  ListBox.JSON_PROPERTY_DOC_REF_NUMBER,
  ListBox.JSON_PROPERTY_POSITION,
  ListBox.JSON_PROPERTY_SIZE,
  ListBox.JSON_PROPERTY_IS_HIDDEN,
  ListBox.JSON_PROPERTY_EXPORT_VALUE,
  ListBox.JSON_PROPERTY_DESCRIPTION,
  ListBox.JSON_PROPERTY_KEEP_EXISTING_VALUE,
  ListBox.JSON_PROPERTY_CUSTOM_ORDER,
  ListBox.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("ListBox")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)

public class ListBox extends Form {
  public static final String JSON_PROPERTY_ITEMS = "Items";
  private List<BoxItem> items = null;

  public static final String JSON_PROPERTY_FONT_SETTINGS = "FontSettings";
  private FontSettingsAdvanced fontSettings;

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


  public ListBox items(List<BoxItem> items) {
    
    this.items = items;
    return this;
  }

  public ListBox addItemsItem(BoxItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<BoxItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Collection of items in the listbox.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of items in the listbox.")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BoxItem> getItems() {
    return items;
  }


  public void setItems(List<BoxItem> items) {
    this.items = items;
  }


  public ListBox fontSettings(FontSettingsAdvanced fontSettings) {
    
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


  public ListBox isRequired(Boolean isRequired) {
    
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


  public ListBox id(String id) {
    
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


  public ListBox positionPage(Integer positionPage) {
    
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


  public ListBox docRefNumber(Integer docRefNumber) {
    
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


  public ListBox position(Position position) {
    
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


  public ListBox size(Size size) {
    
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


  public ListBox isHidden(Boolean isHidden) {
    
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


  public ListBox exportValue(String exportValue) {
    
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


  public ListBox description(String description) {
    
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


  public ListBox keepExistingValue(Boolean keepExistingValue) {
    
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




  public ListBox discriminatorType(String discriminatorType) {
    
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
    ListBox listBox = (ListBox) o;
    return Objects.equals(this.items, listBox.items) &&
        Objects.equals(this.fontSettings, listBox.fontSettings) &&
        Objects.equals(this.isRequired, listBox.isRequired) &&
        Objects.equals(this.id, listBox.id) &&
        Objects.equals(this.positionPage, listBox.positionPage) &&
        Objects.equals(this.docRefNumber, listBox.docRefNumber) &&
        Objects.equals(this.position, listBox.position) &&
        Objects.equals(this.size, listBox.size) &&
        Objects.equals(this.isHidden, listBox.isHidden) &&
        Objects.equals(this.exportValue, listBox.exportValue) &&
        Objects.equals(this.description, listBox.description) &&
        Objects.equals(this.keepExistingValue, listBox.keepExistingValue) &&
        Objects.equals(this.customOrder, listBox.customOrder) &&
        Objects.equals(this.discriminatorType, listBox.discriminatorType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, fontSettings, isRequired, id, positionPage, docRefNumber, position, size, isHidden, exportValue, description, keepExistingValue, customOrder, discriminatorType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBox {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    fontSettings: ").append(toIndentedString(fontSettings)).append("\n");
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

