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
 * SendEnvelopeResult
 */
@JsonPropertyOrder({
  SendEnvelopeResult.JSON_PROPERTY_BULK_CHILDREN_IDS,
  SendEnvelopeResult.JSON_PROPERTY_ENVELOPE_ID
})
@JsonTypeName("SendEnvelopeResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class SendEnvelopeResult {
  public static final String JSON_PROPERTY_BULK_CHILDREN_IDS = "BulkChildrenIds";
  private List<SendEnvelopeBulkResultEntry> bulkChildrenIds = null;

  public static final String JSON_PROPERTY_ENVELOPE_ID = "EnvelopeId";
  private String envelopeId;


  public SendEnvelopeResult bulkChildrenIds(List<SendEnvelopeBulkResultEntry> bulkChildrenIds) {
    
    this.bulkChildrenIds = bulkChildrenIds;
    return this;
  }

  public SendEnvelopeResult addBulkChildrenIdsItem(SendEnvelopeBulkResultEntry bulkChildrenIdsItem) {
    if (this.bulkChildrenIds == null) {
      this.bulkChildrenIds = new ArrayList<SendEnvelopeBulkResultEntry>();
    }
    this.bulkChildrenIds.add(bulkChildrenIdsItem);
    return this;
  }

   /**
   * Get bulkChildrenIds
   * @return bulkChildrenIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BULK_CHILDREN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendEnvelopeBulkResultEntry> getBulkChildrenIds() {
    return bulkChildrenIds;
  }


  public void setBulkChildrenIds(List<SendEnvelopeBulkResultEntry> bulkChildrenIds) {
    this.bulkChildrenIds = bulkChildrenIds;
  }


  public SendEnvelopeResult envelopeId(String envelopeId) {
    
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * Get envelopeId
   * @return envelopeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENVELOPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvelopeId() {
    return envelopeId;
  }


  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEnvelopeResult sendEnvelopeResult = (SendEnvelopeResult) o;
    return Objects.equals(this.bulkChildrenIds, sendEnvelopeResult.bulkChildrenIds) &&
        Objects.equals(this.envelopeId, sendEnvelopeResult.envelopeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkChildrenIds, envelopeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEnvelopeResult {\n");
    sb.append("    bulkChildrenIds: ").append(toIndentedString(bulkChildrenIds)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
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

