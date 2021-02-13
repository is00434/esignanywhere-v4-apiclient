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
 * Workstep policies.
 */
@ApiModel(description = "Workstep policies.")
@JsonPropertyOrder({
  Policy.JSON_PROPERTY_GENERAL_POLICIES,
  Policy.JSON_PROPERTY_WORKSTEP_TASKS,
  Policy.JSON_PROPERTY_FINALIZE_ACTIONS
})
@JsonTypeName("Policy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class Policy {
  public static final String JSON_PROPERTY_GENERAL_POLICIES = "GeneralPolicies";
  private GeneralPolicies generalPolicies;

  public static final String JSON_PROPERTY_WORKSTEP_TASKS = "WorkstepTasks";
  private WorkstepTasks workstepTasks;

  public static final String JSON_PROPERTY_FINALIZE_ACTIONS = "FinalizeActions";
  private FinalizeActions finalizeActions;


  public Policy generalPolicies(GeneralPolicies generalPolicies) {
    
    this.generalPolicies = generalPolicies;
    return this;
  }

   /**
   * Get generalPolicies
   * @return generalPolicies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENERAL_POLICIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GeneralPolicies getGeneralPolicies() {
    return generalPolicies;
  }


  public void setGeneralPolicies(GeneralPolicies generalPolicies) {
    this.generalPolicies = generalPolicies;
  }


  public Policy workstepTasks(WorkstepTasks workstepTasks) {
    
    this.workstepTasks = workstepTasks;
    return this;
  }

   /**
   * Get workstepTasks
   * @return workstepTasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKSTEP_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkstepTasks getWorkstepTasks() {
    return workstepTasks;
  }


  public void setWorkstepTasks(WorkstepTasks workstepTasks) {
    this.workstepTasks = workstepTasks;
  }


  public Policy finalizeActions(FinalizeActions finalizeActions) {
    
    this.finalizeActions = finalizeActions;
    return this;
  }

   /**
   * Get finalizeActions
   * @return finalizeActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FINALIZE_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FinalizeActions getFinalizeActions() {
    return finalizeActions;
  }


  public void setFinalizeActions(FinalizeActions finalizeActions) {
    this.finalizeActions = finalizeActions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.generalPolicies, policy.generalPolicies) &&
        Objects.equals(this.workstepTasks, policy.workstepTasks) &&
        Objects.equals(this.finalizeActions, policy.finalizeActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generalPolicies, workstepTasks, finalizeActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    sb.append("    generalPolicies: ").append(toIndentedString(generalPolicies)).append("\n");
    sb.append("    workstepTasks: ").append(toIndentedString(workstepTasks)).append("\n");
    sb.append("    finalizeActions: ").append(toIndentedString(finalizeActions)).append("\n");
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
