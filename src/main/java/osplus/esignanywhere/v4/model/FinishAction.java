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
 * Configure the actions done by the server and the by the clients when the workstep is finished.
 */
@ApiModel(description = "Configure the actions done by the server and the by the clients when the workstep is finished.")
@JsonPropertyOrder({
  FinishAction.JSON_PROPERTY_SERVER_ACTIONS,
  FinishAction.JSON_PROPERTY_CLIENT_ACTIONS
})
@JsonTypeName("FinishAction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class FinishAction {
  public static final String JSON_PROPERTY_SERVER_ACTIONS = "ServerActions";
  private List<ServerAction> serverActions = null;

  public static final String JSON_PROPERTY_CLIENT_ACTIONS = "ClientActions";
  private List<ClientAction> clientActions = null;


   /**
   * Configure the actions done by the server when the workstep is finished.
   * @return serverActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configure the actions done by the server when the workstep is finished.")
  @JsonProperty(JSON_PROPERTY_SERVER_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ServerAction> getServerActions() {
    return serverActions;
  }




  public FinishAction clientActions(List<ClientAction> clientActions) {
    
    this.clientActions = clientActions;
    return this;
  }

  public FinishAction addClientActionsItem(ClientAction clientActionsItem) {
    if (this.clientActions == null) {
      this.clientActions = new ArrayList<ClientAction>();
    }
    this.clientActions.add(clientActionsItem);
    return this;
  }

   /**
   * Client actions can specify the behavior of a specific client after a workstep is finished.
   * @return clientActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client actions can specify the behavior of a specific client after a workstep is finished.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ClientAction> getClientActions() {
    return clientActions;
  }


  public void setClientActions(List<ClientAction> clientActions) {
    this.clientActions = clientActions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinishAction finishAction = (FinishAction) o;
    return Objects.equals(this.serverActions, finishAction.serverActions) &&
        Objects.equals(this.clientActions, finishAction.clientActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverActions, clientActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinishAction {\n");
    sb.append("    serverActions: ").append(toIndentedString(serverActions)).append("\n");
    sb.append("    clientActions: ").append(toIndentedString(clientActions)).append("\n");
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

