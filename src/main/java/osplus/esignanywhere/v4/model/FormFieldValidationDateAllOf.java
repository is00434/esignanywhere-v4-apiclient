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
 * FormFieldValidationDateAllOf
 */
@JsonPropertyOrder({
  FormFieldValidationDateAllOf.JSON_PROPERTY_FORMAT,
  FormFieldValidationDateAllOf.JSON_PROPERTY_RANGE,
  FormFieldValidationDateAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("FormFieldValidationDate_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class FormFieldValidationDateAllOf {
  public static final String JSON_PROPERTY_FORMAT = "Format";
  private String format;

  public static final String JSON_PROPERTY_RANGE = "Range";
  private FormFieldValidationRange range;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  private String discriminatorType;


  public FormFieldValidationDateAllOf format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Defines the format of the format. (e.g. \&quot;dd. MMMM yyyy\&quot;)
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the format of the format. (e.g. \"dd. MMMM yyyy\")")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public FormFieldValidationDateAllOf range(FormFieldValidationRange range) {
    
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormFieldValidationRange getRange() {
    return range;
  }


  public void setRange(FormFieldValidationRange range) {
    this.range = range;
  }


  public FormFieldValidationDateAllOf discriminatorType(String discriminatorType) {
    
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
    FormFieldValidationDateAllOf formFieldValidationDateAllOf = (FormFieldValidationDateAllOf) o;
    return Objects.equals(this.format, formFieldValidationDateAllOf.format) &&
        Objects.equals(this.range, formFieldValidationDateAllOf.range) &&
        Objects.equals(this.discriminatorType, formFieldValidationDateAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, range, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldValidationDateAllOf {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

