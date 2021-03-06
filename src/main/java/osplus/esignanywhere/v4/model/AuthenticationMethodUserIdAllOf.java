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
 * AuthenticationMethodUserIdAllOf
 */
@JsonPropertyOrder({
  AuthenticationMethodUserIdAllOf.JSON_PROPERTY_USER_IDS,
  AuthenticationMethodUserIdAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("AuthenticationMethodUserId_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class AuthenticationMethodUserIdAllOf {
  public static final String JSON_PROPERTY_USER_IDS = "UserIds";
  private List<String> userIds = null;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  private String discriminatorType;


  public AuthenticationMethodUserIdAllOf userIds(List<String> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public AuthenticationMethodUserIdAllOf addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<String>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * The list of userids that are allowed to access the document.
   * @return userIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of userids that are allowed to access the document.")
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public AuthenticationMethodUserIdAllOf discriminatorType(String discriminatorType) {
    
    this.discriminatorType = discriminatorType;
    return this;
  }

   /**
   * Property for parsing abstract base classes (polymorphism) in auto generated Swagger code.
   * @return discriminatorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Property for parsing abstract base classes (polymorphism) in auto generated Swagger code.")
  @JsonProperty(JSON_PROPERTY_DISCRIMINATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDiscriminatorType() {
    return discriminatorType;
  }


  public void setDiscriminatorType(String discriminatorType) {
    this.discriminatorType = discriminatorType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationMethodUserIdAllOf authenticationMethodUserIdAllOf = (AuthenticationMethodUserIdAllOf) o;
    return Objects.equals(this.userIds, authenticationMethodUserIdAllOf.userIds) &&
        Objects.equals(this.discriminatorType, authenticationMethodUserIdAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMethodUserIdAllOf {\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    discriminatorType: ").append(toIndentedString(discriminatorType)).append("\n");
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

