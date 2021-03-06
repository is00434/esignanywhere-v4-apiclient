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
 * EnvelopePrepareModel
 */
@JsonPropertyOrder({
  EnvelopePrepareModel.JSON_PROPERTY_SSP_FILE_IDS,
  EnvelopePrepareModel.JSON_PROPERTY_AD_HOC_WORKSTEP_CONFIGURATION,
  EnvelopePrepareModel.JSON_PROPERTY_PREPARE_SEND_ENVELOPE_STEPS_DESCRIPTOR
})
@JsonTypeName("EnvelopePrepareModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class EnvelopePrepareModel {
  public static final String JSON_PROPERTY_SSP_FILE_IDS = "SspFileIds";
  private List<String> sspFileIds = null;

  public static final String JSON_PROPERTY_AD_HOC_WORKSTEP_CONFIGURATION = "AdHocWorkstepConfiguration";
  private AdHocWorkstepConfiguration adHocWorkstepConfiguration;

  public static final String JSON_PROPERTY_PREPARE_SEND_ENVELOPE_STEPS_DESCRIPTOR = "PrepareSendEnvelopeStepsDescriptor";
  private PrepareSendEnvelopeStepsDescriptor prepareSendEnvelopeStepsDescriptor;


  public EnvelopePrepareModel sspFileIds(List<String> sspFileIds) {
    
    this.sspFileIds = sspFileIds;
    return this;
  }

  public EnvelopePrepareModel addSspFileIdsItem(String sspFileIdsItem) {
    if (this.sspFileIds == null) {
      this.sspFileIds = new ArrayList<String>();
    }
    this.sspFileIds.add(sspFileIdsItem);
    return this;
  }

   /**
   * Get sspFileIds
   * @return sspFileIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SSP_FILE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSspFileIds() {
    return sspFileIds;
  }


  public void setSspFileIds(List<String> sspFileIds) {
    this.sspFileIds = sspFileIds;
  }


  public EnvelopePrepareModel adHocWorkstepConfiguration(AdHocWorkstepConfiguration adHocWorkstepConfiguration) {
    
    this.adHocWorkstepConfiguration = adHocWorkstepConfiguration;
    return this;
  }

   /**
   * Get adHocWorkstepConfiguration
   * @return adHocWorkstepConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_HOC_WORKSTEP_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdHocWorkstepConfiguration getAdHocWorkstepConfiguration() {
    return adHocWorkstepConfiguration;
  }


  public void setAdHocWorkstepConfiguration(AdHocWorkstepConfiguration adHocWorkstepConfiguration) {
    this.adHocWorkstepConfiguration = adHocWorkstepConfiguration;
  }


  public EnvelopePrepareModel prepareSendEnvelopeStepsDescriptor(PrepareSendEnvelopeStepsDescriptor prepareSendEnvelopeStepsDescriptor) {
    
    this.prepareSendEnvelopeStepsDescriptor = prepareSendEnvelopeStepsDescriptor;
    return this;
  }

   /**
   * Get prepareSendEnvelopeStepsDescriptor
   * @return prepareSendEnvelopeStepsDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREPARE_SEND_ENVELOPE_STEPS_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrepareSendEnvelopeStepsDescriptor getPrepareSendEnvelopeStepsDescriptor() {
    return prepareSendEnvelopeStepsDescriptor;
  }


  public void setPrepareSendEnvelopeStepsDescriptor(PrepareSendEnvelopeStepsDescriptor prepareSendEnvelopeStepsDescriptor) {
    this.prepareSendEnvelopeStepsDescriptor = prepareSendEnvelopeStepsDescriptor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopePrepareModel envelopePrepareModel = (EnvelopePrepareModel) o;
    return Objects.equals(this.sspFileIds, envelopePrepareModel.sspFileIds) &&
        Objects.equals(this.adHocWorkstepConfiguration, envelopePrepareModel.adHocWorkstepConfiguration) &&
        Objects.equals(this.prepareSendEnvelopeStepsDescriptor, envelopePrepareModel.prepareSendEnvelopeStepsDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sspFileIds, adHocWorkstepConfiguration, prepareSendEnvelopeStepsDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopePrepareModel {\n");
    sb.append("    sspFileIds: ").append(toIndentedString(sspFileIds)).append("\n");
    sb.append("    adHocWorkstepConfiguration: ").append(toIndentedString(adHocWorkstepConfiguration)).append("\n");
    sb.append("    prepareSendEnvelopeStepsDescriptor: ").append(toIndentedString(prepareSendEnvelopeStepsDescriptor)).append("\n");
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

