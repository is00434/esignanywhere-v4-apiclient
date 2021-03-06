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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Abstract class, use the derived classes:  - SigTypeAutomaticSignature  - SigTypeBiometricSignature  - SigTypeBiometricSignatureAndLocalCertificate  - SigTypeExternalSigningProcess  - SigTypeLocalCertificate  - SigTypeClick2Sign  - SigTypeDraw2Sign  - SigTypeType2Sign  - SigTypeTransactionCode  - SigTypeTransactionCodeAndBiometricSignature  - SigTypeTransactionCodeAndLocalCertificate  - SigTypeTransactionCodeBiometricSignatureAndLocalCertificate                For usage see sample code.
 */
@ApiModel(description = "Abstract class, use the derived classes:  - SigTypeAutomaticSignature  - SigTypeBiometricSignature  - SigTypeBiometricSignatureAndLocalCertificate  - SigTypeExternalSigningProcess  - SigTypeLocalCertificate  - SigTypeClick2Sign  - SigTypeDraw2Sign  - SigTypeType2Sign  - SigTypeTransactionCode  - SigTypeTransactionCodeAndBiometricSignature  - SigTypeTransactionCodeAndLocalCertificate  - SigTypeTransactionCodeBiometricSignatureAndLocalCertificate                For usage see sample code.")
@JsonPropertyOrder({
  SigType.JSON_PROPERTY_ID,
  SigType.JSON_PROPERTY_DISCRIMINATOR_TYPE,
  SigType.JSON_PROPERTY_PREFERRED,
  SigType.JSON_PROPERTY_STAMP_IMPRINT_CONFIGURATION
})
@JsonTypeName("SigType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = SigTypeAutomaticSignature.class, name = "SigTypeAutomaticSignature"),
  @JsonSubTypes.Type(value = SigTypeBiometricSignature.class, name = "SigTypeBiometricSignature"),
  @JsonSubTypes.Type(value = SigTypeBiometricSignatureAndLocalCertificate.class, name = "SigTypeBiometricSignatureAndLocalCertificate"),
  @JsonSubTypes.Type(value = SigTypeClick2Sign.class, name = "SigTypeClick2Sign"),
  @JsonSubTypes.Type(value = SigTypeDraw2Sign.class, name = "SigTypeDraw2Sign"),
  @JsonSubTypes.Type(value = SigTypeExternalSigningProcess.class, name = "SigTypeExternalSigningProcess"),
  @JsonSubTypes.Type(value = SigTypeLocalCertificate.class, name = "SigTypeLocalCertificate"),
  @JsonSubTypes.Type(value = SigTypePicture.class, name = "SigTypePicture"),
  @JsonSubTypes.Type(value = SigTypeTransactionCode.class, name = "SigTypeTransactionCode"),
  @JsonSubTypes.Type(value = SigTypeTransactionCodeAndBiometricSignature.class, name = "SigTypeTransactionCodeAndBiometricSignature"),
  @JsonSubTypes.Type(value = SigTypeTransactionCodeAndLocalCertificate.class, name = "SigTypeTransactionCodeAndLocalCertificate"),
  @JsonSubTypes.Type(value = SigTypeTransactionCodeBiometricSignatureAndLocalCertificate.class, name = "SigTypeTransactionCodeBiometricSignatureAndLocalCertificate"),
  @JsonSubTypes.Type(value = SigTypeType2Sign.class, name = "SigTypeType2Sign"),
})

public class SigType {
  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  protected String discriminatorType;

  public static final String JSON_PROPERTY_PREFERRED = "Preferred";
  private Boolean preferred;

  public static final String JSON_PROPERTY_STAMP_IMPRINT_CONFIGURATION = "StampImprintConfiguration";
  private StampImprintConfiguration stampImprintConfiguration;


  public SigType id(String id) {
    
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


  public SigType discriminatorType(String discriminatorType) {
    
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


  public SigType preferred(Boolean preferred) {
    
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


  public SigType stampImprintConfiguration(StampImprintConfiguration stampImprintConfiguration) {
    
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
    SigType sigType = (SigType) o;
    return Objects.equals(this.id, sigType.id) &&
        Objects.equals(this.discriminatorType, sigType.discriminatorType) &&
        Objects.equals(this.preferred, sigType.preferred) &&
        Objects.equals(this.stampImprintConfiguration, sigType.stampImprintConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, discriminatorType, preferred, stampImprintConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigType {\n");
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

