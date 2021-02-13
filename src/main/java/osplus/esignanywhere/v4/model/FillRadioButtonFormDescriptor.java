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

import io.swagger.annotations.ApiModelProperty;

/**
 * FillRadioButtonFormDescriptor
 */
@JsonPropertyOrder({
  FillRadioButtonFormDescriptor.JSON_PROPERTY_SELECTED_ITEM,
  FillRadioButtonFormDescriptor.JSON_PROPERTY_NAME,
  FillRadioButtonFormDescriptor.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("FillRadioButtonFormDescriptor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)

public class FillRadioButtonFormDescriptor extends FillFormDescriptor {
  public static final String JSON_PROPERTY_SELECTED_ITEM = "SelectedItem";
  private String selectedItem;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  protected String discriminatorType;


  public FillRadioButtonFormDescriptor selectedItem(String selectedItem) {
    
    this.selectedItem = selectedItem;
    return this;
  }

   /**
   * The selected Item in an radiobutton group.
   * @return selectedItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The selected Item in an radiobutton group.")
  @JsonProperty(JSON_PROPERTY_SELECTED_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSelectedItem() {
    return selectedItem;
  }


  public void setSelectedItem(String selectedItem) {
    this.selectedItem = selectedItem;
  }


  public FillRadioButtonFormDescriptor name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Abstract class, use the derived classes:  - FillCheckBoxFormDescriptor  - FillComboBoxFormDescriptor  - FillListBoxFormDescriptor  - FillRadioButtonFormDescriptor  - FillTextBoxFormDescriptor                For usage see sample code.    The name of the form field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Abstract class, use the derived classes:  - FillCheckBoxFormDescriptor  - FillComboBoxFormDescriptor  - FillListBoxFormDescriptor  - FillRadioButtonFormDescriptor  - FillTextBoxFormDescriptor                For usage see sample code.    The name of the form field.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FillRadioButtonFormDescriptor discriminatorType(String discriminatorType) {
    
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
    FillRadioButtonFormDescriptor fillRadioButtonFormDescriptor = (FillRadioButtonFormDescriptor) o;
    return Objects.equals(this.selectedItem, fillRadioButtonFormDescriptor.selectedItem) &&
        Objects.equals(this.name, fillRadioButtonFormDescriptor.name) &&
        Objects.equals(this.discriminatorType, fillRadioButtonFormDescriptor.discriminatorType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedItem, name, discriminatorType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FillRadioButtonFormDescriptor {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    selectedItem: ").append(toIndentedString(selectedItem)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

