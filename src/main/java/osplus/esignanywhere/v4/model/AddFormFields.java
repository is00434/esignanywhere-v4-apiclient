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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains a list of form fields which should be added to the document.
 */
@ApiModel(description = "Contains a list of form fields which should be added to the document.")
@JsonPropertyOrder({
  AddFormFields.JSON_PROPERTY_FORMS
})
@JsonTypeName("AddFormFields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class AddFormFields {
  public static final String JSON_PROPERTY_FORMS = "Forms";
  private Map<String, List<AddFormFieldDescriptor>> forms = null;


  public AddFormFields forms(Map<String, List<AddFormFieldDescriptor>> forms) {
    
    this.forms = forms;
    return this;
  }

  public AddFormFields putFormsItem(String key, List<AddFormFieldDescriptor> formsItem) {
    if (this.forms == null) {
      this.forms = new HashMap<String, List<AddFormFieldDescriptor>>();
    }
    this.forms.put(key, formsItem);
    return this;
  }

   /**
   * A dictionary consisting of doc reference numbers and form field descriptions.
   * @return forms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A dictionary consisting of doc reference numbers and form field descriptions.")
  @JsonProperty(JSON_PROPERTY_FORMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<AddFormFieldDescriptor>> getForms() {
    return forms;
  }


  public void setForms(Map<String, List<AddFormFieldDescriptor>> forms) {
    this.forms = forms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddFormFields addFormFields = (AddFormFields) o;
    return Objects.equals(this.forms, addFormFields.forms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFormFields {\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
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

