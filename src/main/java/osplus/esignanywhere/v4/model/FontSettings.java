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
 * Configure fontsettings.
 */
@ApiModel(description = "Configure fontsettings.")
@JsonPropertyOrder({
  FontSettings.JSON_PROPERTY_ID,
  FontSettings.JSON_PROPERTY_TEXT_COLOR,
  FontSettings.JSON_PROPERTY_NAME,
  FontSettings.JSON_PROPERTY_SIZE,
  FontSettings.JSON_PROPERTY_IS_BOLD,
  FontSettings.JSON_PROPERTY_IS_ITALIC
})
@JsonTypeName("FontSettings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class FontSettings {
  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_TEXT_COLOR = "TextColor";
  private TextColor textColor;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_SIZE = "Size";
  private Double size;

  public static final String JSON_PROPERTY_IS_BOLD = "IsBold";
  private Boolean isBold;

  public static final String JSON_PROPERTY_IS_ITALIC = "IsItalic";
  private Boolean isItalic;


  public FontSettings id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identification for the font.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identification for the font.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FontSettings textColor(TextColor textColor) {
    
    this.textColor = textColor;
    return this;
  }

   /**
   * Get textColor
   * @return textColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXT_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TextColor getTextColor() {
    return textColor;
  }


  public void setTextColor(TextColor textColor) {
    this.textColor = textColor;
  }


  public FontSettings name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Naming of the font.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Naming of the font.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FontSettings size(Double size) {
    
    this.size = size;
    return this;
  }

   /**
   * Define the size.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define the size.")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSize() {
    return size;
  }


  public void setSize(Double size) {
    this.size = size;
  }


  public FontSettings isBold(Boolean isBold) {
    
    this.isBold = isBold;
    return this;
  }

   /**
   * Define if the font-style should be bold.
   * @return isBold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if the font-style should be bold.")
  @JsonProperty(JSON_PROPERTY_IS_BOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBold() {
    return isBold;
  }


  public void setIsBold(Boolean isBold) {
    this.isBold = isBold;
  }


  public FontSettings isItalic(Boolean isItalic) {
    
    this.isItalic = isItalic;
    return this;
  }

   /**
   * Define if the font-style should be italic.
   * @return isItalic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if the font-style should be italic.")
  @JsonProperty(JSON_PROPERTY_IS_ITALIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsItalic() {
    return isItalic;
  }


  public void setIsItalic(Boolean isItalic) {
    this.isItalic = isItalic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FontSettings fontSettings = (FontSettings) o;
    return Objects.equals(this.id, fontSettings.id) &&
        Objects.equals(this.textColor, fontSettings.textColor) &&
        Objects.equals(this.name, fontSettings.name) &&
        Objects.equals(this.size, fontSettings.size) &&
        Objects.equals(this.isBold, fontSettings.isBold) &&
        Objects.equals(this.isItalic, fontSettings.isItalic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, textColor, name, size, isBold, isItalic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FontSettings {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    isBold: ").append(toIndentedString(isBold)).append("\n");
    sb.append("    isItalic: ").append(toIndentedString(isItalic)).append("\n");
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

