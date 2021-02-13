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
 * PrepareSendEnvelopeStepsDescriptor
 */
@JsonPropertyOrder({
  PrepareSendEnvelopeStepsDescriptor.JSON_PROPERTY_CLEAR_FIELD_MARKUP_STRING
})
@JsonTypeName("PrepareSendEnvelopeStepsDescriptor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class PrepareSendEnvelopeStepsDescriptor {
  public static final String JSON_PROPERTY_CLEAR_FIELD_MARKUP_STRING = "ClearFieldMarkupString";
  private Boolean clearFieldMarkupString;


  public PrepareSendEnvelopeStepsDescriptor clearFieldMarkupString(Boolean clearFieldMarkupString) {
    
    this.clearFieldMarkupString = clearFieldMarkupString;
    return this;
  }

   /**
   * Specifies if the parsed field markup string should be deleted from the pdf.
   * @return clearFieldMarkupString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the parsed field markup string should be deleted from the pdf.")
  @JsonProperty(JSON_PROPERTY_CLEAR_FIELD_MARKUP_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getClearFieldMarkupString() {
    return clearFieldMarkupString;
  }


  public void setClearFieldMarkupString(Boolean clearFieldMarkupString) {
    this.clearFieldMarkupString = clearFieldMarkupString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepareSendEnvelopeStepsDescriptor prepareSendEnvelopeStepsDescriptor = (PrepareSendEnvelopeStepsDescriptor) o;
    return Objects.equals(this.clearFieldMarkupString, prepareSendEnvelopeStepsDescriptor.clearFieldMarkupString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearFieldMarkupString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareSendEnvelopeStepsDescriptor {\n");
    sb.append("    clearFieldMarkupString: ").append(toIndentedString(clearFieldMarkupString)).append("\n");
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
