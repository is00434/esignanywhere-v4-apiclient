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

import io.swagger.annotations.ApiModelProperty;

/**
 * SigTypeExternalSigningProcess
 */
@JsonPropertyOrder({
  SigTypeExternalSigningProcess.JSON_PROPERTY_TR_CONF_ID,
  SigTypeExternalSigningProcess.JSON_PROPERTY_TR_MOD_TYPE,
  SigTypeExternalSigningProcess.JSON_PROPERTY_ID,
  SigTypeExternalSigningProcess.JSON_PROPERTY_DISCRIMINATOR_TYPE,
  SigTypeExternalSigningProcess.JSON_PROPERTY_PREFERRED,
  SigTypeExternalSigningProcess.JSON_PROPERTY_STAMP_IMPRINT_CONFIGURATION
})
@JsonTypeName("SigTypeExternalSigningProcess")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)

public class SigTypeExternalSigningProcess extends SigType {
  public static final String JSON_PROPERTY_TR_CONF_ID = "TrConfId";
  private String trConfId;

  public static final String JSON_PROPERTY_TR_MOD_TYPE = "TrModType";
  private String trModType;

  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  protected String discriminatorType;

  public static final String JSON_PROPERTY_PREFERRED = "Preferred";
  private Boolean preferred;

  public static final String JSON_PROPERTY_STAMP_IMPRINT_CONFIGURATION = "StampImprintConfiguration";
  private StampImprintConfiguration stampImprintConfiguration;


  public SigTypeExternalSigningProcess trConfId(String trConfId) {
    
    this.trConfId = trConfId;
    return this;
  }

   /**
   * Reference to transcation code configuration id for signing.
   * @return trConfId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to transcation code configuration id for signing.")
  @JsonProperty(JSON_PROPERTY_TR_CONF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrConfId() {
    return trConfId;
  }


  public void setTrConfId(String trConfId) {
    this.trConfId = trConfId;
  }


  public SigTypeExternalSigningProcess trModType(String trModType) {
    
    this.trModType = trModType;
    return this;
  }

   /**
   * Transaction mod type.
   * @return trModType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction mod type.")
  @JsonProperty(JSON_PROPERTY_TR_MOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrModType() {
    return trModType;
  }


  public void setTrModType(String trModType) {
    this.trModType = trModType;
  }


  public SigTypeExternalSigningProcess id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Define a identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define a identifier.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SigTypeExternalSigningProcess discriminatorType(String discriminatorType) {
    
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


  public SigTypeExternalSigningProcess preferred(Boolean preferred) {
    
    this.preferred = preferred;
    return this;
  }

   /**
   * Define if this SigType is the preferred one.
   * @return preferred
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if this SigType is the preferred one.")
  @JsonProperty(JSON_PROPERTY_PREFERRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPreferred() {
    return preferred;
  }


  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }


  public SigTypeExternalSigningProcess stampImprintConfiguration(StampImprintConfiguration stampImprintConfiguration) {
    
    this.stampImprintConfiguration = stampImprintConfiguration;
    return this;
  }

   /**
   * Get stampImprintConfiguration
   * @return stampImprintConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STAMP_IMPRINT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StampImprintConfiguration getStampImprintConfiguration() {
    return stampImprintConfiguration;
  }


  public void setStampImprintConfiguration(StampImprintConfiguration stampImprintConfiguration) {
    this.stampImprintConfiguration = stampImprintConfiguration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigTypeExternalSigningProcess sigTypeExternalSigningProcess = (SigTypeExternalSigningProcess) o;
    return Objects.equals(this.trConfId, sigTypeExternalSigningProcess.trConfId) &&
        Objects.equals(this.trModType, sigTypeExternalSigningProcess.trModType) &&
        Objects.equals(this.id, sigTypeExternalSigningProcess.id) &&
        Objects.equals(this.discriminatorType, sigTypeExternalSigningProcess.discriminatorType) &&
        Objects.equals(this.preferred, sigTypeExternalSigningProcess.preferred) &&
        Objects.equals(this.stampImprintConfiguration, sigTypeExternalSigningProcess.stampImprintConfiguration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trConfId, trModType, id, discriminatorType, preferred, stampImprintConfiguration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigTypeExternalSigningProcess {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    trConfId: ").append(toIndentedString(trConfId)).append("\n");
    sb.append("    trModType: ").append(toIndentedString(trModType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    discriminatorType: ").append(toIndentedString(discriminatorType)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    stampImprintConfiguration: ").append(toIndentedString(stampImprintConfiguration)).append("\n");
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

