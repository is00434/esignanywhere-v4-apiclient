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
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModelProperty;

/**
 * PrepareSendEnvelopeStepsResult
 */
@JsonPropertyOrder({
  PrepareSendEnvelopeStepsResult.JSON_PROPERTY_AD_HOC_WORKSTEP_CONFIG_RESULT,
  PrepareSendEnvelopeStepsResult.JSON_PROPERTY_STEPS,
  PrepareSendEnvelopeStepsResult.JSON_PROPERTY_ADD_FORM_FIELDS
})
@JsonTypeName("PrepareSendEnvelopeStepsResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class PrepareSendEnvelopeStepsResult {
  public static final String JSON_PROPERTY_AD_HOC_WORKSTEP_CONFIG_RESULT = "AdHocWorkstepConfigResult";
  private WorkstepConfiguration adHocWorkstepConfigResult;

  public static final String JSON_PROPERTY_STEPS = "Steps";
  private List<SendEnvelopeStep> steps = null;

  public static final String JSON_PROPERTY_ADD_FORM_FIELDS = "AddFormFields";
  private AddFormFields addFormFields;


  public PrepareSendEnvelopeStepsResult adHocWorkstepConfigResult(WorkstepConfiguration adHocWorkstepConfigResult) {
    
    this.adHocWorkstepConfigResult = adHocWorkstepConfigResult;
    return this;
  }

   /**
   * Get adHocWorkstepConfigResult
   * @return adHocWorkstepConfigResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_HOC_WORKSTEP_CONFIG_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkstepConfiguration getAdHocWorkstepConfigResult() {
    return adHocWorkstepConfigResult;
  }


  public void setAdHocWorkstepConfigResult(WorkstepConfiguration adHocWorkstepConfigResult) {
    this.adHocWorkstepConfigResult = adHocWorkstepConfigResult;
  }


  public PrepareSendEnvelopeStepsResult steps(List<SendEnvelopeStep> steps) {
    
    this.steps = steps;
    return this;
  }

  public PrepareSendEnvelopeStepsResult addStepsItem(SendEnvelopeStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<SendEnvelopeStep>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendEnvelopeStep> getSteps() {
    return steps;
  }


  public void setSteps(List<SendEnvelopeStep> steps) {
    this.steps = steps;
  }


  public PrepareSendEnvelopeStepsResult addFormFields(AddFormFields addFormFields) {
    
    this.addFormFields = addFormFields;
    return this;
  }

   /**
   * Get addFormFields
   * @return addFormFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADD_FORM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddFormFields getAddFormFields() {
    return addFormFields;
  }


  public void setAddFormFields(AddFormFields addFormFields) {
    this.addFormFields = addFormFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepareSendEnvelopeStepsResult prepareSendEnvelopeStepsResult = (PrepareSendEnvelopeStepsResult) o;
    return Objects.equals(this.adHocWorkstepConfigResult, prepareSendEnvelopeStepsResult.adHocWorkstepConfigResult) &&
        Objects.equals(this.steps, prepareSendEnvelopeStepsResult.steps) &&
        Objects.equals(this.addFormFields, prepareSendEnvelopeStepsResult.addFormFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adHocWorkstepConfigResult, steps, addFormFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareSendEnvelopeStepsResult {\n");
    sb.append("    adHocWorkstepConfigResult: ").append(toIndentedString(adHocWorkstepConfigResult)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    addFormFields: ").append(toIndentedString(addFormFields)).append("\n");
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

