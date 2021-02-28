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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Authentication with NamirialRemoteSignature.
 */
@ApiModel(description = "Authentication with NamirialRemoteSignature.")
@JsonPropertyOrder({
  AuthenticationMethodNamirialRemoteSignature.JSON_PROPERTY_DEVICE_ID,
  AuthenticationMethodNamirialRemoteSignature.JSON_PROPERTY_USER_ID,
  AuthenticationMethodNamirialRemoteSignature.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("AuthenticationMethodNamirialRemoteSignature")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)

public class AuthenticationMethodNamirialRemoteSignature extends AuthenticationMethod {
  public static final String JSON_PROPERTY_DEVICE_ID = "DeviceId";
  private String deviceId;

  public static final String JSON_PROPERTY_USER_ID = "UserId";
  private String userId;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  protected String discriminatorType;


  public AuthenticationMethodNamirialRemoteSignature deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Device identifier.
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Device identifier.")
  @JsonProperty(JSON_PROPERTY_DEVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public AuthenticationMethodNamirialRemoteSignature userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * User identifier.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User identifier.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AuthenticationMethodNamirialRemoteSignature discriminatorType(String discriminatorType) {
    
    this.discriminatorType = discriminatorType;
    return this;
  }

   /**
   * Property for parsing abstract base classes (polymorphism) in auto generated Swagger code.
   * @return discriminatorType
  **/
  @ApiModelProperty(required = true, value = "Property for parsing abstract base classes (polymorphism) in auto generated Swagger code.")
  @JsonProperty(JSON_PROPERTY_DISCRIMINATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
    AuthenticationMethodNamirialRemoteSignature authenticationMethodNamirialRemoteSignature = (AuthenticationMethodNamirialRemoteSignature) o;
    return Objects.equals(this.deviceId, authenticationMethodNamirialRemoteSignature.deviceId) &&
        Objects.equals(this.userId, authenticationMethodNamirialRemoteSignature.userId) &&
        Objects.equals(this.discriminatorType, authenticationMethodNamirialRemoteSignature.discriminatorType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, userId, discriminatorType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMethodNamirialRemoteSignature {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

