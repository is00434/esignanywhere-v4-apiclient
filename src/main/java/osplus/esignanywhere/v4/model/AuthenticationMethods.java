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
 * Authentication methods.
 */
@ApiModel(description = "Authentication methods.")
@JsonPropertyOrder({
  AuthenticationMethods.JSON_PROPERTY_AUTHENTICATION_METHOD_LIST
})
@JsonTypeName("AuthenticationMethods")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class AuthenticationMethods {
  public static final String JSON_PROPERTY_AUTHENTICATION_METHOD_LIST = "AuthenticationMethodList";
  private List<AuthenticationMethod> authenticationMethodList = null;


  public AuthenticationMethods authenticationMethodList(List<AuthenticationMethod> authenticationMethodList) {
    
    this.authenticationMethodList = authenticationMethodList;
    return this;
  }

  public AuthenticationMethods addAuthenticationMethodListItem(AuthenticationMethod authenticationMethodListItem) {
    if (this.authenticationMethodList == null) {
      this.authenticationMethodList = new ArrayList<AuthenticationMethod>();
    }
    this.authenticationMethodList.add(authenticationMethodListItem);
    return this;
  }

   /**
   * Lists all configured authentication methods that can be used for this workstep.
   * @return authenticationMethodList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lists all configured authentication methods that can be used for this workstep.")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHOD_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AuthenticationMethod> getAuthenticationMethodList() {
    return authenticationMethodList;
  }


  public void setAuthenticationMethodList(List<AuthenticationMethod> authenticationMethodList) {
    this.authenticationMethodList = authenticationMethodList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationMethods authenticationMethods = (AuthenticationMethods) o;
    return Objects.equals(this.authenticationMethodList, authenticationMethods.authenticationMethodList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationMethodList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMethods {\n");
    sb.append("    authenticationMethodList: ").append(toIndentedString(authenticationMethodList)).append("\n");
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

