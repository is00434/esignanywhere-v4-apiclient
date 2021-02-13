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
 * Defines the reassignments after the deletion of a user.
 */
@ApiModel(description = "Defines the reassignments after the deletion of a user.")
@JsonPropertyOrder({
  DeleteUserReassignDescriptor.JSON_PROPERTY_USER_ID,
  DeleteUserReassignDescriptor.JSON_PROPERTY_REASSIGN_DRAFTS,
  DeleteUserReassignDescriptor.JSON_PROPERTY_REASSIGN_TEMPLATES,
  DeleteUserReassignDescriptor.JSON_PROPERTY_REASSIGN_CLIPBOARD,
  DeleteUserReassignDescriptor.JSON_PROPERTY_REASSIGN_ADDRESS_BOOK
})
@JsonTypeName("DeleteUserReassignDescriptor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class DeleteUserReassignDescriptor {
  public static final String JSON_PROPERTY_USER_ID = "UserId";
  private String userId;

  public static final String JSON_PROPERTY_REASSIGN_DRAFTS = "ReassignDrafts";
  private Boolean reassignDrafts;

  public static final String JSON_PROPERTY_REASSIGN_TEMPLATES = "ReassignTemplates";
  private Boolean reassignTemplates;

  public static final String JSON_PROPERTY_REASSIGN_CLIPBOARD = "ReassignClipboard";
  private Boolean reassignClipboard;

  public static final String JSON_PROPERTY_REASSIGN_ADDRESS_BOOK = "ReassignAddressBook";
  private Boolean reassignAddressBook;


  public DeleteUserReassignDescriptor userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user which receives the assignments.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the user which receives the assignments.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public DeleteUserReassignDescriptor reassignDrafts(Boolean reassignDrafts) {
    
    this.reassignDrafts = reassignDrafts;
    return this;
  }

   /**
   * Reassigns drafts if true.
   * @return reassignDrafts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reassigns drafts if true.")
  @JsonProperty(JSON_PROPERTY_REASSIGN_DRAFTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReassignDrafts() {
    return reassignDrafts;
  }


  public void setReassignDrafts(Boolean reassignDrafts) {
    this.reassignDrafts = reassignDrafts;
  }


  public DeleteUserReassignDescriptor reassignTemplates(Boolean reassignTemplates) {
    
    this.reassignTemplates = reassignTemplates;
    return this;
  }

   /**
   * Reassigns templates if true.
   * @return reassignTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reassigns templates if true.")
  @JsonProperty(JSON_PROPERTY_REASSIGN_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReassignTemplates() {
    return reassignTemplates;
  }


  public void setReassignTemplates(Boolean reassignTemplates) {
    this.reassignTemplates = reassignTemplates;
  }


  public DeleteUserReassignDescriptor reassignClipboard(Boolean reassignClipboard) {
    
    this.reassignClipboard = reassignClipboard;
    return this;
  }

   /**
   * Reassigns clipboard items if true.
   * @return reassignClipboard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reassigns clipboard items if true.")
  @JsonProperty(JSON_PROPERTY_REASSIGN_CLIPBOARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReassignClipboard() {
    return reassignClipboard;
  }


  public void setReassignClipboard(Boolean reassignClipboard) {
    this.reassignClipboard = reassignClipboard;
  }


  public DeleteUserReassignDescriptor reassignAddressBook(Boolean reassignAddressBook) {
    
    this.reassignAddressBook = reassignAddressBook;
    return this;
  }

   /**
   * Reassigns address book entries if true.
   * @return reassignAddressBook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reassigns address book entries if true.")
  @JsonProperty(JSON_PROPERTY_REASSIGN_ADDRESS_BOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReassignAddressBook() {
    return reassignAddressBook;
  }


  public void setReassignAddressBook(Boolean reassignAddressBook) {
    this.reassignAddressBook = reassignAddressBook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteUserReassignDescriptor deleteUserReassignDescriptor = (DeleteUserReassignDescriptor) o;
    return Objects.equals(this.userId, deleteUserReassignDescriptor.userId) &&
        Objects.equals(this.reassignDrafts, deleteUserReassignDescriptor.reassignDrafts) &&
        Objects.equals(this.reassignTemplates, deleteUserReassignDescriptor.reassignTemplates) &&
        Objects.equals(this.reassignClipboard, deleteUserReassignDescriptor.reassignClipboard) &&
        Objects.equals(this.reassignAddressBook, deleteUserReassignDescriptor.reassignAddressBook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, reassignDrafts, reassignTemplates, reassignClipboard, reassignAddressBook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteUserReassignDescriptor {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    reassignDrafts: ").append(toIndentedString(reassignDrafts)).append("\n");
    sb.append("    reassignTemplates: ").append(toIndentedString(reassignTemplates)).append("\n");
    sb.append("    reassignClipboard: ").append(toIndentedString(reassignClipboard)).append("\n");
    sb.append("    reassignAddressBook: ").append(toIndentedString(reassignAddressBook)).append("\n");
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

