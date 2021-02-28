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
 * SigTypeBiometricSignatureAllOf
 */
@JsonPropertyOrder({
  SigTypeBiometricSignatureAllOf.JSON_PROPERTY_IS_BIO,
  SigTypeBiometricSignatureAllOf.JSON_PROPERTY_UID,
  SigTypeBiometricSignatureAllOf.JSON_PROPERTY_ALLOW_SKIP_BIOMETRIC_VERIFICATION,
  SigTypeBiometricSignatureAllOf.JSON_PROPERTY_ALLOW_BIOMETRIC_STORING_ONLY,
  SigTypeBiometricSignatureAllOf.JSON_PROPERTY_SIGNED_RESPONSE_WITHOUT_BIO_DATA,
  SigTypeBiometricSignatureAllOf.JSON_PROPERTY_ID,
  SigTypeBiometricSignatureAllOf.JSON_PROPERTY_DISCRIMINATOR_TYPE,
  SigTypeBiometricSignatureAllOf.JSON_PROPERTY_PREFERRED,
  SigTypeBiometricSignatureAllOf.JSON_PROPERTY_STAMP_IMPRINT_CONFIGURATION
})
@JsonTypeName("SigTypeBiometricSignature_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class SigTypeBiometricSignatureAllOf {
  public static final String JSON_PROPERTY_IS_BIO = "IsBio";
  private Boolean isBio = false;

  public static final String JSON_PROPERTY_UID = "Uid";
  private String uid;

  public static final String JSON_PROPERTY_ALLOW_SKIP_BIOMETRIC_VERIFICATION = "AllowSkipBiometricVerification";
  private Boolean allowSkipBiometricVerification = false;

  public static final String JSON_PROPERTY_ALLOW_BIOMETRIC_STORING_ONLY = "AllowBiometricStoringOnly";
  private Boolean allowBiometricStoringOnly = false;

  public static final String JSON_PROPERTY_SIGNED_RESPONSE_WITHOUT_BIO_DATA = "SignedResponseWithoutBioData";
  private Boolean signedResponseWithoutBioData = false;

  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  private String discriminatorType;

  public static final String JSON_PROPERTY_PREFERRED = "Preferred";
  private Boolean preferred;

  public static final String JSON_PROPERTY_STAMP_IMPRINT_CONFIGURATION = "StampImprintConfiguration";
  private StampImprintConfiguration stampImprintConfiguration;


  public SigTypeBiometricSignatureAllOf isBio(Boolean isBio) {
    
    this.isBio = isBio;
    return this;
  }

   /**
   * Define if the BiometricSignature has a BioServerVerification.
   * @return isBio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if the BiometricSignature has a BioServerVerification.")
  @JsonProperty(JSON_PROPERTY_IS_BIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBio() {
    return isBio;
  }


  public void setIsBio(Boolean isBio) {
    this.isBio = isBio;
  }


  public SigTypeBiometricSignatureAllOf uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Uid for verification.
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uid for verification.")
  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public SigTypeBiometricSignatureAllOf allowSkipBiometricVerification(Boolean allowSkipBiometricVerification) {
    
    this.allowSkipBiometricVerification = allowSkipBiometricVerification;
    return this;
  }

   /**
   * Allow skipping biometric verification.
   * @return allowSkipBiometricVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow skipping biometric verification.")
  @JsonProperty(JSON_PROPERTY_ALLOW_SKIP_BIOMETRIC_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowSkipBiometricVerification() {
    return allowSkipBiometricVerification;
  }


  public void setAllowSkipBiometricVerification(Boolean allowSkipBiometricVerification) {
    this.allowSkipBiometricVerification = allowSkipBiometricVerification;
  }


  public SigTypeBiometricSignatureAllOf allowBiometricStoringOnly(Boolean allowBiometricStoringOnly) {
    
    this.allowBiometricStoringOnly = allowBiometricStoringOnly;
    return this;
  }

   /**
   * Allow biometric storing only.
   * @return allowBiometricStoringOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow biometric storing only.")
  @JsonProperty(JSON_PROPERTY_ALLOW_BIOMETRIC_STORING_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowBiometricStoringOnly() {
    return allowBiometricStoringOnly;
  }


  public void setAllowBiometricStoringOnly(Boolean allowBiometricStoringOnly) {
    this.allowBiometricStoringOnly = allowBiometricStoringOnly;
  }


  public SigTypeBiometricSignatureAllOf signedResponseWithoutBioData(Boolean signedResponseWithoutBioData) {
    
    this.signedResponseWithoutBioData = signedResponseWithoutBioData;
    return this;
  }

   /**
   * Signed response without bio data.
   * @return signedResponseWithoutBioData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Signed response without bio data.")
  @JsonProperty(JSON_PROPERTY_SIGNED_RESPONSE_WITHOUT_BIO_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSignedResponseWithoutBioData() {
    return signedResponseWithoutBioData;
  }


  public void setSignedResponseWithoutBioData(Boolean signedResponseWithoutBioData) {
    this.signedResponseWithoutBioData = signedResponseWithoutBioData;
  }


  public SigTypeBiometricSignatureAllOf id(String id) {
    
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


  public SigTypeBiometricSignatureAllOf discriminatorType(String discriminatorType) {
    
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


  public SigTypeBiometricSignatureAllOf preferred(Boolean preferred) {
    
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


  public SigTypeBiometricSignatureAllOf stampImprintConfiguration(StampImprintConfiguration stampImprintConfiguration) {
    
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
    SigTypeBiometricSignatureAllOf sigTypeBiometricSignatureAllOf = (SigTypeBiometricSignatureAllOf) o;
    return Objects.equals(this.isBio, sigTypeBiometricSignatureAllOf.isBio) &&
        Objects.equals(this.uid, sigTypeBiometricSignatureAllOf.uid) &&
        Objects.equals(this.allowSkipBiometricVerification, sigTypeBiometricSignatureAllOf.allowSkipBiometricVerification) &&
        Objects.equals(this.allowBiometricStoringOnly, sigTypeBiometricSignatureAllOf.allowBiometricStoringOnly) &&
        Objects.equals(this.signedResponseWithoutBioData, sigTypeBiometricSignatureAllOf.signedResponseWithoutBioData) &&
        Objects.equals(this.id, sigTypeBiometricSignatureAllOf.id) &&
        Objects.equals(this.discriminatorType, sigTypeBiometricSignatureAllOf.discriminatorType) &&
        Objects.equals(this.preferred, sigTypeBiometricSignatureAllOf.preferred) &&
        Objects.equals(this.stampImprintConfiguration, sigTypeBiometricSignatureAllOf.stampImprintConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBio, uid, allowSkipBiometricVerification, allowBiometricStoringOnly, signedResponseWithoutBioData, id, discriminatorType, preferred, stampImprintConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigTypeBiometricSignatureAllOf {\n");
    sb.append("    isBio: ").append(toIndentedString(isBio)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    allowSkipBiometricVerification: ").append(toIndentedString(allowSkipBiometricVerification)).append("\n");
    sb.append("    allowBiometricStoringOnly: ").append(toIndentedString(allowBiometricStoringOnly)).append("\n");
    sb.append("    signedResponseWithoutBioData: ").append(toIndentedString(signedResponseWithoutBioData)).append("\n");
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

