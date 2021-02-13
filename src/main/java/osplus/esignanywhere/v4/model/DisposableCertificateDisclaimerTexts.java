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
 * DisposableCertificateDisclaimerTexts
 */
@JsonPropertyOrder({
  DisposableCertificateDisclaimerTexts.JSON_PROPERTY_TEXTS
})
@JsonTypeName("DisposableCertificateDisclaimerTexts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class DisposableCertificateDisclaimerTexts {
  public static final String JSON_PROPERTY_TEXTS = "Texts";
  private List<Text> texts = null;


  public DisposableCertificateDisclaimerTexts texts(List<Text> texts) {
    
    this.texts = texts;
    return this;
  }

  public DisposableCertificateDisclaimerTexts addTextsItem(Text textsItem) {
    if (this.texts == null) {
      this.texts = new ArrayList<Text>();
    }
    this.texts.add(textsItem);
    return this;
  }

   /**
   * List of texts.
   * @return texts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of texts.")
  @JsonProperty(JSON_PROPERTY_TEXTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Text> getTexts() {
    return texts;
  }


  public void setTexts(List<Text> texts) {
    this.texts = texts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisposableCertificateDisclaimerTexts disposableCertificateDisclaimerTexts = (DisposableCertificateDisclaimerTexts) o;
    return Objects.equals(this.texts, disposableCertificateDisclaimerTexts.texts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(texts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisposableCertificateDisclaimerTexts {\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
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

