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
 * Defines a server action.
 */
@ApiModel(description = "Defines a server action.")
@JsonPropertyOrder({
  ServerAction.JSON_PROPERTY_CALL_SYNCHRONOUS,
  ServerAction.JSON_PROPERTY_ACTION
})
@JsonTypeName("ServerAction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class ServerAction {
  public static final String JSON_PROPERTY_CALL_SYNCHRONOUS = "CallSynchronous";
  private Boolean callSynchronous = true;

  public static final String JSON_PROPERTY_ACTION = "Action";
  private String action;


  public ServerAction callSynchronous(Boolean callSynchronous) {
    
    this.callSynchronous = callSynchronous;
    return this;
  }

   /**
   * Wether the server should call that action before returning to the client which called FinishWorkstep.
   * @return callSynchronous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Wether the server should call that action before returning to the client which called FinishWorkstep.")
  @JsonProperty(JSON_PROPERTY_CALL_SYNCHRONOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCallSynchronous() {
    return callSynchronous;
  }


  public void setCallSynchronous(Boolean callSynchronous) {
    this.callSynchronous = callSynchronous;
  }


  public ServerAction action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Url of the server side action.
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url of the server side action.")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerAction serverAction = (ServerAction) o;
    return Objects.equals(this.callSynchronous, serverAction.callSynchronous) &&
        Objects.equals(this.action, serverAction.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callSynchronous, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerAction {\n");
    sb.append("    callSynchronous: ").append(toIndentedString(callSynchronous)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

