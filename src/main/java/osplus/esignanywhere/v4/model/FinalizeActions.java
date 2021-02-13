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
 * Allows to define actions which will be executed when the workstep will be finished. Those actions are performed before the ServerAction will be called and, depending on the type of the action, it might change the documents according to the workstep!
 */
@ApiModel(description = "Allows to define actions which will be executed when the workstep will be finished. Those actions are performed before the ServerAction will be called and, depending on the type of the action, it might change the documents according to the workstep!")
@JsonPropertyOrder({
  FinalizeActions.JSON_PROPERTY_FINALIZE_ACTION_LIST
})
@JsonTypeName("FinalizeActions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class FinalizeActions {
  public static final String JSON_PROPERTY_FINALIZE_ACTION_LIST = "FinalizeActionList";
  private List<FinalizeAction> finalizeActionList = null;


  public FinalizeActions finalizeActionList(List<FinalizeAction> finalizeActionList) {
    
    this.finalizeActionList = finalizeActionList;
    return this;
  }

  public FinalizeActions addFinalizeActionListItem(FinalizeAction finalizeActionListItem) {
    if (this.finalizeActionList == null) {
      this.finalizeActionList = new ArrayList<FinalizeAction>();
    }
    this.finalizeActionList.add(finalizeActionListItem);
    return this;
  }

   /**
   * Collection of finalize actions.
   * @return finalizeActionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of finalize actions.")
  @JsonProperty(JSON_PROPERTY_FINALIZE_ACTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FinalizeAction> getFinalizeActionList() {
    return finalizeActionList;
  }


  public void setFinalizeActionList(List<FinalizeAction> finalizeActionList) {
    this.finalizeActionList = finalizeActionList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinalizeActions finalizeActions = (FinalizeActions) o;
    return Objects.equals(this.finalizeActionList, finalizeActions.finalizeActionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalizeActionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinalizeActions {\n");
    sb.append("    finalizeActionList: ").append(toIndentedString(finalizeActionList)).append("\n");
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
