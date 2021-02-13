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
 * Representation of s team member.
 */
@ApiModel(description = "Representation of s team member.")
@JsonPropertyOrder({
  TeamMember.JSON_PROPERTY_EMAIL,
  TeamMember.JSON_PROPERTY_MEMBERS
})
@JsonTypeName("TeamMember")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class TeamMember {
  public static final String JSON_PROPERTY_EMAIL = "Email";
  private String email;

  public static final String JSON_PROPERTY_MEMBERS = "Members";
  private List<TeamMember> members = null;


  public TeamMember email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email of the team member.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email of the team member.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public TeamMember members(List<TeamMember> members) {
    
    this.members = members;
    return this;
  }

  public TeamMember addMembersItem(TeamMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<TeamMember>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * The team members which are one hiarchy step deeper.
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The team members which are one hiarchy step deeper.")
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TeamMember> getMembers() {
    return members;
  }


  public void setMembers(List<TeamMember> members) {
    this.members = members;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamMember teamMember = (TeamMember) o;
    return Objects.equals(this.email, teamMember.email) &&
        Objects.equals(this.members, teamMember.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMember {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

