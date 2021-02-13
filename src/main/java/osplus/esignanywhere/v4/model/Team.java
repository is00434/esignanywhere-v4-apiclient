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
 * A representation of a team in eSignAnyWhere.
 */
@ApiModel(description = "A representation of a team in eSignAnyWhere.")
@JsonPropertyOrder({
  Team.JSON_PROPERTY_NAME,
  Team.JSON_PROPERTY_ALLOW_ENVELOPE_SHARING_WITHIN_TEAM,
  Team.JSON_PROPERTY_ALLOW_TEMPLATE_SHARING_WITHIN_TEAM,
  Team.JSON_PROPERTY_HEAD
})
@JsonTypeName("Team")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class Team {
  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_ALLOW_ENVELOPE_SHARING_WITHIN_TEAM = "AllowEnvelopeSharingWithinTeam";
  private Boolean allowEnvelopeSharingWithinTeam = false;

  public static final String JSON_PROPERTY_ALLOW_TEMPLATE_SHARING_WITHIN_TEAM = "AllowTemplateSharingWithinTeam";
  private Boolean allowTemplateSharingWithinTeam = false;

  public static final String JSON_PROPERTY_HEAD = "Head";
  private TeamMember head;


  public Team name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the team.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the team.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Team allowEnvelopeSharingWithinTeam(Boolean allowEnvelopeSharingWithinTeam) {
    
    this.allowEnvelopeSharingWithinTeam = allowEnvelopeSharingWithinTeam;
    return this;
  }

   /**
   * Indicates if envelopes are shared among members of this team.
   * @return allowEnvelopeSharingWithinTeam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if envelopes are shared among members of this team.")
  @JsonProperty(JSON_PROPERTY_ALLOW_ENVELOPE_SHARING_WITHIN_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowEnvelopeSharingWithinTeam() {
    return allowEnvelopeSharingWithinTeam;
  }


  public void setAllowEnvelopeSharingWithinTeam(Boolean allowEnvelopeSharingWithinTeam) {
    this.allowEnvelopeSharingWithinTeam = allowEnvelopeSharingWithinTeam;
  }


  public Team allowTemplateSharingWithinTeam(Boolean allowTemplateSharingWithinTeam) {
    
    this.allowTemplateSharingWithinTeam = allowTemplateSharingWithinTeam;
    return this;
  }

   /**
   * Indicates if templates are shared among members of this team.
   * @return allowTemplateSharingWithinTeam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if templates are shared among members of this team.")
  @JsonProperty(JSON_PROPERTY_ALLOW_TEMPLATE_SHARING_WITHIN_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowTemplateSharingWithinTeam() {
    return allowTemplateSharingWithinTeam;
  }


  public void setAllowTemplateSharingWithinTeam(Boolean allowTemplateSharingWithinTeam) {
    this.allowTemplateSharingWithinTeam = allowTemplateSharingWithinTeam;
  }


  public Team head(TeamMember head) {
    
    this.head = head;
    return this;
  }

   /**
   * Get head
   * @return head
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TeamMember getHead() {
    return head;
  }


  public void setHead(TeamMember head) {
    this.head = head;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Team team = (Team) o;
    return Objects.equals(this.name, team.name) &&
        Objects.equals(this.allowEnvelopeSharingWithinTeam, team.allowEnvelopeSharingWithinTeam) &&
        Objects.equals(this.allowTemplateSharingWithinTeam, team.allowTemplateSharingWithinTeam) &&
        Objects.equals(this.head, team.head);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, allowEnvelopeSharingWithinTeam, allowTemplateSharingWithinTeam, head);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Team {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    allowEnvelopeSharingWithinTeam: ").append(toIndentedString(allowEnvelopeSharingWithinTeam)).append("\n");
    sb.append("    allowTemplateSharingWithinTeam: ").append(toIndentedString(allowTemplateSharingWithinTeam)).append("\n");
    sb.append("    head: ").append(toIndentedString(head)).append("\n");
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
