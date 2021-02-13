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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * AddFormFieldChoiceItemsDescriptor
 */
@JsonPropertyOrder({
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_DISCRIMINATOR_TYPE,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_ITEMS,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_TEXT_COLOR,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_FONT_SIZE,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_FONT_NAME,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_BOLD,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_ITALIC,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_TEXT_ALIGN,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_NAME,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_READ_ONLY,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_REQUIRED,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_X,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_Y,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_WIDTH,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_HEIGHT,
  AddFormFieldChoiceItemsDescriptor.JSON_PROPERTY_PAGE
})
@JsonTypeName("AddFormFieldChoiceItemsDescriptor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AddComboBoxFormFieldDescriptor.class, name = "AddComboBoxFormFieldDescriptor"),
  @JsonSubTypes.Type(value = AddListBoxFormFieldDescriptor.class, name = "AddListBoxFormFieldDescriptor"),
})

public class AddFormFieldChoiceItemsDescriptor extends AddFormFieldDescriptor {
  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  protected String discriminatorType;

  public static final String JSON_PROPERTY_ITEMS = "Items";
  private List<AddFormFieldChoiceItemDescriptor> items = null;

  public static final String JSON_PROPERTY_TEXT_COLOR = "TextColor";
  private String textColor = "Red";

  public static final String JSON_PROPERTY_FONT_SIZE = "FontSize";
  private Double fontSize;

  public static final String JSON_PROPERTY_FONT_NAME = "FontName";
  private String fontName;

  public static final String JSON_PROPERTY_BOLD = "Bold";
  private Boolean bold = false;

  public static final String JSON_PROPERTY_ITALIC = "Italic";
  private Boolean italic = false;

  /**
   * Text alignment. Default is left.
   */
  public enum TextAlignEnum {
    LEFT("Left"),
    
    CENTER("Center"),
    
    RIGHT("Right");

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

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_READ_ONLY = "ReadOnly";
  private Boolean readOnly = false;

  public static final String JSON_PROPERTY_REQUIRED = "Required";
  private Boolean required = false;

  public static final String JSON_PROPERTY_X = "X";
  private Double X;

  public static final String JSON_PROPERTY_Y = "Y";
  private Double Y;

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Double width;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Double height;

  public static final String JSON_PROPERTY_PAGE = "Page";
  private Integer page;


  public AddFormFieldChoiceItemsDescriptor discriminatorType(String discriminatorType) {
    
    this.discriminatorType = discriminatorType;
    return this;
  }

   /**
   * Get discriminatorType
   * @return discriminatorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISCRIMINATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDiscriminatorType() {
    return discriminatorType;
  }


  public void setDiscriminatorType(String discriminatorType) {
    this.discriminatorType = discriminatorType;
  }


  public AddFormFieldChoiceItemsDescriptor items(List<AddFormFieldChoiceItemDescriptor> items) {
    
    this.items = items;
    return this;
  }

  public AddFormFieldChoiceItemsDescriptor addItemsItem(AddFormFieldChoiceItemDescriptor itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<AddFormFieldChoiceItemDescriptor>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of choice items.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of choice items.")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AddFormFieldChoiceItemDescriptor> getItems() {
    return items;
  }


  public void setItems(List<AddFormFieldChoiceItemDescriptor> items) {
    this.items = items;
  }


  public AddFormFieldChoiceItemsDescriptor textColor(String textColor) {
    
    this.textColor = textColor;
    return this;
  }

   /**
   * Font color. Default is black.
   * @return textColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Font color. Default is black.")
  @JsonProperty(JSON_PROPERTY_TEXT_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextColor() {
    return textColor;
  }


  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }


  public AddFormFieldChoiceItemsDescriptor fontSize(Double fontSize) {
    
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Font size.
   * @return fontSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Font size.")
  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getFontSize() {
    return fontSize;
  }


  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }


  public AddFormFieldChoiceItemsDescriptor fontName(String fontName) {
    
    this.fontName = fontName;
    return this;
  }

   /**
   * Font name.
   * @return fontName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Font name.")
  @JsonProperty(JSON_PROPERTY_FONT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFontName() {
    return fontName;
  }


  public void setFontName(String fontName) {
    this.fontName = fontName;
  }


  public AddFormFieldChoiceItemsDescriptor bold(Boolean bold) {
    
    this.bold = bold;
    return this;
  }

   /**
   * Flag if font is bold. Default false;
   * @return bold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag if font is bold. Default false;")
  @JsonProperty(JSON_PROPERTY_BOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBold() {
    return bold;
  }


  public void setBold(Boolean bold) {
    this.bold = bold;
  }


  public AddFormFieldChoiceItemsDescriptor italic(Boolean italic) {
    
    this.italic = italic;
    return this;
  }

   /**
   * Flag if font is italic. Default is false.
   * @return italic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag if font is italic. Default is false.")
  @JsonProperty(JSON_PROPERTY_ITALIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getItalic() {
    return italic;
  }


  public void setItalic(Boolean italic) {
    this.italic = italic;
  }


  public AddFormFieldChoiceItemsDescriptor textAlign(TextAlignEnum textAlign) {
    
    this.textAlign = textAlign;
    return this;
  }

   /**
   * Text alignment. Default is left.
   * @return textAlign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text alignment. Default is left.")
  @JsonProperty(JSON_PROPERTY_TEXT_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TextAlignEnum getTextAlign() {
    return textAlign;
  }


  public void setTextAlign(TextAlignEnum textAlign) {
    this.textAlign = textAlign;
  }


  public AddFormFieldChoiceItemsDescriptor name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the form field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the form field.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AddFormFieldChoiceItemsDescriptor readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Specifies if the form field is readonly.
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the form field is readonly.")
  @JsonProperty(JSON_PROPERTY_READ_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public AddFormFieldChoiceItemsDescriptor required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Specifies if the form field is required.
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the form field is required.")
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public AddFormFieldChoiceItemsDescriptor X(Double X) {
    
    this.X = X;
    return this;
  }

   /**
   * The X coordinate in points.
   * @return X
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The X coordinate in points.")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getX() {
    return X;
  }


  public void setX(Double X) {
    this.X = X;
  }


  public AddFormFieldChoiceItemsDescriptor Y(Double Y) {
    
    this.Y = Y;
    return this;
  }

   /**
   * The Y coordinate in points.
   * @return Y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Y coordinate in points.")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getY() {
    return Y;
  }


  public void setY(Double Y) {
    this.Y = Y;
  }


  public AddFormFieldChoiceItemsDescriptor width(Double width) {
    
    this.width = width;
    return this;
  }

   /**
   * The width of the form field in points.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The width of the form field in points.")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWidth() {
    return width;
  }


  public void setWidth(Double width) {
    this.width = width;
  }


  public AddFormFieldChoiceItemsDescriptor height(Double height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height of the form field in points.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height of the form field in points.")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getHeight() {
    return height;
  }


  public void setHeight(Double height) {
    this.height = height;
  }


  public AddFormFieldChoiceItemsDescriptor page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * The page number of the form field. (Starting with 1)
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The page number of the form field. (Starting with 1)")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddFormFieldChoiceItemsDescriptor addFormFieldChoiceItemsDescriptor = (AddFormFieldChoiceItemsDescriptor) o;
    return Objects.equals(this.discriminatorType, addFormFieldChoiceItemsDescriptor.discriminatorType) &&
        Objects.equals(this.items, addFormFieldChoiceItemsDescriptor.items) &&
        Objects.equals(this.textColor, addFormFieldChoiceItemsDescriptor.textColor) &&
        Objects.equals(this.fontSize, addFormFieldChoiceItemsDescriptor.fontSize) &&
        Objects.equals(this.fontName, addFormFieldChoiceItemsDescriptor.fontName) &&
        Objects.equals(this.bold, addFormFieldChoiceItemsDescriptor.bold) &&
        Objects.equals(this.italic, addFormFieldChoiceItemsDescriptor.italic) &&
        Objects.equals(this.textAlign, addFormFieldChoiceItemsDescriptor.textAlign) &&
        Objects.equals(this.name, addFormFieldChoiceItemsDescriptor.name) &&
        Objects.equals(this.readOnly, addFormFieldChoiceItemsDescriptor.readOnly) &&
        Objects.equals(this.required, addFormFieldChoiceItemsDescriptor.required) &&
        Objects.equals(this.X, addFormFieldChoiceItemsDescriptor.X) &&
        Objects.equals(this.Y, addFormFieldChoiceItemsDescriptor.Y) &&
        Objects.equals(this.width, addFormFieldChoiceItemsDescriptor.width) &&
        Objects.equals(this.height, addFormFieldChoiceItemsDescriptor.height) &&
        Objects.equals(this.page, addFormFieldChoiceItemsDescriptor.page) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discriminatorType, items, textColor, fontSize, fontName, bold, italic, textAlign, name, readOnly, required, X, Y, width, height, page, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFormFieldChoiceItemsDescriptor {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    discriminatorType: ").append(toIndentedString(discriminatorType)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

