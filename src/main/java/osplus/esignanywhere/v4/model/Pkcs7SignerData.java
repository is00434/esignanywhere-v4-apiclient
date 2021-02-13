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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * Pkcs7SignerData
 */
@JsonPropertyOrder({
  Pkcs7SignerData.JSON_PROPERTY_ALLOWED_PKCS7_SIGNATURE_TYPES
})
@JsonTypeName("Pkcs7SignerData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class Pkcs7SignerData {
  /**
   * Gets or Sets allowedPkcs7SignatureTypes
   */
  public enum AllowedPkcs7SignatureTypesEnum {
    LOCALCERTIFICATE("LocalCertificate"),
    
    REMOTECERTIFICATE("RemoteCertificate"),
    
    REMOTEDISPOSABLECERTIFICATE("RemoteDisposableCertificate");

    private String value;

    AllowedPkcs7SignatureTypesEnum(String value) {
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
    public static AllowedPkcs7SignatureTypesEnum fromValue(String value) {
      for (AllowedPkcs7SignatureTypesEnum b : AllowedPkcs7SignatureTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ALLOWED_PKCS7_SIGNATURE_TYPES = "AllowedPkcs7SignatureTypes";
  private List<AllowedPkcs7SignatureTypesEnum> allowedPkcs7SignatureTypes = null;


  public Pkcs7SignerData allowedPkcs7SignatureTypes(List<AllowedPkcs7SignatureTypesEnum> allowedPkcs7SignatureTypes) {
    
    this.allowedPkcs7SignatureTypes = allowedPkcs7SignatureTypes;
    return this;
  }

  public Pkcs7SignerData addAllowedPkcs7SignatureTypesItem(AllowedPkcs7SignatureTypesEnum allowedPkcs7SignatureTypesItem) {
    if (this.allowedPkcs7SignatureTypes == null) {
      this.allowedPkcs7SignatureTypes = new ArrayList<AllowedPkcs7SignatureTypesEnum>();
    }
    this.allowedPkcs7SignatureTypes.add(allowedPkcs7SignatureTypesItem);
    return this;
  }

   /**
   * Get allowedPkcs7SignatureTypes
   * @return allowedPkcs7SignatureTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOWED_PKCS7_SIGNATURE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AllowedPkcs7SignatureTypesEnum> getAllowedPkcs7SignatureTypes() {
    return allowedPkcs7SignatureTypes;
  }


  public void setAllowedPkcs7SignatureTypes(List<AllowedPkcs7SignatureTypesEnum> allowedPkcs7SignatureTypes) {
    this.allowedPkcs7SignatureTypes = allowedPkcs7SignatureTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pkcs7SignerData pkcs7SignerData = (Pkcs7SignerData) o;
    return Objects.equals(this.allowedPkcs7SignatureTypes, pkcs7SignerData.allowedPkcs7SignatureTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPkcs7SignatureTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pkcs7SignerData {\n");
    sb.append("    allowedPkcs7SignatureTypes: ").append(toIndentedString(allowedPkcs7SignatureTypes)).append("\n");
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

