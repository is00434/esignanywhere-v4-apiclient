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
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateUserResult
 */
@JsonPropertyOrder({
  CreateUserResult.JSON_PROPERTY_CREATED_USER_IDS
})
@JsonTypeName("CreateUserResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class CreateUserResult {
  public static final String JSON_PROPERTY_CREATED_USER_IDS = "CreatedUserIds";
  private List<UUID> createdUserIds = null;


  public CreateUserResult createdUserIds(List<UUID> createdUserIds) {
    
    this.createdUserIds = createdUserIds;
    return this;
  }

  public CreateUserResult addCreatedUserIdsItem(UUID createdUserIdsItem) {
    if (this.createdUserIds == null) {
      this.createdUserIds = new ArrayList<UUID>();
    }
    this.createdUserIds.add(createdUserIdsItem);
    return this;
  }

   /**
   * Get createdUserIds
   * @return createdUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getCreatedUserIds() {
    return createdUserIds;
  }


  public void setCreatedUserIds(List<UUID> createdUserIds) {
    this.createdUserIds = createdUserIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserResult createUserResult = (CreateUserResult) o;
    return Objects.equals(this.createdUserIds, createUserResult.createdUserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdUserIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserResult {\n");
    sb.append("    createdUserIds: ").append(toIndentedString(createdUserIds)).append("\n");
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

