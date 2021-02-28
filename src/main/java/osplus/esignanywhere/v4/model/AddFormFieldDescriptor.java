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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Abstract class, use the derived classes:  - AddCheckBoxFormFieldDescriptor  - AddComboBoxFormFieldDescriptor  - AddRadioButtonFormFieldDescriptor  - AddTextBoxFormFieldDescriptor  - AddListBoxFormFieldDescriptor                For usage see sample code.    Describes a form field and its options.
 */
@ApiModel(description = "Abstract class, use the derived classes:  - AddCheckBoxFormFieldDescriptor  - AddComboBoxFormFieldDescriptor  - AddRadioButtonFormFieldDescriptor  - AddTextBoxFormFieldDescriptor  - AddListBoxFormFieldDescriptor                For usage see sample code.    Describes a form field and its options.")
@JsonPropertyOrder({
  AddFormFieldDescriptor.JSON_PROPERTY_NAME,
  AddFormFieldDescriptor.JSON_PROPERTY_READ_ONLY,
  AddFormFieldDescriptor.JSON_PROPERTY_REQUIRED,
  AddFormFieldDescriptor.JSON_PROPERTY_X,
  AddFormFieldDescriptor.JSON_PROPERTY_Y,
  AddFormFieldDescriptor.JSON_PROPERTY_WIDTH,
  AddFormFieldDescriptor.JSON_PROPERTY_HEIGHT,
  AddFormFieldDescriptor.JSON_PROPERTY_PAGE,
  AddFormFieldDescriptor.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("AddFormFieldDescriptor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AddCheckBoxFormFieldDescriptor.class, name = "AddCheckBoxFormFieldDescriptor"),
  @JsonSubTypes.Type(value = AddComboBoxFormFieldDescriptor.class, name = "AddComboBoxFormFieldDescriptor"),
  @JsonSubTypes.Type(value = AddFormFieldChoiceItemsDescriptor.class, name = "AddFormFieldChoiceItemsDescriptor"),
  @JsonSubTypes.Type(value = AddFormFieldWithFontSettingsDescriptor.class, name = "AddFormFieldWithFontSettingsDescriptor"),
  @JsonSubTypes.Type(value = AddListBoxFormFieldDescriptor.class, name = "AddListBoxFormFieldDescriptor"),
  @JsonSubTypes.Type(value = AddRadioButtonFormFieldDescriptor.class, name = "AddRadioButtonFormFieldDescriptor"),
  @JsonSubTypes.Type(value = AddTextBoxFormFieldDescriptor.class, name = "AddTextBoxFormFieldDescriptor"),
})

public class AddFormFieldDescriptor {
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

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  protected String discriminatorType;


  public AddFormFieldDescriptor name(String name) {
    
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


  public AddFormFieldDescriptor readOnly(Boolean readOnly) {
    
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


  public AddFormFieldDescriptor required(Boolean required) {
    
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


  public AddFormFieldDescriptor X(Double X) {
    
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


  public AddFormFieldDescriptor Y(Double Y) {
    
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


  public AddFormFieldDescriptor width(Double width) {
    
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


  public AddFormFieldDescriptor height(Double height) {
    
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


  public AddFormFieldDescriptor page(Integer page) {
    
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


  public AddFormFieldDescriptor discriminatorType(String discriminatorType) {
    
    this.discriminatorType = discriminatorType;
    return this;
  }

   /**
   * To differentiate between childs.
   * @return discriminatorType
  **/
  @ApiModelProperty(required = true, value = "To differentiate between childs.")
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
    AddFormFieldDescriptor addFormFieldDescriptor = (AddFormFieldDescriptor) o;
    return Objects.equals(this.name, addFormFieldDescriptor.name) &&
        Objects.equals(this.readOnly, addFormFieldDescriptor.readOnly) &&
        Objects.equals(this.required, addFormFieldDescriptor.required) &&
        Objects.equals(this.X, addFormFieldDescriptor.X) &&
        Objects.equals(this.Y, addFormFieldDescriptor.Y) &&
        Objects.equals(this.width, addFormFieldDescriptor.width) &&
        Objects.equals(this.height, addFormFieldDescriptor.height) &&
        Objects.equals(this.page, addFormFieldDescriptor.page) &&
        Objects.equals(this.discriminatorType, addFormFieldDescriptor.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, readOnly, required, X, Y, width, height, page, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFormFieldDescriptor {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

