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

import io.swagger.annotations.ApiModelProperty;

/**
 * ExtendedFindUsersResult
 */
@JsonPropertyOrder({
  ExtendedFindUsersResult.JSON_PROPERTY_ENTRIES
})
@JsonTypeName("ExtendedFindUsersResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class ExtendedFindUsersResult {
  public static final String JSON_PROPERTY_ENTRIES = "Entries";
  private List<ExtendedFindUsersResultEntry> entries = null;


  public ExtendedFindUsersResult entries(List<ExtendedFindUsersResultEntry> entries) {
    
    this.entries = entries;
    return this;
  }

  public ExtendedFindUsersResult addEntriesItem(ExtendedFindUsersResultEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<ExtendedFindUsersResultEntry>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExtendedFindUsersResultEntry> getEntries() {
    return entries;
  }


  public void setEntries(List<ExtendedFindUsersResultEntry> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedFindUsersResult extendedFindUsersResult = (ExtendedFindUsersResult) o;
    return Objects.equals(this.entries, extendedFindUsersResult.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedFindUsersResult {\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

