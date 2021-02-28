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
 * Description of a recipient.
 */
@ApiModel(description = "Description of a recipient.")
@JsonPropertyOrder({
  SendEnvelopeRecipient.JSON_PROPERTY_EMAIL,
  SendEnvelopeRecipient.JSON_PROPERTY_FIRST_NAME,
  SendEnvelopeRecipient.JSON_PROPERTY_LAST_NAME,
  SendEnvelopeRecipient.JSON_PROPERTY_LANGUAGE_CODE,
  SendEnvelopeRecipient.JSON_PROPERTY_EMAIL_BODY_EXTRA,
  SendEnvelopeRecipient.JSON_PROPERTY_DISABLE_EMAIL,
  SendEnvelopeRecipient.JSON_PROPERTY_ADD_ANDROID_APP_LINK,
  SendEnvelopeRecipient.JSON_PROPERTY_ADD_IOS_APP_LINK,
  SendEnvelopeRecipient.JSON_PROPERTY_ADD_WINDOWS_APP_LINK,
  SendEnvelopeRecipient.JSON_PROPERTY_ALLOW_DELEGATION,
  SendEnvelopeRecipient.JSON_PROPERTY_SKIP_EXTERNAL_DATA_VALIDATION,
  SendEnvelopeRecipient.JSON_PROPERTY_AUTHENTICATION_METHODS,
  SendEnvelopeRecipient.JSON_PROPERTY_DISPOSABLE_CERTIFICATE_DATA,
  SendEnvelopeRecipient.JSON_PROPERTY_SWISS_COM_CERTIFICATE_DATA,
  SendEnvelopeRecipient.JSON_PROPERTY_REMOTE_CERTIFICATE_DATA,
  SendEnvelopeRecipient.JSON_PROPERTY_OTP_DATA,
  SendEnvelopeRecipient.JSON_PROPERTY_PKCS7_SIGNER_DATA
})
@JsonTypeName("SendEnvelopeRecipient")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class SendEnvelopeRecipient {
  public static final String JSON_PROPERTY_EMAIL = "Email";
  private String email;

  public static final String JSON_PROPERTY_FIRST_NAME = "FirstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "LastName";
  private String lastName;

  public static final String JSON_PROPERTY_LANGUAGE_CODE = "LanguageCode";
  private String languageCode;

  public static final String JSON_PROPERTY_EMAIL_BODY_EXTRA = "EmailBodyExtra";
  private String emailBodyExtra;

  public static final String JSON_PROPERTY_DISABLE_EMAIL = "DisableEmail";
  private Boolean disableEmail = false;

  public static final String JSON_PROPERTY_ADD_ANDROID_APP_LINK = "AddAndroidAppLink";
  private Boolean addAndroidAppLink = false;

  public static final String JSON_PROPERTY_ADD_IOS_APP_LINK = "AddIosAppLink";
  private Boolean addIosAppLink = false;

  public static final String JSON_PROPERTY_ADD_WINDOWS_APP_LINK = "AddWindowsAppLink";
  private Boolean addWindowsAppLink = false;

  public static final String JSON_PROPERTY_ALLOW_DELEGATION = "AllowDelegation";
  private Boolean allowDelegation;

  public static final String JSON_PROPERTY_SKIP_EXTERNAL_DATA_VALIDATION = "SkipExternalDataValidation";
  private Boolean skipExternalDataValidation = false;

  public static final String JSON_PROPERTY_AUTHENTICATION_METHODS = "AuthenticationMethods";
  private List<SendEnvelopeAuthentication> authenticationMethods = null;

  public static final String JSON_PROPERTY_DISPOSABLE_CERTIFICATE_DATA = "DisposableCertificateData";
  private DisposableCertificateData disposableCertificateData;

  public static final String JSON_PROPERTY_SWISS_COM_CERTIFICATE_DATA = "SwissComCertificateData";
  private SwissComCertificateData swissComCertificateData;

  public static final String JSON_PROPERTY_REMOTE_CERTIFICATE_DATA = "RemoteCertificateData";
  private RemoteCertificateData remoteCertificateData;

  public static final String JSON_PROPERTY_OTP_DATA = "OtpData";
  private OtpData otpData;

  public static final String JSON_PROPERTY_PKCS7_SIGNER_DATA = "Pkcs7SignerData";
  private Pkcs7SignerData pkcs7SignerData;


  public SendEnvelopeRecipient email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the recipient.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the recipient.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public SendEnvelopeRecipient firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the recipient.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first name of the recipient.")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public SendEnvelopeRecipient lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the recipient.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last name of the recipient.")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public SendEnvelopeRecipient languageCode(String languageCode) {
    
    this.languageCode = languageCode;
    return this;
  }

   /**
   * The language code of the recipient.
   * @return languageCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The language code of the recipient.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguageCode() {
    return languageCode;
  }


  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public SendEnvelopeRecipient emailBodyExtra(String emailBodyExtra) {
    
    this.emailBodyExtra = emailBodyExtra;
    return this;
  }

   /**
   * Additional email body for the recipient.
   * @return emailBodyExtra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional email body for the recipient.")
  @JsonProperty(JSON_PROPERTY_EMAIL_BODY_EXTRA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailBodyExtra() {
    return emailBodyExtra;
  }


  public void setEmailBodyExtra(String emailBodyExtra) {
    this.emailBodyExtra = emailBodyExtra;
  }


  public SendEnvelopeRecipient disableEmail(Boolean disableEmail) {
    
    this.disableEmail = disableEmail;
    return this;
  }

   /**
   * Specifies if an email should be sent out for this recipient.
   * @return disableEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if an email should be sent out for this recipient.")
  @JsonProperty(JSON_PROPERTY_DISABLE_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisableEmail() {
    return disableEmail;
  }


  public void setDisableEmail(Boolean disableEmail) {
    this.disableEmail = disableEmail;
  }


  public SendEnvelopeRecipient addAndroidAppLink(Boolean addAndroidAppLink) {
    
    this.addAndroidAppLink = addAndroidAppLink;
    return this;
  }

   /**
   * If true, an Android app link is added to the email message.
   * @return addAndroidAppLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, an Android app link is added to the email message.")
  @JsonProperty(JSON_PROPERTY_ADD_ANDROID_APP_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAddAndroidAppLink() {
    return addAndroidAppLink;
  }


  public void setAddAndroidAppLink(Boolean addAndroidAppLink) {
    this.addAndroidAppLink = addAndroidAppLink;
  }


  public SendEnvelopeRecipient addIosAppLink(Boolean addIosAppLink) {
    
    this.addIosAppLink = addIosAppLink;
    return this;
  }

   /**
   * If true, an iOS app link is added to the email message.
   * @return addIosAppLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, an iOS app link is added to the email message.")
  @JsonProperty(JSON_PROPERTY_ADD_IOS_APP_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAddIosAppLink() {
    return addIosAppLink;
  }


  public void setAddIosAppLink(Boolean addIosAppLink) {
    this.addIosAppLink = addIosAppLink;
  }


  public SendEnvelopeRecipient addWindowsAppLink(Boolean addWindowsAppLink) {
    
    this.addWindowsAppLink = addWindowsAppLink;
    return this;
  }

   /**
   * If true, an Windows app link is added to the email message.
   * @return addWindowsAppLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, an Windows app link is added to the email message.")
  @JsonProperty(JSON_PROPERTY_ADD_WINDOWS_APP_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAddWindowsAppLink() {
    return addWindowsAppLink;
  }


  public void setAddWindowsAppLink(Boolean addWindowsAppLink) {
    this.addWindowsAppLink = addWindowsAppLink;
  }


  public SendEnvelopeRecipient allowDelegation(Boolean allowDelegation) {
    
    this.allowDelegation = allowDelegation;
    return this;
  }

   /**
   * If true, delegation is allowed for this recipient.
   * @return allowDelegation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, delegation is allowed for this recipient.")
  @JsonProperty(JSON_PROPERTY_ALLOW_DELEGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowDelegation() {
    return allowDelegation;
  }


  public void setAllowDelegation(Boolean allowDelegation) {
    this.allowDelegation = allowDelegation;
  }


  public SendEnvelopeRecipient skipExternalDataValidation(Boolean skipExternalDataValidation) {
    
    this.skipExternalDataValidation = skipExternalDataValidation;
    return this;
  }

   /**
   * If true, external validation for this recipient is skipped.
   * @return skipExternalDataValidation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, external validation for this recipient is skipped.")
  @JsonProperty(JSON_PROPERTY_SKIP_EXTERNAL_DATA_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipExternalDataValidation() {
    return skipExternalDataValidation;
  }


  public void setSkipExternalDataValidation(Boolean skipExternalDataValidation) {
    this.skipExternalDataValidation = skipExternalDataValidation;
  }


  public SendEnvelopeRecipient authenticationMethods(List<SendEnvelopeAuthentication> authenticationMethods) {
    
    this.authenticationMethods = authenticationMethods;
    return this;
  }

  public SendEnvelopeRecipient addAuthenticationMethodsItem(SendEnvelopeAuthentication authenticationMethodsItem) {
    if (this.authenticationMethods == null) {
      this.authenticationMethods = new ArrayList<SendEnvelopeAuthentication>();
    }
    this.authenticationMethods.add(authenticationMethodsItem);
    return this;
  }

   /**
   * A list of authentications which are available for the recipient.
   * @return authenticationMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of authentications which are available for the recipient.")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendEnvelopeAuthentication> getAuthenticationMethods() {
    return authenticationMethods;
  }


  public void setAuthenticationMethods(List<SendEnvelopeAuthentication> authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
  }


  public SendEnvelopeRecipient disposableCertificateData(DisposableCertificateData disposableCertificateData) {
    
    this.disposableCertificateData = disposableCertificateData;
    return this;
  }

   /**
   * Get disposableCertificateData
   * @return disposableCertificateData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPOSABLE_CERTIFICATE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisposableCertificateData getDisposableCertificateData() {
    return disposableCertificateData;
  }


  public void setDisposableCertificateData(DisposableCertificateData disposableCertificateData) {
    this.disposableCertificateData = disposableCertificateData;
  }


  public SendEnvelopeRecipient swissComCertificateData(SwissComCertificateData swissComCertificateData) {
    
    this.swissComCertificateData = swissComCertificateData;
    return this;
  }

   /**
   * Get swissComCertificateData
   * @return swissComCertificateData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SWISS_COM_CERTIFICATE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SwissComCertificateData getSwissComCertificateData() {
    return swissComCertificateData;
  }


  public void setSwissComCertificateData(SwissComCertificateData swissComCertificateData) {
    this.swissComCertificateData = swissComCertificateData;
  }


  public SendEnvelopeRecipient remoteCertificateData(RemoteCertificateData remoteCertificateData) {
    
    this.remoteCertificateData = remoteCertificateData;
    return this;
  }

   /**
   * Get remoteCertificateData
   * @return remoteCertificateData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REMOTE_CERTIFICATE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RemoteCertificateData getRemoteCertificateData() {
    return remoteCertificateData;
  }


  public void setRemoteCertificateData(RemoteCertificateData remoteCertificateData) {
    this.remoteCertificateData = remoteCertificateData;
  }


  public SendEnvelopeRecipient otpData(OtpData otpData) {
    
    this.otpData = otpData;
    return this;
  }

   /**
   * Get otpData
   * @return otpData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OTP_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OtpData getOtpData() {
    return otpData;
  }


  public void setOtpData(OtpData otpData) {
    this.otpData = otpData;
  }


  public SendEnvelopeRecipient pkcs7SignerData(Pkcs7SignerData pkcs7SignerData) {
    
    this.pkcs7SignerData = pkcs7SignerData;
    return this;
  }

   /**
   * Get pkcs7SignerData
   * @return pkcs7SignerData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PKCS7_SIGNER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Pkcs7SignerData getPkcs7SignerData() {
    return pkcs7SignerData;
  }


  public void setPkcs7SignerData(Pkcs7SignerData pkcs7SignerData) {
    this.pkcs7SignerData = pkcs7SignerData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEnvelopeRecipient sendEnvelopeRecipient = (SendEnvelopeRecipient) o;
    return Objects.equals(this.email, sendEnvelopeRecipient.email) &&
        Objects.equals(this.firstName, sendEnvelopeRecipient.firstName) &&
        Objects.equals(this.lastName, sendEnvelopeRecipient.lastName) &&
        Objects.equals(this.languageCode, sendEnvelopeRecipient.languageCode) &&
        Objects.equals(this.emailBodyExtra, sendEnvelopeRecipient.emailBodyExtra) &&
        Objects.equals(this.disableEmail, sendEnvelopeRecipient.disableEmail) &&
        Objects.equals(this.addAndroidAppLink, sendEnvelopeRecipient.addAndroidAppLink) &&
        Objects.equals(this.addIosAppLink, sendEnvelopeRecipient.addIosAppLink) &&
        Objects.equals(this.addWindowsAppLink, sendEnvelopeRecipient.addWindowsAppLink) &&
        Objects.equals(this.allowDelegation, sendEnvelopeRecipient.allowDelegation) &&
        Objects.equals(this.skipExternalDataValidation, sendEnvelopeRecipient.skipExternalDataValidation) &&
        Objects.equals(this.authenticationMethods, sendEnvelopeRecipient.authenticationMethods) &&
        Objects.equals(this.disposableCertificateData, sendEnvelopeRecipient.disposableCertificateData) &&
        Objects.equals(this.swissComCertificateData, sendEnvelopeRecipient.swissComCertificateData) &&
        Objects.equals(this.remoteCertificateData, sendEnvelopeRecipient.remoteCertificateData) &&
        Objects.equals(this.otpData, sendEnvelopeRecipient.otpData) &&
        Objects.equals(this.pkcs7SignerData, sendEnvelopeRecipient.pkcs7SignerData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, languageCode, emailBodyExtra, disableEmail, addAndroidAppLink, addIosAppLink, addWindowsAppLink, allowDelegation, skipExternalDataValidation, authenticationMethods, disposableCertificateData, swissComCertificateData, remoteCertificateData, otpData, pkcs7SignerData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEnvelopeRecipient {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    emailBodyExtra: ").append(toIndentedString(emailBodyExtra)).append("\n");
    sb.append("    disableEmail: ").append(toIndentedString(disableEmail)).append("\n");
    sb.append("    addAndroidAppLink: ").append(toIndentedString(addAndroidAppLink)).append("\n");
    sb.append("    addIosAppLink: ").append(toIndentedString(addIosAppLink)).append("\n");
    sb.append("    addWindowsAppLink: ").append(toIndentedString(addWindowsAppLink)).append("\n");
    sb.append("    allowDelegation: ").append(toIndentedString(allowDelegation)).append("\n");
    sb.append("    skipExternalDataValidation: ").append(toIndentedString(skipExternalDataValidation)).append("\n");
    sb.append("    authenticationMethods: ").append(toIndentedString(authenticationMethods)).append("\n");
    sb.append("    disposableCertificateData: ").append(toIndentedString(disposableCertificateData)).append("\n");
    sb.append("    swissComCertificateData: ").append(toIndentedString(swissComCertificateData)).append("\n");
    sb.append("    remoteCertificateData: ").append(toIndentedString(remoteCertificateData)).append("\n");
    sb.append("    otpData: ").append(toIndentedString(otpData)).append("\n");
    sb.append("    pkcs7SignerData: ").append(toIndentedString(pkcs7SignerData)).append("\n");
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

