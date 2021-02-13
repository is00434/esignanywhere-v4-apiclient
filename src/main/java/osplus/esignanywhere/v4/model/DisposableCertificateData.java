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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import org.threeten.bp.OffsetDateTime;

import io.swagger.annotations.ApiModelProperty;

/**
 * DisposableCertificateData
 */
@JsonPropertyOrder({
  DisposableCertificateData.JSON_PROPERTY_COUNTRY_RESIDENCE,
  DisposableCertificateData.JSON_PROPERTY_IDENTIFICATION_COUNTRY,
  DisposableCertificateData.JSON_PROPERTY_IDENTIFICATION_TYPE,
  DisposableCertificateData.JSON_PROPERTY_PHONE_MOBILE,
  DisposableCertificateData.JSON_PROPERTY_DOCUMENT_TYPE,
  DisposableCertificateData.JSON_PROPERTY_DOCUMENT_ISSUED_BY,
  DisposableCertificateData.JSON_PROPERTY_DOCUMENT_ISSUED_ON,
  DisposableCertificateData.JSON_PROPERTY_DOCUMENT_EXPIRY_DATE,
  DisposableCertificateData.JSON_PROPERTY_SERIAL_NUMBER,
  DisposableCertificateData.JSON_PROPERTY_DOCUMENT_NUMBER,
  DisposableCertificateData.JSON_PROPERTY_OVERRIDE_HOLDER_IN_CASE_OF_MISMATCH
})
@JsonTypeName("DisposableCertificateData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class DisposableCertificateData {
  public static final String JSON_PROPERTY_COUNTRY_RESIDENCE = "CountryResidence";
  private String countryResidence;

  public static final String JSON_PROPERTY_IDENTIFICATION_COUNTRY = "IdentificationCountry";
  private String identificationCountry;

  /**
   * Gets or Sets identificationType
   */
  public enum IdentificationTypeEnum {
    NONE("NONE"),
    
    FOREIGN_TAX_CODE("FOREIGN_TAX_CODE"),
    
    PERSONAL_NUMBER("PERSONAL_NUMBER"),
    
    PASSPORT("PASSPORT"),
    
    NATIONAL_IDENTITY_CARD("NATIONAL_IDENTITY_CARD"),
    
    ITALIAN_TAX_CODE("ITALIAN_TAX_CODE"),
    
    NO_SERIAL_NUMBER("NO_SERIAL_NUMBER");

    private String value;

    IdentificationTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IdentificationTypeEnum fromValue(String value) {
      for (IdentificationTypeEnum b : IdentificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IDENTIFICATION_TYPE = "IdentificationType";
  private IdentificationTypeEnum identificationType = IdentificationTypeEnum.FOREIGN_TAX_CODE;

  public static final String JSON_PROPERTY_PHONE_MOBILE = "PhoneMobile";
  private String phoneMobile;

  /**
   * Gets or Sets documentType
   */
  public enum DocumentTypeEnum {
    CI("CI"),
    
    PA("PA"),
    
    PASS("PASS"),
    
    PD("PD"),
    
    ID("ID"),
    
    PN("PN"),
    
    AT("AT");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DocumentTypeEnum fromValue(String value) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DOCUMENT_TYPE = "DocumentType";
  private DocumentTypeEnum documentType;

  public static final String JSON_PROPERTY_DOCUMENT_ISSUED_BY = "DocumentIssuedBy";
  private String documentIssuedBy;

  public static final String JSON_PROPERTY_DOCUMENT_ISSUED_ON = "DocumentIssuedOn";
  private OffsetDateTime documentIssuedOn;

  public static final String JSON_PROPERTY_DOCUMENT_EXPIRY_DATE = "DocumentExpiryDate";
  private OffsetDateTime documentExpiryDate;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "SerialNumber";
  private String serialNumber;

  public static final String JSON_PROPERTY_DOCUMENT_NUMBER = "DocumentNumber";
  private String documentNumber;

  public static final String JSON_PROPERTY_OVERRIDE_HOLDER_IN_CASE_OF_MISMATCH = "OverrideHolderInCaseOfMismatch";
  private Boolean overrideHolderInCaseOfMismatch;


  public DisposableCertificateData countryResidence(String countryResidence) {
    
    this.countryResidence = countryResidence;
    return this;
  }

   /**
   * Get countryResidence
   * @return countryResidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY_RESIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryResidence() {
    return countryResidence;
  }


  public void setCountryResidence(String countryResidence) {
    this.countryResidence = countryResidence;
  }


  public DisposableCertificateData identificationCountry(String identificationCountry) {
    
    this.identificationCountry = identificationCountry;
    return this;
  }

   /**
   * Get identificationCountry
   * @return identificationCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFICATION_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentificationCountry() {
    return identificationCountry;
  }


  public void setIdentificationCountry(String identificationCountry) {
    this.identificationCountry = identificationCountry;
  }


  public DisposableCertificateData identificationType(IdentificationTypeEnum identificationType) {
    
    this.identificationType = identificationType;
    return this;
  }

   /**
   * Get identificationType
   * @return identificationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdentificationTypeEnum getIdentificationType() {
    return identificationType;
  }


  public void setIdentificationType(IdentificationTypeEnum identificationType) {
    this.identificationType = identificationType;
  }


  public DisposableCertificateData phoneMobile(String phoneMobile) {
    
    this.phoneMobile = phoneMobile;
    return this;
  }

   /**
   * Get phoneMobile
   * @return phoneMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneMobile() {
    return phoneMobile;
  }


  public void setPhoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
  }


  public DisposableCertificateData documentType(DocumentTypeEnum documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }


  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }


  public DisposableCertificateData documentIssuedBy(String documentIssuedBy) {
    
    this.documentIssuedBy = documentIssuedBy;
    return this;
  }

   /**
   * Get documentIssuedBy
   * @return documentIssuedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ISSUED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentIssuedBy() {
    return documentIssuedBy;
  }


  public void setDocumentIssuedBy(String documentIssuedBy) {
    this.documentIssuedBy = documentIssuedBy;
  }


  public DisposableCertificateData documentIssuedOn(OffsetDateTime documentIssuedOn) {
    
    this.documentIssuedOn = documentIssuedOn;
    return this;
  }

   /**
   * Get documentIssuedOn
   * @return documentIssuedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ISSUED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDocumentIssuedOn() {
    return documentIssuedOn;
  }


  public void setDocumentIssuedOn(OffsetDateTime documentIssuedOn) {
    this.documentIssuedOn = documentIssuedOn;
  }


  public DisposableCertificateData documentExpiryDate(OffsetDateTime documentExpiryDate) {
    
    this.documentExpiryDate = documentExpiryDate;
    return this;
  }

   /**
   * Get documentExpiryDate
   * @return documentExpiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDocumentExpiryDate() {
    return documentExpiryDate;
  }


  public void setDocumentExpiryDate(OffsetDateTime documentExpiryDate) {
    this.documentExpiryDate = documentExpiryDate;
  }


  public DisposableCertificateData serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public DisposableCertificateData documentNumber(String documentNumber) {
    
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * Get documentNumber
   * @return documentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentNumber() {
    return documentNumber;
  }


  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public DisposableCertificateData overrideHolderInCaseOfMismatch(Boolean overrideHolderInCaseOfMismatch) {
    
    this.overrideHolderInCaseOfMismatch = overrideHolderInCaseOfMismatch;
    return this;
  }

   /**
   * Get overrideHolderInCaseOfMismatch
   * @return overrideHolderInCaseOfMismatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERRIDE_HOLDER_IN_CASE_OF_MISMATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOverrideHolderInCaseOfMismatch() {
    return overrideHolderInCaseOfMismatch;
  }


  public void setOverrideHolderInCaseOfMismatch(Boolean overrideHolderInCaseOfMismatch) {
    this.overrideHolderInCaseOfMismatch = overrideHolderInCaseOfMismatch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisposableCertificateData disposableCertificateData = (DisposableCertificateData) o;
    return Objects.equals(this.countryResidence, disposableCertificateData.countryResidence) &&
        Objects.equals(this.identificationCountry, disposableCertificateData.identificationCountry) &&
        Objects.equals(this.identificationType, disposableCertificateData.identificationType) &&
        Objects.equals(this.phoneMobile, disposableCertificateData.phoneMobile) &&
        Objects.equals(this.documentType, disposableCertificateData.documentType) &&
        Objects.equals(this.documentIssuedBy, disposableCertificateData.documentIssuedBy) &&
        Objects.equals(this.documentIssuedOn, disposableCertificateData.documentIssuedOn) &&
        Objects.equals(this.documentExpiryDate, disposableCertificateData.documentExpiryDate) &&
        Objects.equals(this.serialNumber, disposableCertificateData.serialNumber) &&
        Objects.equals(this.documentNumber, disposableCertificateData.documentNumber) &&
        Objects.equals(this.overrideHolderInCaseOfMismatch, disposableCertificateData.overrideHolderInCaseOfMismatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryResidence, identificationCountry, identificationType, phoneMobile, documentType, documentIssuedBy, documentIssuedOn, documentExpiryDate, serialNumber, documentNumber, overrideHolderInCaseOfMismatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisposableCertificateData {\n");
    sb.append("    countryResidence: ").append(toIndentedString(countryResidence)).append("\n");
    sb.append("    identificationCountry: ").append(toIndentedString(identificationCountry)).append("\n");
    sb.append("    identificationType: ").append(toIndentedString(identificationType)).append("\n");
    sb.append("    phoneMobile: ").append(toIndentedString(phoneMobile)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentIssuedBy: ").append(toIndentedString(documentIssuedBy)).append("\n");
    sb.append("    documentIssuedOn: ").append(toIndentedString(documentIssuedOn)).append("\n");
    sb.append("    documentExpiryDate: ").append(toIndentedString(documentExpiryDate)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    overrideHolderInCaseOfMismatch: ").append(toIndentedString(overrideHolderInCaseOfMismatch)).append("\n");
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
