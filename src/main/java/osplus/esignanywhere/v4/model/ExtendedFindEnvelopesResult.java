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
 * The search result of the found envelopes.
 */
@ApiModel(description = "The search result of the found envelopes.")
@JsonPropertyOrder({
  ExtendedFindEnvelopesResult.JSON_PROPERTY_ENVELOPES
})
@JsonTypeName("ExtendedFindEnvelopesResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class ExtendedFindEnvelopesResult {
  public static final String JSON_PROPERTY_ENVELOPES = "Envelopes";
  private List<ExtendedFindEnvelopesResultEntry> envelopes = null;


  public ExtendedFindEnvelopesResult envelopes(List<ExtendedFindEnvelopesResultEntry> envelopes) {
    
    this.envelopes = envelopes;
    return this;
  }

  public ExtendedFindEnvelopesResult addEnvelopesItem(ExtendedFindEnvelopesResultEntry envelopesItem) {
    if (this.envelopes == null) {
      this.envelopes = new ArrayList<ExtendedFindEnvelopesResultEntry>();
    }
    this.envelopes.add(envelopesItem);
    return this;
  }

   /**
   * The envelopes which match the searched criteria.
   * @return envelopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The envelopes which match the searched criteria.")
  @JsonProperty(JSON_PROPERTY_ENVELOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExtendedFindEnvelopesResultEntry> getEnvelopes() {
    return envelopes;
  }


  public void setEnvelopes(List<ExtendedFindEnvelopesResultEntry> envelopes) {
    this.envelopes = envelopes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedFindEnvelopesResult extendedFindEnvelopesResult = (ExtendedFindEnvelopesResult) o;
    return Objects.equals(this.envelopes, extendedFindEnvelopesResult.envelopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedFindEnvelopesResult {\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
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

