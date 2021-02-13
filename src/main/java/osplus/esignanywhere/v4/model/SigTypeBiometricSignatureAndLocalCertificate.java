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
 * BiometricSignatureAndLocalCertificate SigType.
 */
@ApiModel(description = "BiometricSignatureAndLocalCertificate SigType.")
@JsonPropertyOrder({
  SigTypeBiometricSignatureAndLocalCertificate.JSON_PROPERTY_LY,
  SigTypeBiometricSignatureAndLocalCertificate.JSON_PROPERTY_IS_BIO,
  SigTypeBiometricSignatureAndLocalCertificate.JSON_PROPERTY_ID,
  SigTypeBiometricSignatureAndLocalCertificate.JSON_PROPERTY_DISCRIMINATOR_TYPE,
  SigTypeBiometricSignatureAndLocalCertificate.JSON_PROPERTY_PREFERRED,
  SigTypeBiometricSignatureAndLocalCertificate.JSON_PROPERTY_STAMP_IMPRINT_CONFIGURATION
})
@JsonTypeName("SigTypeBiometricSignatureAndLocalCertificate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)

public class SigTypeBiometricSignatureAndLocalCertificate extends SigType {
  public static final String JSON_PROPERTY_LY = "Ly";
  private String ly = "";

  public static final String JSON_PROPERTY_IS_BIO = "IsBio";
  private Boolean isBio = false;

  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  protected String discriminatorType;

  public static final String JSON_PROPERTY_PREFERRED = "Preferred";
  private Boolean preferred;

  public static final String JSON_PROPERTY_STAMP_IMPRINT_CONFIGURATION = "StampImprintConfiguration";
  private StampImprintConfiguration stampImprintConfiguration;


  public SigTypeBiometricSignatureAndLocalCertificate ly(String ly) {
    
    this.ly = ly;
    return this;
  }

   /**
   * Define the layout of the local certificate.
   * @return ly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define the layout of the local certificate.")
  @JsonProperty(JSON_PROPERTY_LY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLy() {
    return ly;
  }


  public void setLy(String ly) {
    this.ly = ly;
  }


  public SigTypeBiometricSignatureAndLocalCertificate isBio(Boolean isBio) {
    
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


  public SigTypeBiometricSignatureAndLocalCertificate id(String id) {
    
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


  public SigTypeBiometricSignatureAndLocalCertificate discriminatorType(String discriminatorType) {
    
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


  public SigTypeBiometricSignatureAndLocalCertificate preferred(Boolean preferred) {
    
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


  public SigTypeBiometricSignatureAndLocalCertificate stampImprintConfiguration(StampImprintConfiguration stampImprintConfiguration) {
    
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
    SigTypeBiometricSignatureAndLocalCertificate sigTypeBiometricSignatureAndLocalCertificate = (SigTypeBiometricSignatureAndLocalCertificate) o;
    return Objects.equals(this.ly, sigTypeBiometricSignatureAndLocalCertificate.ly) &&
        Objects.equals(this.isBio, sigTypeBiometricSignatureAndLocalCertificate.isBio) &&
        Objects.equals(this.id, sigTypeBiometricSignatureAndLocalCertificate.id) &&
        Objects.equals(this.discriminatorType, sigTypeBiometricSignatureAndLocalCertificate.discriminatorType) &&
        Objects.equals(this.preferred, sigTypeBiometricSignatureAndLocalCertificate.preferred) &&
        Objects.equals(this.stampImprintConfiguration, sigTypeBiometricSignatureAndLocalCertificate.stampImprintConfiguration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ly, isBio, id, discriminatorType, preferred, stampImprintConfiguration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigTypeBiometricSignatureAndLocalCertificate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ly: ").append(toIndentedString(ly)).append("\n");
    sb.append("    isBio: ").append(toIndentedString(isBio)).append("\n");
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

