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
 * If the workstep is not generated by hand but automatically generated by the Workstep Controller AdhocPolicies are specified
 */
@ApiModel(description = "If the workstep is not generated by hand but automatically generated by the Workstep Controller AdhocPolicies are specified")
@JsonPropertyOrder({
  AdhocPolicies.JSON_PROPERTY_ALLOW_MODIFICATIONS_AFTER_SIGNATURE
})
@JsonTypeName("AdhocPolicies")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class AdhocPolicies {
  public static final String JSON_PROPERTY_ALLOW_MODIFICATIONS_AFTER_SIGNATURE = "AllowModificationsAfterSignature";
  private Boolean allowModificationsAfterSignature = true;


  public AdhocPolicies allowModificationsAfterSignature(Boolean allowModificationsAfterSignature) {
    
    this.allowModificationsAfterSignature = allowModificationsAfterSignature;
    return this;
  }

   /**
   * Allows modification after the signature.
   * @return allowModificationsAfterSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows modification after the signature.")
  @JsonProperty(JSON_PROPERTY_ALLOW_MODIFICATIONS_AFTER_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowModificationsAfterSignature() {
    return allowModificationsAfterSignature;
  }


  public void setAllowModificationsAfterSignature(Boolean allowModificationsAfterSignature) {
    this.allowModificationsAfterSignature = allowModificationsAfterSignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdhocPolicies adhocPolicies = (AdhocPolicies) o;
    return Objects.equals(this.allowModificationsAfterSignature, adhocPolicies.allowModificationsAfterSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowModificationsAfterSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdhocPolicies {\n");
    sb.append("    allowModificationsAfterSignature: ").append(toIndentedString(allowModificationsAfterSignature)).append("\n");
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
