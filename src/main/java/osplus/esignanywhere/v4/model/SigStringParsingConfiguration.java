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
 * Configure the signature string parsing.
 */
@ApiModel(description = "Configure the signature string parsing.")
@JsonPropertyOrder({
  SigStringParsingConfiguration.JSON_PROPERTY_SIG_STRINGS_FOR_PARSINGS
})
@JsonTypeName("SigStringParsingConfiguration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class SigStringParsingConfiguration {
  public static final String JSON_PROPERTY_SIG_STRINGS_FOR_PARSINGS = "SigStringsForParsings";
  private List<SigStringsForParsing> sigStringsForParsings = null;


  public SigStringParsingConfiguration sigStringsForParsings(List<SigStringsForParsing> sigStringsForParsings) {
    
    this.sigStringsForParsings = sigStringsForParsings;
    return this;
  }

  public SigStringParsingConfiguration addSigStringsForParsingsItem(SigStringsForParsing sigStringsForParsingsItem) {
    if (this.sigStringsForParsings == null) {
      this.sigStringsForParsings = new ArrayList<SigStringsForParsing>();
    }
    this.sigStringsForParsings.add(sigStringsForParsingsItem);
    return this;
  }

   /**
   * Collection of all SigStringsForParsing configurations.
   * @return sigStringsForParsings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of all SigStringsForParsing configurations.")
  @JsonProperty(JSON_PROPERTY_SIG_STRINGS_FOR_PARSINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SigStringsForParsing> getSigStringsForParsings() {
    return sigStringsForParsings;
  }


  public void setSigStringsForParsings(List<SigStringsForParsing> sigStringsForParsings) {
    this.sigStringsForParsings = sigStringsForParsings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigStringParsingConfiguration sigStringParsingConfiguration = (SigStringParsingConfiguration) o;
    return Objects.equals(this.sigStringsForParsings, sigStringParsingConfiguration.sigStringsForParsings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sigStringsForParsings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigStringParsingConfiguration {\n");
    sb.append("    sigStringsForParsings: ").append(toIndentedString(sigStringsForParsings)).append("\n");
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

