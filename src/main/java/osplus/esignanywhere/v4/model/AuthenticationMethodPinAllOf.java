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

import io.swagger.annotations.ApiModelProperty;

/**
 * AuthenticationMethodPinAllOf
 */
@JsonPropertyOrder({
  AuthenticationMethodPinAllOf.JSON_PROPERTY_PIN,
  AuthenticationMethodPinAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("AuthenticationMethodPin_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class AuthenticationMethodPinAllOf {
  public static final String JSON_PROPERTY_PIN = "Pin";
  private String pin;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  private String discriminatorType;


  public AuthenticationMethodPinAllOf pin(String pin) {
    
    this.pin = pin;
    return this;
  }

   /**
   * Pin to authenticate.
   * @return pin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pin to authenticate.")
  @JsonProperty(JSON_PROPERTY_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPin() {
    return pin;
  }


  public void setPin(String pin) {
    this.pin = pin;
  }


  public AuthenticationMethodPinAllOf discriminatorType(String discriminatorType) {
    
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
    AuthenticationMethodPinAllOf authenticationMethodPinAllOf = (AuthenticationMethodPinAllOf) o;
    return Objects.equals(this.pin, authenticationMethodPinAllOf.pin) &&
        Objects.equals(this.discriminatorType, authenticationMethodPinAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pin, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMethodPinAllOf {\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

