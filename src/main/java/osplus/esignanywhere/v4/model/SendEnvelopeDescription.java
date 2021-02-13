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
 * SendEnvelopeDescription
 */
@JsonPropertyOrder({
  SendEnvelopeDescription.JSON_PROPERTY_NAME,
  SendEnvelopeDescription.JSON_PROPERTY_EMAIL_SUBJECT,
  SendEnvelopeDescription.JSON_PROPERTY_EMAIL_BODY,
  SendEnvelopeDescription.JSON_PROPERTY_DISPLAYED_EMAIL_SENDER,
  SendEnvelopeDescription.JSON_PROPERTY_ENABLE_REMINDERS,
  SendEnvelopeDescription.JSON_PROPERTY_FIRST_REMINDER_DAY_AMOUNT,
  SendEnvelopeDescription.JSON_PROPERTY_RECURRENT_REMINDER_DAY_AMOUNT,
  SendEnvelopeDescription.JSON_PROPERTY_BEFORE_EXPIRATION_DAY_AMOUNT,
  SendEnvelopeDescription.JSON_PROPERTY_DAYS_UNTIL_EXPIRE,
  SendEnvelopeDescription.JSON_PROPERTY_CALLBACK_URL,
  SendEnvelopeDescription.JSON_PROPERTY_STATUS_UPDATE_CALLBACK_URL,
  SendEnvelopeDescription.JSON_PROPERTY_WORKSTEP_EVENT_CALLBACK,
  SendEnvelopeDescription.JSON_PROPERTY_STEPS,
  SendEnvelopeDescription.JSON_PROPERTY_ADD_FORM_FIELDS,
  SendEnvelopeDescription.JSON_PROPERTY_OVERRIDE_FORM_FIELD_VALUES,
  SendEnvelopeDescription.JSON_PROPERTY_META_DATA_XML,
  SendEnvelopeDescription.JSON_PROPERTY_ATTACH_SIGNED_DOCUMENTS_TO_ENVELOPE_LOG
})
@JsonTypeName("SendEnvelopeDescription")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class SendEnvelopeDescription {
  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL_SUBJECT = "EmailSubject";
  private String emailSubject;

  public static final String JSON_PROPERTY_EMAIL_BODY = "EmailBody";
  private String emailBody;

  public static final String JSON_PROPERTY_DISPLAYED_EMAIL_SENDER = "DisplayedEmailSender";
  private String displayedEmailSender;

  public static final String JSON_PROPERTY_ENABLE_REMINDERS = "EnableReminders";
  private Boolean enableReminders;

  public static final String JSON_PROPERTY_FIRST_REMINDER_DAY_AMOUNT = "FirstReminderDayAmount";
  private Integer firstReminderDayAmount;

  public static final String JSON_PROPERTY_RECURRENT_REMINDER_DAY_AMOUNT = "RecurrentReminderDayAmount";
  private Integer recurrentReminderDayAmount;

  public static final String JSON_PROPERTY_BEFORE_EXPIRATION_DAY_AMOUNT = "BeforeExpirationDayAmount";
  private Integer beforeExpirationDayAmount;

  public static final String JSON_PROPERTY_DAYS_UNTIL_EXPIRE = "DaysUntilExpire";
  private Integer daysUntilExpire;

  public static final String JSON_PROPERTY_CALLBACK_URL = "CallbackUrl";
  private String callbackUrl;

  public static final String JSON_PROPERTY_STATUS_UPDATE_CALLBACK_URL = "StatusUpdateCallbackUrl";
  private String statusUpdateCallbackUrl;

  public static final String JSON_PROPERTY_WORKSTEP_EVENT_CALLBACK = "WorkstepEventCallback";
  private WorkstepEventCallback workstepEventCallback;

  public static final String JSON_PROPERTY_STEPS = "Steps";
  private List<SendEnvelopeStep> steps = null;

  public static final String JSON_PROPERTY_ADD_FORM_FIELDS = "AddFormFields";
  private AddFormFields addFormFields;

  public static final String JSON_PROPERTY_OVERRIDE_FORM_FIELD_VALUES = "OverrideFormFieldValues";
  private OverrideFormFieldOptions overrideFormFieldValues;

  public static final String JSON_PROPERTY_META_DATA_XML = "MetaDataXml";
  private String metaDataXml;

  public static final String JSON_PROPERTY_ATTACH_SIGNED_DOCUMENTS_TO_ENVELOPE_LOG = "AttachSignedDocumentsToEnvelopeLog";
  private Boolean attachSignedDocumentsToEnvelopeLog = false;


  public SendEnvelopeDescription name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the envelope.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the envelope.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SendEnvelopeDescription emailSubject(String emailSubject) {
    
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * The subject of the sent out emails.
   * @return emailSubject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject of the sent out emails.")
  @JsonProperty(JSON_PROPERTY_EMAIL_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailSubject() {
    return emailSubject;
  }


  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }


  public SendEnvelopeDescription emailBody(String emailBody) {
    
    this.emailBody = emailBody;
    return this;
  }

   /**
   * The body of the sent out emails.
   * @return emailBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The body of the sent out emails.")
  @JsonProperty(JSON_PROPERTY_EMAIL_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailBody() {
    return emailBody;
  }


  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }


  public SendEnvelopeDescription displayedEmailSender(String displayedEmailSender) {
    
    this.displayedEmailSender = displayedEmailSender;
    return this;
  }

   /**
   * The name of the email sender.
   * @return displayedEmailSender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the email sender.")
  @JsonProperty(JSON_PROPERTY_DISPLAYED_EMAIL_SENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayedEmailSender() {
    return displayedEmailSender;
  }


  public void setDisplayedEmailSender(String displayedEmailSender) {
    this.displayedEmailSender = displayedEmailSender;
  }


  public SendEnvelopeDescription enableReminders(Boolean enableReminders) {
    
    this.enableReminders = enableReminders;
    return this;
  }

   /**
   * If true, reminders are used.
   * @return enableReminders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, reminders are used.")
  @JsonProperty(JSON_PROPERTY_ENABLE_REMINDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableReminders() {
    return enableReminders;
  }


  public void setEnableReminders(Boolean enableReminders) {
    this.enableReminders = enableReminders;
  }


  public SendEnvelopeDescription firstReminderDayAmount(Integer firstReminderDayAmount) {
    
    this.firstReminderDayAmount = firstReminderDayAmount;
    return this;
  }

   /**
   * Amount of days until the first reminder is sent out.
   * @return firstReminderDayAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of days until the first reminder is sent out.")
  @JsonProperty(JSON_PROPERTY_FIRST_REMINDER_DAY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFirstReminderDayAmount() {
    return firstReminderDayAmount;
  }


  public void setFirstReminderDayAmount(Integer firstReminderDayAmount) {
    this.firstReminderDayAmount = firstReminderDayAmount;
  }


  public SendEnvelopeDescription recurrentReminderDayAmount(Integer recurrentReminderDayAmount) {
    
    this.recurrentReminderDayAmount = recurrentReminderDayAmount;
    return this;
  }

   /**
   * Amount of days until all recurrent reminders are sent out.
   * @return recurrentReminderDayAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of days until all recurrent reminders are sent out.")
  @JsonProperty(JSON_PROPERTY_RECURRENT_REMINDER_DAY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecurrentReminderDayAmount() {
    return recurrentReminderDayAmount;
  }


  public void setRecurrentReminderDayAmount(Integer recurrentReminderDayAmount) {
    this.recurrentReminderDayAmount = recurrentReminderDayAmount;
  }


  public SendEnvelopeDescription beforeExpirationDayAmount(Integer beforeExpirationDayAmount) {
    
    this.beforeExpirationDayAmount = beforeExpirationDayAmount;
    return this;
  }

   /**
   * Amount of days until a reminder about the expiration is sent out.
   * @return beforeExpirationDayAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of days until a reminder about the expiration is sent out.")
  @JsonProperty(JSON_PROPERTY_BEFORE_EXPIRATION_DAY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBeforeExpirationDayAmount() {
    return beforeExpirationDayAmount;
  }


  public void setBeforeExpirationDayAmount(Integer beforeExpirationDayAmount) {
    this.beforeExpirationDayAmount = beforeExpirationDayAmount;
  }


  public SendEnvelopeDescription daysUntilExpire(Integer daysUntilExpire) {
    
    this.daysUntilExpire = daysUntilExpire;
    return this;
  }

   /**
   * Amount of days until the envelope expires.
   * @return daysUntilExpire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of days until the envelope expires.")
  @JsonProperty(JSON_PROPERTY_DAYS_UNTIL_EXPIRE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDaysUntilExpire() {
    return daysUntilExpire;
  }


  public void setDaysUntilExpire(Integer daysUntilExpire) {
    this.daysUntilExpire = daysUntilExpire;
  }


  public SendEnvelopeDescription callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * The callback url of the envelope.
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The callback url of the envelope.")
  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public SendEnvelopeDescription statusUpdateCallbackUrl(String statusUpdateCallbackUrl) {
    
    this.statusUpdateCallbackUrl = statusUpdateCallbackUrl;
    return this;
  }

   /**
   * The callback url of status changes for the envelope.
   * @return statusUpdateCallbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The callback url of status changes for the envelope.")
  @JsonProperty(JSON_PROPERTY_STATUS_UPDATE_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusUpdateCallbackUrl() {
    return statusUpdateCallbackUrl;
  }


  public void setStatusUpdateCallbackUrl(String statusUpdateCallbackUrl) {
    this.statusUpdateCallbackUrl = statusUpdateCallbackUrl;
  }


  public SendEnvelopeDescription workstepEventCallback(WorkstepEventCallback workstepEventCallback) {
    
    this.workstepEventCallback = workstepEventCallback;
    return this;
  }

   /**
   * Get workstepEventCallback
   * @return workstepEventCallback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKSTEP_EVENT_CALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkstepEventCallback getWorkstepEventCallback() {
    return workstepEventCallback;
  }


  public void setWorkstepEventCallback(WorkstepEventCallback workstepEventCallback) {
    this.workstepEventCallback = workstepEventCallback;
  }


  public SendEnvelopeDescription steps(List<SendEnvelopeStep> steps) {
    
    this.steps = steps;
    return this;
  }

  public SendEnvelopeDescription addStepsItem(SendEnvelopeStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<SendEnvelopeStep>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * The steps for the envelope.
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The steps for the envelope.")
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendEnvelopeStep> getSteps() {
    return steps;
  }


  public void setSteps(List<SendEnvelopeStep> steps) {
    this.steps = steps;
  }


  public SendEnvelopeDescription addFormFields(AddFormFields addFormFields) {
    
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


  public SendEnvelopeDescription overrideFormFieldValues(OverrideFormFieldOptions overrideFormFieldValues) {
    
    this.overrideFormFieldValues = overrideFormFieldValues;
    return this;
  }

   /**
   * Get overrideFormFieldValues
   * @return overrideFormFieldValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERRIDE_FORM_FIELD_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OverrideFormFieldOptions getOverrideFormFieldValues() {
    return overrideFormFieldValues;
  }


  public void setOverrideFormFieldValues(OverrideFormFieldOptions overrideFormFieldValues) {
    this.overrideFormFieldValues = overrideFormFieldValues;
  }


  public SendEnvelopeDescription metaDataXml(String metaDataXml) {
    
    this.metaDataXml = metaDataXml;
    return this;
  }

   /**
   * Get metaDataXml
   * @return metaDataXml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META_DATA_XML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetaDataXml() {
    return metaDataXml;
  }


  public void setMetaDataXml(String metaDataXml) {
    this.metaDataXml = metaDataXml;
  }


  public SendEnvelopeDescription attachSignedDocumentsToEnvelopeLog(Boolean attachSignedDocumentsToEnvelopeLog) {
    
    this.attachSignedDocumentsToEnvelopeLog = attachSignedDocumentsToEnvelopeLog;
    return this;
  }

   /**
   * If true, the signed document(s) will be added to the envelope log as attachment.
   * @return attachSignedDocumentsToEnvelopeLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the signed document(s) will be added to the envelope log as attachment.")
  @JsonProperty(JSON_PROPERTY_ATTACH_SIGNED_DOCUMENTS_TO_ENVELOPE_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAttachSignedDocumentsToEnvelopeLog() {
    return attachSignedDocumentsToEnvelopeLog;
  }


  public void setAttachSignedDocumentsToEnvelopeLog(Boolean attachSignedDocumentsToEnvelopeLog) {
    this.attachSignedDocumentsToEnvelopeLog = attachSignedDocumentsToEnvelopeLog;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEnvelopeDescription sendEnvelopeDescription = (SendEnvelopeDescription) o;
    return Objects.equals(this.name, sendEnvelopeDescription.name) &&
        Objects.equals(this.emailSubject, sendEnvelopeDescription.emailSubject) &&
        Objects.equals(this.emailBody, sendEnvelopeDescription.emailBody) &&
        Objects.equals(this.displayedEmailSender, sendEnvelopeDescription.displayedEmailSender) &&
        Objects.equals(this.enableReminders, sendEnvelopeDescription.enableReminders) &&
        Objects.equals(this.firstReminderDayAmount, sendEnvelopeDescription.firstReminderDayAmount) &&
        Objects.equals(this.recurrentReminderDayAmount, sendEnvelopeDescription.recurrentReminderDayAmount) &&
        Objects.equals(this.beforeExpirationDayAmount, sendEnvelopeDescription.beforeExpirationDayAmount) &&
        Objects.equals(this.daysUntilExpire, sendEnvelopeDescription.daysUntilExpire) &&
        Objects.equals(this.callbackUrl, sendEnvelopeDescription.callbackUrl) &&
        Objects.equals(this.statusUpdateCallbackUrl, sendEnvelopeDescription.statusUpdateCallbackUrl) &&
        Objects.equals(this.workstepEventCallback, sendEnvelopeDescription.workstepEventCallback) &&
        Objects.equals(this.steps, sendEnvelopeDescription.steps) &&
        Objects.equals(this.addFormFields, sendEnvelopeDescription.addFormFields) &&
        Objects.equals(this.overrideFormFieldValues, sendEnvelopeDescription.overrideFormFieldValues) &&
        Objects.equals(this.metaDataXml, sendEnvelopeDescription.metaDataXml) &&
        Objects.equals(this.attachSignedDocumentsToEnvelopeLog, sendEnvelopeDescription.attachSignedDocumentsToEnvelopeLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, emailSubject, emailBody, displayedEmailSender, enableReminders, firstReminderDayAmount, recurrentReminderDayAmount, beforeExpirationDayAmount, daysUntilExpire, callbackUrl, statusUpdateCallbackUrl, workstepEventCallback, steps, addFormFields, overrideFormFieldValues, metaDataXml, attachSignedDocumentsToEnvelopeLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEnvelopeDescription {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    emailBody: ").append(toIndentedString(emailBody)).append("\n");
    sb.append("    displayedEmailSender: ").append(toIndentedString(displayedEmailSender)).append("\n");
    sb.append("    enableReminders: ").append(toIndentedString(enableReminders)).append("\n");
    sb.append("    firstReminderDayAmount: ").append(toIndentedString(firstReminderDayAmount)).append("\n");
    sb.append("    recurrentReminderDayAmount: ").append(toIndentedString(recurrentReminderDayAmount)).append("\n");
    sb.append("    beforeExpirationDayAmount: ").append(toIndentedString(beforeExpirationDayAmount)).append("\n");
    sb.append("    daysUntilExpire: ").append(toIndentedString(daysUntilExpire)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    statusUpdateCallbackUrl: ").append(toIndentedString(statusUpdateCallbackUrl)).append("\n");
    sb.append("    workstepEventCallback: ").append(toIndentedString(workstepEventCallback)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    addFormFields: ").append(toIndentedString(addFormFields)).append("\n");
    sb.append("    overrideFormFieldValues: ").append(toIndentedString(overrideFormFieldValues)).append("\n");
    sb.append("    metaDataXml: ").append(toIndentedString(metaDataXml)).append("\n");
    sb.append("    attachSignedDocumentsToEnvelopeLog: ").append(toIndentedString(attachSignedDocumentsToEnvelopeLog)).append("\n");
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

