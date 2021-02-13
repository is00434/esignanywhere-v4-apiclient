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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CopyDocumentFromTemplateResult.
 */
@ApiModel(description = "CopyDocumentFromTemplateResult.")
@JsonPropertyOrder({
  CopyDocumentFromTemplateResult.JSON_PROPERTY_SSP_FILE_IDS,
  CopyDocumentFromTemplateResult.JSON_PROPERTY_SEND_ENVELOPE_DESCRIPTION
})
@JsonTypeName("CopyDocumentFromTemplateResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class CopyDocumentFromTemplateResult {
  public static final String JSON_PROPERTY_SSP_FILE_IDS = "SspFileIds";
  private List<String> sspFileIds = null;

  public static final String JSON_PROPERTY_SEND_ENVELOPE_DESCRIPTION = "SendEnvelopeDescription";
  private SendEnvelopeDescriptionTemplate sendEnvelopeDescription;


  public CopyDocumentFromTemplateResult sspFileIds(List<String> sspFileIds) {
    
    this.sspFileIds = sspFileIds;
    return this;
  }

  public CopyDocumentFromTemplateResult addSspFileIdsItem(String sspFileIdsItem) {
    if (this.sspFileIds == null) {
      this.sspFileIds = new ArrayList<String>();
    }
    this.sspFileIds.add(sspFileIdsItem);
    return this;
  }

   /**
   * SspFileId.
   * @return sspFileIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SspFileId.")
  @JsonProperty(JSON_PROPERTY_SSP_FILE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSspFileIds() {
    return sspFileIds;
  }


  public void setSspFileIds(List<String> sspFileIds) {
    this.sspFileIds = sspFileIds;
  }


  public CopyDocumentFromTemplateResult sendEnvelopeDescription(SendEnvelopeDescriptionTemplate sendEnvelopeDescription) {
    
    this.sendEnvelopeDescription = sendEnvelopeDescription;
    return this;
  }

   /**
   * Get sendEnvelopeDescription
   * @return sendEnvelopeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEND_ENVELOPE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendEnvelopeDescriptionTemplate getSendEnvelopeDescription() {
    return sendEnvelopeDescription;
  }


  public void setSendEnvelopeDescription(SendEnvelopeDescriptionTemplate sendEnvelopeDescription) {
    this.sendEnvelopeDescription = sendEnvelopeDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyDocumentFromTemplateResult copyDocumentFromTemplateResult = (CopyDocumentFromTemplateResult) o;
    return Objects.equals(this.sspFileIds, copyDocumentFromTemplateResult.sspFileIds) &&
        Objects.equals(this.sendEnvelopeDescription, copyDocumentFromTemplateResult.sendEnvelopeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sspFileIds, sendEnvelopeDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyDocumentFromTemplateResult {\n");
    sb.append("    sspFileIds: ").append(toIndentedString(sspFileIds)).append("\n");
    sb.append("    sendEnvelopeDescription: ").append(toIndentedString(sendEnvelopeDescription)).append("\n");
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

