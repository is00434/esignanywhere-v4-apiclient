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
 * FillTextBoxFormDescriptorAllOf
 */
@JsonPropertyOrder({
  FillTextBoxFormDescriptorAllOf.JSON_PROPERTY_VALUE,
  FillTextBoxFormDescriptorAllOf.JSON_PROPERTY_NAME,
  FillTextBoxFormDescriptorAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("FillTextBoxFormDescriptor_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class FillTextBoxFormDescriptorAllOf {
  public static final String JSON_PROPERTY_VALUE = "Value";
  private String value = "";

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  private String discriminatorType;


  public FillTextBoxFormDescriptorAllOf value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the TextBox.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the TextBox.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public FillTextBoxFormDescriptorAllOf name(String name) {
    
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


  public FillTextBoxFormDescriptorAllOf discriminatorType(String discriminatorType) {
    
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
    FillTextBoxFormDescriptorAllOf fillTextBoxFormDescriptorAllOf = (FillTextBoxFormDescriptorAllOf) o;
    return Objects.equals(this.value, fillTextBoxFormDescriptorAllOf.value) &&
        Objects.equals(this.name, fillTextBoxFormDescriptorAllOf.name) &&
        Objects.equals(this.discriminatorType, fillTextBoxFormDescriptorAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, name, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FillTextBoxFormDescriptorAllOf {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

