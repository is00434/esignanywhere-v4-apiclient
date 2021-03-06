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
 * Range to define in
 */
@ApiModel(description = "Range to define in")
@JsonPropertyOrder({
  FormFieldValidationRange.JSON_PROPERTY_FROM,
  FormFieldValidationRange.JSON_PROPERTY_TO
})
@JsonTypeName("FormFieldValidationRange")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class FormFieldValidationRange {
  public static final String JSON_PROPERTY_FROM = "From";
  private String from;

  public static final String JSON_PROPERTY_TO = "To";
  private String to;


  public FormFieldValidationRange from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Defines a value for the start of the range.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines a value for the start of the range.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public FormFieldValidationRange to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Defines a value for the end of the range.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines a value for the end of the range.")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormFieldValidationRange formFieldValidationRange = (FormFieldValidationRange) o;
    return Objects.equals(this.from, formFieldValidationRange.from) &&
        Objects.equals(this.to, formFieldValidationRange.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldValidationRange {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

