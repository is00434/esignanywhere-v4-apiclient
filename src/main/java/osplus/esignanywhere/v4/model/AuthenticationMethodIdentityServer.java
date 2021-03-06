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
 * Uses the identity server as authentication method.
 */
@ApiModel(description = "Uses the identity server as authentication method.")
@JsonPropertyOrder({
  AuthenticationMethodIdentityServer.JSON_PROPERTY_IDENTITY_ID,
  AuthenticationMethodIdentityServer.JSON_PROPERTY_MODULE_ID,
  AuthenticationMethodIdentityServer.JSON_PROPERTY_TR_CONF_ID,
  AuthenticationMethodIdentityServer.JSON_PROPERTY_NEEDS_TO_PREPARE,
  AuthenticationMethodIdentityServer.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("AuthenticationMethodIdentityServer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)

public class AuthenticationMethodIdentityServer extends AuthenticationMethod {
  public static final String JSON_PROPERTY_IDENTITY_ID = "IdentityId";
  private String identityId;

  public static final String JSON_PROPERTY_MODULE_ID = "ModuleId";
  private String moduleId;

  public static final String JSON_PROPERTY_TR_CONF_ID = "TrConfId";
  private String trConfId;

  public static final String JSON_PROPERTY_NEEDS_TO_PREPARE = "NeedsToPrepare";
  private Boolean needsToPrepare;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  protected String discriminatorType;


  public AuthenticationMethodIdentityServer identityId(String identityId) {
    
    this.identityId = identityId;
    return this;
  }

   /**
   * Defines the id of the identity.
   * @return identityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the id of the identity.")
  @JsonProperty(JSON_PROPERTY_IDENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentityId() {
    return identityId;
  }


  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }


  public AuthenticationMethodIdentityServer moduleId(String moduleId) {
    
    this.moduleId = moduleId;
    return this;
  }

   /**
   * Defines the id of the module.
   * @return moduleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the id of the module.")
  @JsonProperty(JSON_PROPERTY_MODULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModuleId() {
    return moduleId;
  }


  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }


  public AuthenticationMethodIdentityServer trConfId(String trConfId) {
    
    this.trConfId = trConfId;
    return this;
  }

   /**
   * Defines the id of the trConfiguration
   * @return trConfId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the id of the trConfiguration")
  @JsonProperty(JSON_PROPERTY_TR_CONF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrConfId() {
    return trConfId;
  }


  public void setTrConfId(String trConfId) {
    this.trConfId = trConfId;
  }


  public AuthenticationMethodIdentityServer needsToPrepare(Boolean needsToPrepare) {
    
    this.needsToPrepare = needsToPrepare;
    return this;
  }

   /**
   * Defines if preparation is needed.
   * @return needsToPrepare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if preparation is needed.")
  @JsonProperty(JSON_PROPERTY_NEEDS_TO_PREPARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNeedsToPrepare() {
    return needsToPrepare;
  }


  public void setNeedsToPrepare(Boolean needsToPrepare) {
    this.needsToPrepare = needsToPrepare;
  }


  public AuthenticationMethodIdentityServer discriminatorType(String discriminatorType) {
    
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
    AuthenticationMethodIdentityServer authenticationMethodIdentityServer = (AuthenticationMethodIdentityServer) o;
    return Objects.equals(this.identityId, authenticationMethodIdentityServer.identityId) &&
        Objects.equals(this.moduleId, authenticationMethodIdentityServer.moduleId) &&
        Objects.equals(this.trConfId, authenticationMethodIdentityServer.trConfId) &&
        Objects.equals(this.needsToPrepare, authenticationMethodIdentityServer.needsToPrepare) &&
        Objects.equals(this.discriminatorType, authenticationMethodIdentityServer.discriminatorType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityId, moduleId, trConfId, needsToPrepare, discriminatorType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMethodIdentityServer {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    trConfId: ").append(toIndentedString(trConfId)).append("\n");
    sb.append("    needsToPrepare: ").append(toIndentedString(needsToPrepare)).append("\n");
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

