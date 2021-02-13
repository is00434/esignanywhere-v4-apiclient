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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Abstract class, use the derived classes:  - FormFieldValidationDate  - FormFieldValidationEmail  - FormFieldValidationNumber  - FormFieldValidationPhone  - FormFieldValidationTime                For usage see sample code.    Base class for
 */
@ApiModel(description = "Abstract class, use the derived classes:  - FormFieldValidationDate  - FormFieldValidationEmail  - FormFieldValidationNumber  - FormFieldValidationPhone  - FormFieldValidationTime                For usage see sample code.    Base class for")
@JsonPropertyOrder({
  FormFieldValidation.JSON_PROPERTY_DISCRIMINATOR_TYPE
})
@JsonTypeName("FormFieldValidation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "DiscriminatorType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = FormFieldValidationDate.class, name = "FormFieldValidationDate"),
  @JsonSubTypes.Type(value = FormFieldValidationEmail.class, name = "FormFieldValidationEmail"),
  @JsonSubTypes.Type(value = FormFieldValidationNumber.class, name = "FormFieldValidationNumber"),
  @JsonSubTypes.Type(value = FormFieldValidationPhone.class, name = "FormFieldValidationPhone"),
  @JsonSubTypes.Type(value = FormFieldValidationTime.class, name = "FormFieldValidationTime"),
})

public class FormFieldValidation {
  public static final String JSON_PROPERTY_DISCRIMINATOR_TYPE = "DiscriminatorType";
  protected String discriminatorType;


  public FormFieldValidation discriminatorType(String discriminatorType) {
    
    this.discriminatorType = discriminatorType;
    return this;
  }

   /**
   * Property for parsing abstract base classes (polymorphism) in auto generated Swagger code.
   * @return discriminatorType
  **/
  @ApiModelProperty(required = true, value = "Property for parsing abstract base classes (polymorphism) in auto generated Swagger code.")
  @JsonProperty(JSON_PROPERTY_DISCRIMINATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDiscriminatorType() {
    return discriminatorType;
  }


  public void setDiscriminatorType(String discriminatorType) {
    this.discriminatorType = discriminatorType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormFieldValidation formFieldValidation = (FormFieldValidation) o;
    return Objects.equals(this.discriminatorType, formFieldValidation.discriminatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discriminatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldValidation {\n");
    sb.append("    discriminatorType: ").append(toIndentedString(discriminatorType)).append("\n");
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

