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
 * Describes the new recipient
 */
@ApiModel(description = "Describes the new recipient")
@JsonPropertyOrder({
  ReplaceRecipientData.JSON_PROPERTY_RECIPIENT,
  ReplaceRecipientData.JSON_PROPERTY_WORKSTEP_CONFIGURATION
})
@JsonTypeName("ReplaceRecipientData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class ReplaceRecipientData {
  public static final String JSON_PROPERTY_RECIPIENT = "Recipient";
  private SendEnvelopeRecipient recipient;

  public static final String JSON_PROPERTY_WORKSTEP_CONFIGURATION = "WorkstepConfiguration";
  private WorkstepConfiguration workstepConfiguration;


  public ReplaceRecipientData recipient(SendEnvelopeRecipient recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendEnvelopeRecipient getRecipient() {
    return recipient;
  }


  public void setRecipient(SendEnvelopeRecipient recipient) {
    this.recipient = recipient;
  }


  public ReplaceRecipientData workstepConfiguration(WorkstepConfiguration workstepConfiguration) {
    
    this.workstepConfiguration = workstepConfiguration;
    return this;
  }

   /**
   * Get workstepConfiguration
   * @return workstepConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKSTEP_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkstepConfiguration getWorkstepConfiguration() {
    return workstepConfiguration;
  }


  public void setWorkstepConfiguration(WorkstepConfiguration workstepConfiguration) {
    this.workstepConfiguration = workstepConfiguration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceRecipientData replaceRecipientData = (ReplaceRecipientData) o;
    return Objects.equals(this.recipient, replaceRecipientData.recipient) &&
        Objects.equals(this.workstepConfiguration, replaceRecipientData.workstepConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, workstepConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceRecipientData {\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    workstepConfiguration: ").append(toIndentedString(workstepConfiguration)).append("\n");
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

