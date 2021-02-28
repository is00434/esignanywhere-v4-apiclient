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
 * AuthenticationMethodBankIdAllOf
 */
@JsonPropertyOrder({
  AuthenticationMethodBankIdAllOf.JSON_PROPERTY_PERSONAL_NUMBER,
  AuthenticationMethodBankIdAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("AuthenticationMethodBankId_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class AuthenticationMethodBankIdAllOf {
  public static final String JSON_PROPERTY_PERSONAL_NUMBER = "PersonalNumber";
  private String personalNumber;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  private String discriminatorType;


  public AuthenticationMethodBankIdAllOf personalNumber(String personalNumber) {
    
    this.personalNumber = personalNumber;
    return this;
  }

   /**
   * PersonalNumber to authenticate.
   * @return personalNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PersonalNumber to authenticate.")
  @JsonProperty(JSON_PROPERTY_PERSONAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPersonalNumber() {
    return personalNumber;
  }


  public void setPersonalNumber(String personalNumber) {
    this.personalNumber = personalNumber;
  }


  public AuthenticationMethodBankIdAllOf discriminatorType(String discriminatorType) {
    
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
    AuthenticationMethodBankIdAllOf authenticationMethodBankIdAllOf = (AuthenticationMethodBankIdAllOf) o;
    return Objects.equals(this.personalNumber, authenticationMethodBankIdAllOf.personalNumber) &&
        Objects.equals(this.discriminatorType, authenticationMethodBankIdAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalNumber, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMethodBankIdAllOf {\n");
    sb.append("    personalNumber: ").append(toIndentedString(personalNumber)).append("\n");
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

