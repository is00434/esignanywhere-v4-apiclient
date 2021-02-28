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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines the events that should be send.
 */
@ApiModel(description = "Defines the events that should be send.")
@JsonPropertyOrder({
  NotificationEventsToSend.JSON_PROPERTY_NOTIFICATION_EVENTS
})
@JsonTypeName("NotificationEventsToSend")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class NotificationEventsToSend {
  /**
   * Gets or Sets notificationEvents
   */
  public enum NotificationEventsEnum {
    CONFIRMTRANSACTIONCODE("ConfirmTransactionCode"),
    
    DEFAULTEVENTTYPE("DefaultEventType"),
    
    AGREEMENTACCEPTED("AgreementAccepted"),
    
    AGREEMENTREJECTED("AgreementRejected"),
    
    REQUESTPREPAREAUTHENTICATIONINFORMATIONSUCCESS("RequestPrepareAuthenticationInformationSuccess"),
    
    PREPAREAUTHENTICATIONSUCCESS("PrepareAuthenticationSuccess"),
    
    AUTHENTICATIONFAILED("AuthenticationFailed"),
    
    AUTHENTICATIONREJECTED("AuthenticationRejected"),
    
    AUTHENTICATIONSUCCESS("AuthenticationSuccess"),
    
    REAUTHENTICATIONFAILED("ReAuthenticationFailed"),
    
    AUDITTRAILREQUESTED("AuditTrailRequested"),
    
    AUDITTRAILXMLREQUESTED("AuditTrailXmlRequested"),
    
    CALLEDPAGE("CalledPage"),
    
    WHOISINFORMATION("WhoIsInformation"),
    
    DOCUMENTDOWNLOADED("DocumentDownloaded"),
    
    FLATTENEDDOCUMENTDOWNLOADED("FlattenedDocumentDownloaded"),
    
    ADDEDANNOTATION("AddedAnnotation"),
    
    ADDEDATTACHMENT("AddedAttachment"),
    
    APPENDEDDOCUMENT("AppendedDocument"),
    
    FORMSFILLED("FormsFilled"),
    
    CONFIRMREADING("ConfirmReading"),
    
    PAGEVIEWCHANGED("PageViewChanged"),
    
    SENDTRANSACTIONCODE("SendTransactionCode"),
    
    PREPARESIGNWORKSTEPDOCUMENT("PrepareSignWorkstepDocument"),
    
    SIGNWORKSTEPDOCUMENT("SignWorkstepDocument"),
    
    UNDOACTION("UndoAction"),
    
    WORKSTEPCREATED("WorkstepCreated"),
    
    WORKSTEPFINISHED("WorkstepFinished"),
    
    WORKSTEPREJECTED("WorkstepRejected"),
    
    DISABLEPOLICYANDVALIDITYCHECKS("DisablePolicyAndValidityChecks"),
    
    ENABLEPOLICYANDVALIDITYCHECKS("EnablePolicyAndValidityChecks"),
    
    APPENDFILETOWORKSTEP("AppendFileToWorkstep"),
    
    APPENDTASKSTOWORKSTEP("AppendTasksToWorkstep"),
    
    SETOPTIONALDOCUMENTSTATE("SetOptionalDocumentState"),
    
    STARTBATCH("StartBatch"),
    
    ENDBATCH("EndBatch"),
    
    PREPAREPAYLOADFORBATCH("PreparePayloadForBatch");

    private String value;

    NotificationEventsEnum(String value) {
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
    public static NotificationEventsEnum fromValue(String value) {
      for (NotificationEventsEnum b : NotificationEventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NOTIFICATION_EVENTS = "NotificationEvents";
  private List<NotificationEventsEnum> notificationEvents = null;


  public NotificationEventsToSend notificationEvents(List<NotificationEventsEnum> notificationEvents) {
    
    this.notificationEvents = notificationEvents;
    return this;
  }

  public NotificationEventsToSend addNotificationEventsItem(NotificationEventsEnum notificationEventsItem) {
    if (this.notificationEvents == null) {
      this.notificationEvents = new ArrayList<NotificationEventsEnum>();
    }
    this.notificationEvents.add(notificationEventsItem);
    return this;
  }

   /**
   * Collection of notification event types.
   * @return notificationEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of notification event types.")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NotificationEventsEnum> getNotificationEvents() {
    return notificationEvents;
  }


  public void setNotificationEvents(List<NotificationEventsEnum> notificationEvents) {
    this.notificationEvents = notificationEvents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationEventsToSend notificationEventsToSend = (NotificationEventsToSend) o;
    return Objects.equals(this.notificationEvents, notificationEventsToSend.notificationEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationEventsToSend {\n");
    sb.append("    notificationEvents: ").append(toIndentedString(notificationEvents)).append("\n");
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

