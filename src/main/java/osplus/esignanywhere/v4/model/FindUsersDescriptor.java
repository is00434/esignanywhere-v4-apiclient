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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Descriptor to filter users.
 */
@ApiModel(description = "Descriptor to filter users.")
@JsonPropertyOrder({
  FindUsersDescriptor.JSON_PROPERTY_ROLE,
  FindUsersDescriptor.JSON_PROPERTY_IS_USER_MANAGER,
  FindUsersDescriptor.JSON_PROPERTY_IS_AUTOMATED_DELEGATED_USER
})
@JsonTypeName("FindUsersDescriptor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class FindUsersDescriptor {
  /**
   * If set, filters by user role.
   */
  public enum RoleEnum {
    NONE("None"),
    
    POWERUSER("PowerUser"),
    
    REGISTEREDSIGNER("RegisteredSigner");

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "Role";
  private RoleEnum role;

  public static final String JSON_PROPERTY_IS_USER_MANAGER = "IsUserManager";
  private Boolean isUserManager;

  public static final String JSON_PROPERTY_IS_AUTOMATED_DELEGATED_USER = "IsAutomatedDelegatedUser";
  private Boolean isAutomatedDelegatedUser;


  public FindUsersDescriptor role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * If set, filters by user role.
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters by user role.")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public FindUsersDescriptor isUserManager(Boolean isUserManager) {
    
    this.isUserManager = isUserManager;
    return this;
  }

   /**
   * If set, filters if the user manager flag is set.
   * @return isUserManager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, filters if the user manager flag is set.")
  @JsonProperty(JSON_PROPERTY_IS_USER_MANAGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsUserManager() {
    return isUserManager;
  }


  public void setIsUserManager(Boolean isUserManager) {
    this.isUserManager = isUserManager;
  }


  public FindUsersDescriptor isAutomatedDelegatedUser(Boolean isAutomatedDelegatedUser) {
    
    this.isAutomatedDelegatedUser = isAutomatedDelegatedUser;
    return this;
  }

   /**
   * User call to find automated deligated users.
   * @return isAutomatedDelegatedUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User call to find automated deligated users.")
  @JsonProperty(JSON_PROPERTY_IS_AUTOMATED_DELEGATED_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAutomatedDelegatedUser() {
    return isAutomatedDelegatedUser;
  }


  public void setIsAutomatedDelegatedUser(Boolean isAutomatedDelegatedUser) {
    this.isAutomatedDelegatedUser = isAutomatedDelegatedUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindUsersDescriptor findUsersDescriptor = (FindUsersDescriptor) o;
    return Objects.equals(this.role, findUsersDescriptor.role) &&
        Objects.equals(this.isUserManager, findUsersDescriptor.isUserManager) &&
        Objects.equals(this.isAutomatedDelegatedUser, findUsersDescriptor.isAutomatedDelegatedUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, isUserManager, isAutomatedDelegatedUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindUsersDescriptor {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    isUserManager: ").append(toIndentedString(isUserManager)).append("\n");
    sb.append("    isAutomatedDelegatedUser: ").append(toIndentedString(isAutomatedDelegatedUser)).append("\n");
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

