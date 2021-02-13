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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import org.threeten.bp.OffsetDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Descriptor for filtering envelopes.
 */
@ApiModel(description = "Descriptor for filtering envelopes.")
@JsonPropertyOrder({
  FindEnvelopesDescriptor.JSON_PROPERTY_START_DATE,
  FindEnvelopesDescriptor.JSON_PROPERTY_END_DATE,
  FindEnvelopesDescriptor.JSON_PROPERTY_SEARCH_TEXT,
  FindEnvelopesDescriptor.JSON_PROPERTY_STATUS,
  FindEnvelopesDescriptor.JSON_PROPERTY_IN_STATUS_SINCE_DAYS,
  FindEnvelopesDescriptor.JSON_PROPERTY_SENDERS,
  FindEnvelopesDescriptor.JSON_PROPERTY_SIGNERS,
  FindEnvelopesDescriptor.JSON_PROPERTY_RECIPIENTS,
  FindEnvelopesDescriptor.JSON_PROPERTY_WAITING_FOR_RECIPIENT,
  FindEnvelopesDescriptor.JSON_PROPERTY_BULK
})
@JsonTypeName("FindEnvelopesDescriptor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class FindEnvelopesDescriptor {
  public static final String JSON_PROPERTY_START_DATE = "StartDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "EndDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_SEARCH_TEXT = "SearchText";
  private String searchText;

  /**
   * If set, filters for envelopes by status.
   */
  public enum StatusEnum {
    DRAFT("Draft"),
    
    CANCELED("Canceled"),
    
    COMPLETED("Completed"),
    
    EXPIRED("Expired"),
    
    REJECTED("Rejected"),
    
    TEMPLATE("Template"),
    
    ACTIONREQUIRED("ActionRequired"),
    
    WAITINGFOROTHERS("WaitingForOthers"),
    
    EXPIRINGSOON("ExpiringSoon"),
    
    ACTIVE("Active");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "Status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_IN_STATUS_SINCE_DAYS = "InStatusSinceDays";
  private Integer inStatusSinceDays;

  public static final String JSON_PROPERTY_SENDERS = "Senders";
  private List<String> senders = null;

  public static final String JSON_PROPERTY_SIGNERS = "Signers";
  private List<String> signers = null;

  public static final String JSON_PROPERTY_RECIPIENTS = "Recipients";
  private List<String> recipients = null;

  public static final String JSON_PROPERTY_WAITING_FOR_RECIPIENT = "WaitingForRecipient";
  private String waitingForRecipient;

  public static final String JSON_PROPERTY_BULK = "Bulk";
  private String bulk;


  public FindEnvelopesDescriptor startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * If set, filters for envelopes which where created (Status: Template, Draft) or sent after the start date.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters for envelopes which where created (Status: Template, Draft) or sent after the start date.")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public FindEnvelopesDescriptor endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * If set, filters for envelopes which where created (Status: Template, Draft) or sent before the end date.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters for envelopes which where created (Status: Template, Draft) or sent before the end date.")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public FindEnvelopesDescriptor searchText(String searchText) {
    
    this.searchText = searchText;
    return this;
  }

   /**
   * If set, filters for the given text in email subject/body, envelope name/description, sender first/lastname email and recipient first/lastname email.  Expensive!
   * @return searchText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters for the given text in email subject/body, envelope name/description, sender first/lastname email and recipient first/lastname email.  Expensive!")
  @JsonProperty(JSON_PROPERTY_SEARCH_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchText() {
    return searchText;
  }


  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }


  public FindEnvelopesDescriptor status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * If set, filters for envelopes by status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters for envelopes by status.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public FindEnvelopesDescriptor inStatusSinceDays(Integer inStatusSinceDays) {
    
    this.inStatusSinceDays = inStatusSinceDays;
    return this;
  }

   /**
   * If set, filters for envelopes which have the given status for the given days.  Must be combined with Status.
   * @return inStatusSinceDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters for envelopes which have the given status for the given days.  Must be combined with Status.")
  @JsonProperty(JSON_PROPERTY_IN_STATUS_SINCE_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInStatusSinceDays() {
    return inStatusSinceDays;
  }


  public void setInStatusSinceDays(Integer inStatusSinceDays) {
    this.inStatusSinceDays = inStatusSinceDays;
  }


  public FindEnvelopesDescriptor senders(List<String> senders) {
    
    this.senders = senders;
    return this;
  }

  public FindEnvelopesDescriptor addSendersItem(String sendersItem) {
    if (this.senders == null) {
      this.senders = new ArrayList<String>();
    }
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * If set, filters for the sender email adresses.
   * @return senders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters for the sender email adresses.")
  @JsonProperty(JSON_PROPERTY_SENDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSenders() {
    return senders;
  }


  public void setSenders(List<String> senders) {
    this.senders = senders;
  }


  public FindEnvelopesDescriptor signers(List<String> signers) {
    
    this.signers = signers;
    return this;
  }

  public FindEnvelopesDescriptor addSignersItem(String signersItem) {
    if (this.signers == null) {
      this.signers = new ArrayList<String>();
    }
    this.signers.add(signersItem);
    return this;
  }

   /**
   * If set, filters for the given sender email adresses.
   * @return signers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters for the given sender email adresses.")
  @JsonProperty(JSON_PROPERTY_SIGNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSigners() {
    return signers;
  }


  public void setSigners(List<String> signers) {
    this.signers = signers;
  }


  public FindEnvelopesDescriptor recipients(List<String> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public FindEnvelopesDescriptor addRecipientsItem(String recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<String>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * If set, filters for the given recipient email adresses.
   * @return recipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters for the given recipient email adresses.")
  @JsonProperty(JSON_PROPERTY_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }


  public FindEnvelopesDescriptor waitingForRecipient(String waitingForRecipient) {
    
    this.waitingForRecipient = waitingForRecipient;
    return this;
  }

   /**
   * If set, filters for envelopes which are waiting for the given recipient email address.
   * @return waitingForRecipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters for envelopes which are waiting for the given recipient email address.")
  @JsonProperty(JSON_PROPERTY_WAITING_FOR_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWaitingForRecipient() {
    return waitingForRecipient;
  }


  public void setWaitingForRecipient(String waitingForRecipient) {
    this.waitingForRecipient = waitingForRecipient;
  }


  public FindEnvelopesDescriptor bulk(String bulk) {
    
    this.bulk = bulk;
    return this;
  }

   /**
   * If set, filters for envelopes for of the given bulk id.
   * @return bulk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters for envelopes for of the given bulk id.")
  @JsonProperty(JSON_PROPERTY_BULK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBulk() {
    return bulk;
  }


  public void setBulk(String bulk) {
    this.bulk = bulk;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindEnvelopesDescriptor findEnvelopesDescriptor = (FindEnvelopesDescriptor) o;
    return Objects.equals(this.startDate, findEnvelopesDescriptor.startDate) &&
        Objects.equals(this.endDate, findEnvelopesDescriptor.endDate) &&
        Objects.equals(this.searchText, findEnvelopesDescriptor.searchText) &&
        Objects.equals(this.status, findEnvelopesDescriptor.status) &&
        Objects.equals(this.inStatusSinceDays, findEnvelopesDescriptor.inStatusSinceDays) &&
        Objects.equals(this.senders, findEnvelopesDescriptor.senders) &&
        Objects.equals(this.signers, findEnvelopesDescriptor.signers) &&
        Objects.equals(this.recipients, findEnvelopesDescriptor.recipients) &&
        Objects.equals(this.waitingForRecipient, findEnvelopesDescriptor.waitingForRecipient) &&
        Objects.equals(this.bulk, findEnvelopesDescriptor.bulk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, searchText, status, inStatusSinceDays, senders, signers, recipients, waitingForRecipient, bulk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindEnvelopesDescriptor {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    searchText: ").append(toIndentedString(searchText)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    inStatusSinceDays: ").append(toIndentedString(inStatusSinceDays)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    waitingForRecipient: ").append(toIndentedString(waitingForRecipient)).append("\n");
    sb.append("    bulk: ").append(toIndentedString(bulk)).append("\n");
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
