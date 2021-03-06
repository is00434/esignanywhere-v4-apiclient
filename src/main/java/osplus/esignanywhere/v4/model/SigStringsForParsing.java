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
 * Configure how a SigString should be parsed.
 */
@ApiModel(description = "Configure how a SigString should be parsed.")
@JsonPropertyOrder({
  SigStringsForParsing.JSON_PROPERTY_START_PATTERN,
  SigStringsForParsing.JSON_PROPERTY_END_PATTERN,
  SigStringsForParsing.JSON_PROPERTY_CLEAR_SIG_STRING,
  SigStringsForParsing.JSON_PROPERTY_SEARCH_ENTIRE_WORD_ONLY
})
@JsonTypeName("SigStringsForParsing")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class SigStringsForParsing {
  public static final String JSON_PROPERTY_START_PATTERN = "StartPattern";
  private String startPattern;

  public static final String JSON_PROPERTY_END_PATTERN = "EndPattern";
  private String endPattern;

  public static final String JSON_PROPERTY_CLEAR_SIG_STRING = "ClearSigString";
  private Boolean clearSigString;

  public static final String JSON_PROPERTY_SEARCH_ENTIRE_WORD_ONLY = "SearchEntireWordOnly";
  private Boolean searchEntireWordOnly;


  public SigStringsForParsing startPattern(String startPattern) {
    
    this.startPattern = startPattern;
    return this;
  }

   /**
   * Defines the start pattern.
   * @return startPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the start pattern.")
  @JsonProperty(JSON_PROPERTY_START_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartPattern() {
    return startPattern;
  }


  public void setStartPattern(String startPattern) {
    this.startPattern = startPattern;
  }


  public SigStringsForParsing endPattern(String endPattern) {
    
    this.endPattern = endPattern;
    return this;
  }

   /**
   * Defines the end pattern.
   * @return endPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the end pattern.")
  @JsonProperty(JSON_PROPERTY_END_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndPattern() {
    return endPattern;
  }


  public void setEndPattern(String endPattern) {
    this.endPattern = endPattern;
  }


  public SigStringsForParsing clearSigString(Boolean clearSigString) {
    
    this.clearSigString = clearSigString;
    return this;
  }

   /**
   * Configure if the SigString should be cleared.
   * @return clearSigString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configure if the SigString should be cleared.")
  @JsonProperty(JSON_PROPERTY_CLEAR_SIG_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getClearSigString() {
    return clearSigString;
  }


  public void setClearSigString(Boolean clearSigString) {
    this.clearSigString = clearSigString;
  }


  public SigStringsForParsing searchEntireWordOnly(Boolean searchEntireWordOnly) {
    
    this.searchEntireWordOnly = searchEntireWordOnly;
    return this;
  }

   /**
   * Configure if the entire word should be searched only.
   * @return searchEntireWordOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configure if the entire word should be searched only.")
  @JsonProperty(JSON_PROPERTY_SEARCH_ENTIRE_WORD_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSearchEntireWordOnly() {
    return searchEntireWordOnly;
  }


  public void setSearchEntireWordOnly(Boolean searchEntireWordOnly) {
    this.searchEntireWordOnly = searchEntireWordOnly;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigStringsForParsing sigStringsForParsing = (SigStringsForParsing) o;
    return Objects.equals(this.startPattern, sigStringsForParsing.startPattern) &&
        Objects.equals(this.endPattern, sigStringsForParsing.endPattern) &&
        Objects.equals(this.clearSigString, sigStringsForParsing.clearSigString) &&
        Objects.equals(this.searchEntireWordOnly, sigStringsForParsing.searchEntireWordOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startPattern, endPattern, clearSigString, searchEntireWordOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigStringsForParsing {\n");
    sb.append("    startPattern: ").append(toIndentedString(startPattern)).append("\n");
    sb.append("    endPattern: ").append(toIndentedString(endPattern)).append("\n");
    sb.append("    clearSigString: ").append(toIndentedString(clearSigString)).append("\n");
    sb.append("    searchEntireWordOnly: ").append(toIndentedString(searchEntireWordOnly)).append("\n");
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

