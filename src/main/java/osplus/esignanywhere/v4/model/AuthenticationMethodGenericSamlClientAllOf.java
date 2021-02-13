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
 * AuthenticationMethodGenericSamlClientAllOf
 */
@JsonPropertyOrder({
  AuthenticationMethodGenericSamlClientAllOf.JSON_PROPERTY_PROVIDER_IDENTIFIER,
  AuthenticationMethodGenericSamlClientAllOf.JSON_PROPERTY_CHECKS,
  AuthenticationMethodGenericSamlClientAllOf.JSON_PROPERTY_FIELDS,
  AuthenticationMethodGenericSamlClientAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("AuthenticationMethodGenericSamlClient_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class AuthenticationMethodGenericSamlClientAllOf {
  public static final String JSON_PROPERTY_PROVIDER_IDENTIFIER = "ProviderIdentifier";
  private String providerIdentifier;

  public static final String JSON_PROPERTY_CHECKS = "Checks";
  private List<AuthenticationMethodCheck> checks = null;

  public static final String JSON_PROPERTY_FIELDS = "Fields";
  private List<KeyValuePair> fields = null;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  private String discriminatorType;


  public AuthenticationMethodGenericSamlClientAllOf providerIdentifier(String providerIdentifier) {
    
    this.providerIdentifier = providerIdentifier;
    return this;
  }

   /**
   * Provider identifier.
   * @return providerIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provider identifier.")
  @JsonProperty(JSON_PROPERTY_PROVIDER_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderIdentifier() {
    return providerIdentifier;
  }


  public void setProviderIdentifier(String providerIdentifier) {
    this.providerIdentifier = providerIdentifier;
  }


  public AuthenticationMethodGenericSamlClientAllOf checks(List<AuthenticationMethodCheck> checks) {
    
    this.checks = checks;
    return this;
  }

  public AuthenticationMethodGenericSamlClientAllOf addChecksItem(AuthenticationMethodCheck checksItem) {
    if (this.checks == null) {
      this.checks = new ArrayList<AuthenticationMethodCheck>();
    }
    this.checks.add(checksItem);
    return this;
  }

   /**
   * Checks for the authentication.
   * @return checks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Checks for the authentication.")
  @JsonProperty(JSON_PROPERTY_CHECKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AuthenticationMethodCheck> getChecks() {
    return checks;
  }


  public void setChecks(List<AuthenticationMethodCheck> checks) {
    this.checks = checks;
  }


  public AuthenticationMethodGenericSamlClientAllOf fields(List<KeyValuePair> fields) {
    
    this.fields = fields;
    return this;
  }

  public AuthenticationMethodGenericSamlClientAllOf addFieldsItem(KeyValuePair fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<KeyValuePair>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields for the authentication.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields for the authentication.")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<KeyValuePair> getFields() {
    return fields;
  }


  public void setFields(List<KeyValuePair> fields) {
    this.fields = fields;
  }


  public AuthenticationMethodGenericSamlClientAllOf discriminatorType(String discriminatorType) {
    
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
    AuthenticationMethodGenericSamlClientAllOf authenticationMethodGenericSamlClientAllOf = (AuthenticationMethodGenericSamlClientAllOf) o;
    return Objects.equals(this.providerIdentifier, authenticationMethodGenericSamlClientAllOf.providerIdentifier) &&
        Objects.equals(this.checks, authenticationMethodGenericSamlClientAllOf.checks) &&
        Objects.equals(this.fields, authenticationMethodGenericSamlClientAllOf.fields) &&
        Objects.equals(this.discriminatorType, authenticationMethodGenericSamlClientAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerIdentifier, checks, fields, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMethodGenericSamlClientAllOf {\n");
    sb.append("    providerIdentifier: ").append(toIndentedString(providerIdentifier)).append("\n");
    sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
