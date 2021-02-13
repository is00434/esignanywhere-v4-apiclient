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
 * Configure settings for multiple signature types and batch signing.
 */
@ApiModel(description = "Configure settings for multiple signature types and batch signing.")
@JsonPropertyOrder({
  MultipleSignatureTypesAndBatchSigningSettings.JSON_PROPERTY_IS_USE_BATCH_SIGNING_CHECKED_BY_DEFAULT,
  MultipleSignatureTypesAndBatchSigningSettings.JSON_PROPERTY_IS_REMEMBER_SIGNATURE_TYPE_CHECKED_BY_DEFAULT,
  MultipleSignatureTypesAndBatchSigningSettings.JSON_PROPERTY_IS_REMEMBER_BATCH_SIGNING_DECISION_CHECKED_BY_DEFAULT,
  MultipleSignatureTypesAndBatchSigningSettings.JSON_PROPERTY_SKIP_MULTIPLE_SIGNATURE_TYPES_AND_BATCH_SIGNING_DIALOG_IF_BATCH_SIGNING_POSSIBLE
})
@JsonTypeName("MultipleSignatureTypesAndBatchSigningSettings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class MultipleSignatureTypesAndBatchSigningSettings {
  public static final String JSON_PROPERTY_IS_USE_BATCH_SIGNING_CHECKED_BY_DEFAULT = "IsUseBatchSigningCheckedByDefault";
  private Boolean isUseBatchSigningCheckedByDefault;

  public static final String JSON_PROPERTY_IS_REMEMBER_SIGNATURE_TYPE_CHECKED_BY_DEFAULT = "IsRememberSignatureTypeCheckedByDefault";
  private Boolean isRememberSignatureTypeCheckedByDefault;

  public static final String JSON_PROPERTY_IS_REMEMBER_BATCH_SIGNING_DECISION_CHECKED_BY_DEFAULT = "IsRememberBatchSigningDecisionCheckedByDefault";
  private Boolean isRememberBatchSigningDecisionCheckedByDefault;

  public static final String JSON_PROPERTY_SKIP_MULTIPLE_SIGNATURE_TYPES_AND_BATCH_SIGNING_DIALOG_IF_BATCH_SIGNING_POSSIBLE = "SkipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible";
  private Boolean skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible;


  public MultipleSignatureTypesAndBatchSigningSettings isUseBatchSigningCheckedByDefault(Boolean isUseBatchSigningCheckedByDefault) {
    
    this.isUseBatchSigningCheckedByDefault = isUseBatchSigningCheckedByDefault;
    return this;
  }

   /**
   * If enabled, the \&quot;Use batch signing\&quot; checkbox inside the dialog when signing a signature field is checked by default.
   * @return isUseBatchSigningCheckedByDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If enabled, the \"Use batch signing\" checkbox inside the dialog when signing a signature field is checked by default.")
  @JsonProperty(JSON_PROPERTY_IS_USE_BATCH_SIGNING_CHECKED_BY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsUseBatchSigningCheckedByDefault() {
    return isUseBatchSigningCheckedByDefault;
  }


  public void setIsUseBatchSigningCheckedByDefault(Boolean isUseBatchSigningCheckedByDefault) {
    this.isUseBatchSigningCheckedByDefault = isUseBatchSigningCheckedByDefault;
  }


  public MultipleSignatureTypesAndBatchSigningSettings isRememberSignatureTypeCheckedByDefault(Boolean isRememberSignatureTypeCheckedByDefault) {
    
    this.isRememberSignatureTypeCheckedByDefault = isRememberSignatureTypeCheckedByDefault;
    return this;
  }

   /**
   * If enabled, the \&quot;Remember signature type\&quot; checkbox inside the dialog when signing a signature field is checked by default.
   * @return isRememberSignatureTypeCheckedByDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If enabled, the \"Remember signature type\" checkbox inside the dialog when signing a signature field is checked by default.")
  @JsonProperty(JSON_PROPERTY_IS_REMEMBER_SIGNATURE_TYPE_CHECKED_BY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRememberSignatureTypeCheckedByDefault() {
    return isRememberSignatureTypeCheckedByDefault;
  }


  public void setIsRememberSignatureTypeCheckedByDefault(Boolean isRememberSignatureTypeCheckedByDefault) {
    this.isRememberSignatureTypeCheckedByDefault = isRememberSignatureTypeCheckedByDefault;
  }


  public MultipleSignatureTypesAndBatchSigningSettings isRememberBatchSigningDecisionCheckedByDefault(Boolean isRememberBatchSigningDecisionCheckedByDefault) {
    
    this.isRememberBatchSigningDecisionCheckedByDefault = isRememberBatchSigningDecisionCheckedByDefault;
    return this;
  }

   /**
   * If enabled, the \&quot;remember batch signing decision\&quot; checkbox inside the dialog when signing a signature field is checked by default.
   * @return isRememberBatchSigningDecisionCheckedByDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If enabled, the \"remember batch signing decision\" checkbox inside the dialog when signing a signature field is checked by default.")
  @JsonProperty(JSON_PROPERTY_IS_REMEMBER_BATCH_SIGNING_DECISION_CHECKED_BY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRememberBatchSigningDecisionCheckedByDefault() {
    return isRememberBatchSigningDecisionCheckedByDefault;
  }


  public void setIsRememberBatchSigningDecisionCheckedByDefault(Boolean isRememberBatchSigningDecisionCheckedByDefault) {
    this.isRememberBatchSigningDecisionCheckedByDefault = isRememberBatchSigningDecisionCheckedByDefault;
  }


  public MultipleSignatureTypesAndBatchSigningSettings skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible(Boolean skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible) {
    
    this.skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible = skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible;
    return this;
  }

   /**
   * If enabled, and the IsUseBatchSigningCheckedByDefault is also enabled, the dialog to confirm the batch signing (and optionally choosing the signature type) will be skipped if either the signature type to use has been remembered earlier or a preferred type is set.
   * @return skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If enabled, and the IsUseBatchSigningCheckedByDefault is also enabled, the dialog to confirm the batch signing (and optionally choosing the signature type) will be skipped if either the signature type to use has been remembered earlier or a preferred type is set.")
  @JsonProperty(JSON_PROPERTY_SKIP_MULTIPLE_SIGNATURE_TYPES_AND_BATCH_SIGNING_DIALOG_IF_BATCH_SIGNING_POSSIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible() {
    return skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible;
  }


  public void setSkipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible(Boolean skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible) {
    this.skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible = skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleSignatureTypesAndBatchSigningSettings multipleSignatureTypesAndBatchSigningSettings = (MultipleSignatureTypesAndBatchSigningSettings) o;
    return Objects.equals(this.isUseBatchSigningCheckedByDefault, multipleSignatureTypesAndBatchSigningSettings.isUseBatchSigningCheckedByDefault) &&
        Objects.equals(this.isRememberSignatureTypeCheckedByDefault, multipleSignatureTypesAndBatchSigningSettings.isRememberSignatureTypeCheckedByDefault) &&
        Objects.equals(this.isRememberBatchSigningDecisionCheckedByDefault, multipleSignatureTypesAndBatchSigningSettings.isRememberBatchSigningDecisionCheckedByDefault) &&
        Objects.equals(this.skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible, multipleSignatureTypesAndBatchSigningSettings.skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isUseBatchSigningCheckedByDefault, isRememberSignatureTypeCheckedByDefault, isRememberBatchSigningDecisionCheckedByDefault, skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleSignatureTypesAndBatchSigningSettings {\n");
    sb.append("    isUseBatchSigningCheckedByDefault: ").append(toIndentedString(isUseBatchSigningCheckedByDefault)).append("\n");
    sb.append("    isRememberSignatureTypeCheckedByDefault: ").append(toIndentedString(isRememberSignatureTypeCheckedByDefault)).append("\n");
    sb.append("    isRememberBatchSigningDecisionCheckedByDefault: ").append(toIndentedString(isRememberBatchSigningDecisionCheckedByDefault)).append("\n");
    sb.append("    skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible: ").append(toIndentedString(skipMultipleSignatureTypesAndBatchSigningDialogIfBatchSigningPossible)).append("\n");
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

