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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Options for the draft creation.
 */
@ApiModel(description = "Options for the draft creation.")
@JsonPropertyOrder({
  CreateDraftOptions.JSON_PROPERTY_AFTER_SEND_REDIRECT_URL,
  CreateDraftOptions.JSON_PROPERTY_AFTER_SEND_CALLBACK_URL,
  CreateDraftOptions.JSON_PROPERTY_REDIRECT_POLICY,
  CreateDraftOptions.JSON_PROPERTY_ALLOW_AGENT_REDIRECT,
  CreateDraftOptions.JSON_PROPERTY_IFRAME_WHITE_LIST
})
@JsonTypeName("CreateDraftOptions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class CreateDraftOptions {
  public static final String JSON_PROPERTY_AFTER_SEND_REDIRECT_URL = "AfterSendRedirectUrl";
  private String afterSendRedirectUrl;

  public static final String JSON_PROPERTY_AFTER_SEND_CALLBACK_URL = "AfterSendCallbackUrl";
  private String afterSendCallbackUrl;

  /**
   * Specifies where to redirect if &lt;code&gt;AllowAgentRedirect&lt;/code&gt; is &lt;code&gt;true&lt;/code&gt;.
   */
  public enum RedirectPolicyEnum {
    NONE("None"),
    
    TORECIPIENTS("ToRecipients"),
    
    TODESIGNER("ToDesigner"),
    
    TOSEND("ToSend");

    private String value;

    RedirectPolicyEnum(String value) {
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
    public static RedirectPolicyEnum fromValue(String value) {
      for (RedirectPolicyEnum b : RedirectPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REDIRECT_POLICY = "RedirectPolicy";
  private RedirectPolicyEnum redirectPolicy;

  public static final String JSON_PROPERTY_ALLOW_AGENT_REDIRECT = "AllowAgentRedirect";
  private Boolean allowAgentRedirect;

  public static final String JSON_PROPERTY_IFRAME_WHITE_LIST = "IframeWhiteList";
  private String iframeWhiteList;


  public CreateDraftOptions afterSendRedirectUrl(String afterSendRedirectUrl) {
    
    this.afterSendRedirectUrl = afterSendRedirectUrl;
    return this;
  }

   /**
   * The redirection URL after sending the envelope.
   * @return afterSendRedirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The redirection URL after sending the envelope.")
  @JsonProperty(JSON_PROPERTY_AFTER_SEND_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAfterSendRedirectUrl() {
    return afterSendRedirectUrl;
  }


  public void setAfterSendRedirectUrl(String afterSendRedirectUrl) {
    this.afterSendRedirectUrl = afterSendRedirectUrl;
  }


  public CreateDraftOptions afterSendCallbackUrl(String afterSendCallbackUrl) {
    
    this.afterSendCallbackUrl = afterSendCallbackUrl;
    return this;
  }

   /**
   * The URL where a callbackl is sent to after sending the envelope.
   * @return afterSendCallbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL where a callbackl is sent to after sending the envelope.")
  @JsonProperty(JSON_PROPERTY_AFTER_SEND_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAfterSendCallbackUrl() {
    return afterSendCallbackUrl;
  }


  public void setAfterSendCallbackUrl(String afterSendCallbackUrl) {
    this.afterSendCallbackUrl = afterSendCallbackUrl;
  }


  public CreateDraftOptions redirectPolicy(RedirectPolicyEnum redirectPolicy) {
    
    this.redirectPolicy = redirectPolicy;
    return this;
  }

   /**
   * Specifies where to redirect if &lt;code&gt;AllowAgentRedirect&lt;/code&gt; is &lt;code&gt;true&lt;/code&gt;.
   * @return redirectPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies where to redirect if <code>AllowAgentRedirect</code> is <code>true</code>.")
  @JsonProperty(JSON_PROPERTY_REDIRECT_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedirectPolicyEnum getRedirectPolicy() {
    return redirectPolicy;
  }


  public void setRedirectPolicy(RedirectPolicyEnum redirectPolicy) {
    this.redirectPolicy = redirectPolicy;
  }


  public CreateDraftOptions allowAgentRedirect(Boolean allowAgentRedirect) {
    
    this.allowAgentRedirect = allowAgentRedirect;
    return this;
  }

   /**
   * Specifies if the agentmode is active.
   * @return allowAgentRedirect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the agentmode is active.")
  @JsonProperty(JSON_PROPERTY_ALLOW_AGENT_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowAgentRedirect() {
    return allowAgentRedirect;
  }


  public void setAllowAgentRedirect(Boolean allowAgentRedirect) {
    this.allowAgentRedirect = allowAgentRedirect;
  }


  public CreateDraftOptions iframeWhiteList(String iframeWhiteList) {
    
    this.iframeWhiteList = iframeWhiteList;
    return this;
  }

   /**
   * A string indicating a white list of urls where the designer is allowed to be used in agent mode.  Example: \&quot;http://172.16.17.181;http://foo.org\&quot;
   * @return iframeWhiteList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string indicating a white list of urls where the designer is allowed to be used in agent mode.  Example: \"http://172.16.17.181;http://foo.org\"")
  @JsonProperty(JSON_PROPERTY_IFRAME_WHITE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIframeWhiteList() {
    return iframeWhiteList;
  }


  public void setIframeWhiteList(String iframeWhiteList) {
    this.iframeWhiteList = iframeWhiteList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDraftOptions createDraftOptions = (CreateDraftOptions) o;
    return Objects.equals(this.afterSendRedirectUrl, createDraftOptions.afterSendRedirectUrl) &&
        Objects.equals(this.afterSendCallbackUrl, createDraftOptions.afterSendCallbackUrl) &&
        Objects.equals(this.redirectPolicy, createDraftOptions.redirectPolicy) &&
        Objects.equals(this.allowAgentRedirect, createDraftOptions.allowAgentRedirect) &&
        Objects.equals(this.iframeWhiteList, createDraftOptions.iframeWhiteList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterSendRedirectUrl, afterSendCallbackUrl, redirectPolicy, allowAgentRedirect, iframeWhiteList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDraftOptions {\n");
    sb.append("    afterSendRedirectUrl: ").append(toIndentedString(afterSendRedirectUrl)).append("\n");
    sb.append("    afterSendCallbackUrl: ").append(toIndentedString(afterSendCallbackUrl)).append("\n");
    sb.append("    redirectPolicy: ").append(toIndentedString(redirectPolicy)).append("\n");
    sb.append("    allowAgentRedirect: ").append(toIndentedString(allowAgentRedirect)).append("\n");
    sb.append("    iframeWhiteList: ").append(toIndentedString(iframeWhiteList)).append("\n");
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

