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
 * AuthenticationMethodGenericOAuthClientAllOf
 */
@JsonPropertyOrder({
  AuthenticationMethodGenericOAuthClientAllOf.JSON_PROPERTY_SCOPE,
  AuthenticationMethodGenericOAuthClientAllOf.JSON_PROPERTY_PROVIDER_IDENTIFIER,
  AuthenticationMethodGenericOAuthClientAllOf.JSON_PROPERTY_RESOURCE_URIS,
  AuthenticationMethodGenericOAuthClientAllOf.JSON_PROPERTY_CHECKS,
  AuthenticationMethodGenericOAuthClientAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("AuthenticationMethodGenericOAuthClient_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class AuthenticationMethodGenericOAuthClientAllOf {
  public static final String JSON_PROPERTY_SCOPE = "Scope";
  private String scope;

  public static final String JSON_PROPERTY_PROVIDER_IDENTIFIER = "ProviderIdentifier";
  private String providerIdentifier;

  public static final String JSON_PROPERTY_RESOURCE_URIS = "ResourceUris";
  private List<AuthenticationMethodResourceUri> resourceUris = null;

  public static final String JSON_PROPERTY_CHECKS = "Checks";
  private List<AuthenticationMethodCheck> checks = null;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  private String discriminatorType;


  public AuthenticationMethodGenericOAuthClientAllOf scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Scope of the authentication.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scope of the authentication.")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public AuthenticationMethodGenericOAuthClientAllOf providerIdentifier(String providerIdentifier) {
    
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


  public AuthenticationMethodGenericOAuthClientAllOf resourceUris(List<AuthenticationMethodResourceUri> resourceUris) {
    
    this.resourceUris = resourceUris;
    return this;
  }

  public AuthenticationMethodGenericOAuthClientAllOf addResourceUrisItem(AuthenticationMethodResourceUri resourceUrisItem) {
    if (this.resourceUris == null) {
      this.resourceUris = new ArrayList<AuthenticationMethodResourceUri>();
    }
    this.resourceUris.add(resourceUrisItem);
    return this;
  }

   /**
   * Resource uris of the authentication.
   * @return resourceUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource uris of the authentication.")
  @JsonProperty(JSON_PROPERTY_RESOURCE_URIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AuthenticationMethodResourceUri> getResourceUris() {
    return resourceUris;
  }


  public void setResourceUris(List<AuthenticationMethodResourceUri> resourceUris) {
    this.resourceUris = resourceUris;
  }


  public AuthenticationMethodGenericOAuthClientAllOf checks(List<AuthenticationMethodCheck> checks) {
    
    this.checks = checks;
    return this;
  }

  public AuthenticationMethodGenericOAuthClientAllOf addChecksItem(AuthenticationMethodCheck checksItem) {
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


  public AuthenticationMethodGenericOAuthClientAllOf discriminatorType(String discriminatorType) {
    
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
    AuthenticationMethodGenericOAuthClientAllOf authenticationMethodGenericOAuthClientAllOf = (AuthenticationMethodGenericOAuthClientAllOf) o;
    return Objects.equals(this.scope, authenticationMethodGenericOAuthClientAllOf.scope) &&
        Objects.equals(this.providerIdentifier, authenticationMethodGenericOAuthClientAllOf.providerIdentifier) &&
        Objects.equals(this.resourceUris, authenticationMethodGenericOAuthClientAllOf.resourceUris) &&
        Objects.equals(this.checks, authenticationMethodGenericOAuthClientAllOf.checks) &&
        Objects.equals(this.discriminatorType, authenticationMethodGenericOAuthClientAllOf.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, providerIdentifier, resourceUris, checks, discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMethodGenericOAuthClientAllOf {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    providerIdentifier: ").append(toIndentedString(providerIdentifier)).append("\n");
    sb.append("    resourceUris: ").append(toIndentedString(resourceUris)).append("\n");
    sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
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

