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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Information about the recipient of the document.
 */
@ApiModel(description = "Information about the recipient of the document.")
@JsonPropertyOrder({
  ReceiverInformation.JSON_PROPERTY_USER_INFORMATION,
  ReceiverInformation.JSON_PROPERTY_HOLDER_INFORMATION,
  ReceiverInformation.JSON_PROPERTY_DISPOSABLE_CERTIFICATE_DISCLAIMER_TEXTS,
  ReceiverInformation.JSON_PROPERTY_TRANSACTION_CODE_PUSH_PLUGIN_DATA,
  ReceiverInformation.JSON_PROPERTY_ATRUST_CERTIFICATE_DATA
})
@JsonTypeName("ReceiverInformation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class ReceiverInformation {
  public static final String JSON_PROPERTY_USER_INFORMATION = "UserInformation";
  private UserInformation userInformation;

  public static final String JSON_PROPERTY_HOLDER_INFORMATION = "HolderInformation";
  private String holderInformation;

  public static final String JSON_PROPERTY_DISPOSABLE_CERTIFICATE_DISCLAIMER_TEXTS = "DisposableCertificateDisclaimerTexts";
  private DisposableCertificateDisclaimerTexts disposableCertificateDisclaimerTexts;

  public static final String JSON_PROPERTY_TRANSACTION_CODE_PUSH_PLUGIN_DATA = "TransactionCodePushPluginData";
  private List<KeyValuePair> transactionCodePushPluginData = null;

  public static final String JSON_PROPERTY_ATRUST_CERTIFICATE_DATA = "ATrustCertificateData";
  private ATrustCertificateData atrustCertificateData;


  public ReceiverInformation userInformation(UserInformation userInformation) {
    
    this.userInformation = userInformation;
    return this;
  }

   /**
   * Get userInformation
   * @return userInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserInformation getUserInformation() {
    return userInformation;
  }


  public void setUserInformation(UserInformation userInformation) {
    this.userInformation = userInformation;
  }


  public ReceiverInformation holderInformation(String holderInformation) {
    
    this.holderInformation = holderInformation;
    return this;
  }

   /**
   * Information about the holder.
   * @return holderInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the holder.")
  @JsonProperty(JSON_PROPERTY_HOLDER_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHolderInformation() {
    return holderInformation;
  }


  public void setHolderInformation(String holderInformation) {
    this.holderInformation = holderInformation;
  }


  public ReceiverInformation disposableCertificateDisclaimerTexts(DisposableCertificateDisclaimerTexts disposableCertificateDisclaimerTexts) {
    
    this.disposableCertificateDisclaimerTexts = disposableCertificateDisclaimerTexts;
    return this;
  }

   /**
   * Get disposableCertificateDisclaimerTexts
   * @return disposableCertificateDisclaimerTexts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPOSABLE_CERTIFICATE_DISCLAIMER_TEXTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisposableCertificateDisclaimerTexts getDisposableCertificateDisclaimerTexts() {
    return disposableCertificateDisclaimerTexts;
  }


  public void setDisposableCertificateDisclaimerTexts(DisposableCertificateDisclaimerTexts disposableCertificateDisclaimerTexts) {
    this.disposableCertificateDisclaimerTexts = disposableCertificateDisclaimerTexts;
  }


  public ReceiverInformation transactionCodePushPluginData(List<KeyValuePair> transactionCodePushPluginData) {
    
    this.transactionCodePushPluginData = transactionCodePushPluginData;
    return this;
  }

  public ReceiverInformation addTransactionCodePushPluginDataItem(KeyValuePair transactionCodePushPluginDataItem) {
    if (this.transactionCodePushPluginData == null) {
      this.transactionCodePushPluginData = new ArrayList<KeyValuePair>();
    }
    this.transactionCodePushPluginData.add(transactionCodePushPluginDataItem);
    return this;
  }

   /**
   * TransactionCodePushPlugin data as KeyValuePair: string, string
   * @return transactionCodePushPluginData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TransactionCodePushPlugin data as KeyValuePair: string, string")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_CODE_PUSH_PLUGIN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<KeyValuePair> getTransactionCodePushPluginData() {
    return transactionCodePushPluginData;
  }


  public void setTransactionCodePushPluginData(List<KeyValuePair> transactionCodePushPluginData) {
    this.transactionCodePushPluginData = transactionCodePushPluginData;
  }


  public ReceiverInformation atrustCertificateData(ATrustCertificateData atrustCertificateData) {
    
    this.atrustCertificateData = atrustCertificateData;
    return this;
  }

   /**
   * Get atrustCertificateData
   * @return atrustCertificateData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATRUST_CERTIFICATE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ATrustCertificateData getAtrustCertificateData() {
    return atrustCertificateData;
  }


  public void setAtrustCertificateData(ATrustCertificateData atrustCertificateData) {
    this.atrustCertificateData = atrustCertificateData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiverInformation receiverInformation = (ReceiverInformation) o;
    return Objects.equals(this.userInformation, receiverInformation.userInformation) &&
        Objects.equals(this.holderInformation, receiverInformation.holderInformation) &&
        Objects.equals(this.disposableCertificateDisclaimerTexts, receiverInformation.disposableCertificateDisclaimerTexts) &&
        Objects.equals(this.transactionCodePushPluginData, receiverInformation.transactionCodePushPluginData) &&
        Objects.equals(this.atrustCertificateData, receiverInformation.atrustCertificateData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userInformation, holderInformation, disposableCertificateDisclaimerTexts, transactionCodePushPluginData, atrustCertificateData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiverInformation {\n");
    sb.append("    userInformation: ").append(toIndentedString(userInformation)).append("\n");
    sb.append("    holderInformation: ").append(toIndentedString(holderInformation)).append("\n");
    sb.append("    disposableCertificateDisclaimerTexts: ").append(toIndentedString(disposableCertificateDisclaimerTexts)).append("\n");
    sb.append("    transactionCodePushPluginData: ").append(toIndentedString(transactionCodePushPluginData)).append("\n");
    sb.append("    atrustCertificateData: ").append(toIndentedString(atrustCertificateData)).append("\n");
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

