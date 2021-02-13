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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Flow Api error.
 */
@ApiModel(description = "Flow Api error.")
@JsonPropertyOrder({
  Error.JSON_PROPERTY_ERROR_ID,
  Error.JSON_PROPERTY_MESSAGE,
  Error.JSON_PROPERTY_SUPPORT_ID,
  Error.JSON_PROPERTY_THROWN_EXCEPTION
})
@JsonTypeName("Error")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class Error {
  public static final String JSON_PROPERTY_ERROR_ID = "ErrorId";
  private String errorId;

  public static final String JSON_PROPERTY_MESSAGE = "Message";
  private String message;

  public static final String JSON_PROPERTY_SUPPORT_ID = "SupportId";
  private String supportId;

  public static final String JSON_PROPERTY_THROWN_EXCEPTION = "ThrownException";
  private Object thrownException;


  public Error errorId(String errorId) {
    
    this.errorId = errorId;
    return this;
  }

   /**
   * Id of the error.
   * @return errorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the error.")
  @JsonProperty(JSON_PROPERTY_ERROR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorId() {
    return errorId;
  }


  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }


  public Error message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message from the error.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message from the error.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Error supportId(String supportId) {
    
    this.supportId = supportId;
    return this;
  }

   /**
   * Support identifier.
   * @return supportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Support identifier.")
  @JsonProperty(JSON_PROPERTY_SUPPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSupportId() {
    return supportId;
  }


  public void setSupportId(String supportId) {
    this.supportId = supportId;
  }


  public Error thrownException(Object thrownException) {
    
    this.thrownException = thrownException;
    return this;
  }

   /**
   * Get thrownException
   * @return thrownException
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THROWN_EXCEPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getThrownException() {
    return thrownException;
  }


  public void setThrownException(Object thrownException) {
    this.thrownException = thrownException;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errorId, error.errorId) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.supportId, error.supportId) &&
        Objects.equals(this.thrownException, error.thrownException);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorId, message, supportId, thrownException);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    supportId: ").append(toIndentedString(supportId)).append("\n");
    sb.append("    thrownException: ").append(toIndentedString(thrownException)).append("\n");
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

