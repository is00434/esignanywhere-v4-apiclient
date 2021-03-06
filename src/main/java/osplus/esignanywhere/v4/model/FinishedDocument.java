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
 * FinishedDocument
 */
@JsonPropertyOrder({
  FinishedDocument.JSON_PROPERTY_FLOW_DOCUMENT_ID,
  FinishedDocument.JSON_PROPERTY_LOG_DOCUMENT_ID,
  FinishedDocument.JSON_PROPERTY_ATTACHMENTS,
  FinishedDocument.JSON_PROPERTY_SIGNED_SIGNATURE_FIELDS,
  FinishedDocument.JSON_PROPERTY_DOC_REF_NUMBER,
  FinishedDocument.JSON_PROPERTY_FILE_NAME,
  FinishedDocument.JSON_PROPERTY_FORM_FIELDS
})
@JsonTypeName("FinishedDocument")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class FinishedDocument {
  public static final String JSON_PROPERTY_FLOW_DOCUMENT_ID = "FlowDocumentId";
  private String flowDocumentId;

  public static final String JSON_PROPERTY_LOG_DOCUMENT_ID = "LogDocumentId";
  private String logDocumentId;

  public static final String JSON_PROPERTY_ATTACHMENTS = "Attachments";
  private List<DocumentAttachment> attachments = null;

  public static final String JSON_PROPERTY_SIGNED_SIGNATURE_FIELDS = "SignedSignatureFields";
  private List<DocumentSignatureField> signedSignatureFields = null;

  public static final String JSON_PROPERTY_DOC_REF_NUMBER = "DocRefNumber";
  private Integer docRefNumber;

  public static final String JSON_PROPERTY_FILE_NAME = "FileName";
  private String fileName;

  public static final String JSON_PROPERTY_FORM_FIELDS = "FormFields";
  private List<DocumentFormField> formFields = null;


  public FinishedDocument flowDocumentId(String flowDocumentId) {
    
    this.flowDocumentId = flowDocumentId;
    return this;
  }

   /**
   * Get flowDocumentId
   * @return flowDocumentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FLOW_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlowDocumentId() {
    return flowDocumentId;
  }


  public void setFlowDocumentId(String flowDocumentId) {
    this.flowDocumentId = flowDocumentId;
  }


  public FinishedDocument logDocumentId(String logDocumentId) {
    
    this.logDocumentId = logDocumentId;
    return this;
  }

   /**
   * Get logDocumentId
   * @return logDocumentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOG_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogDocumentId() {
    return logDocumentId;
  }


  public void setLogDocumentId(String logDocumentId) {
    this.logDocumentId = logDocumentId;
  }


  public FinishedDocument attachments(List<DocumentAttachment> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public FinishedDocument addAttachmentsItem(DocumentAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<DocumentAttachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocumentAttachment> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<DocumentAttachment> attachments) {
    this.attachments = attachments;
  }


  public FinishedDocument signedSignatureFields(List<DocumentSignatureField> signedSignatureFields) {
    
    this.signedSignatureFields = signedSignatureFields;
    return this;
  }

  public FinishedDocument addSignedSignatureFieldsItem(DocumentSignatureField signedSignatureFieldsItem) {
    if (this.signedSignatureFields == null) {
      this.signedSignatureFields = new ArrayList<DocumentSignatureField>();
    }
    this.signedSignatureFields.add(signedSignatureFieldsItem);
    return this;
  }

   /**
   * Get signedSignatureFields
   * @return signedSignatureFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIGNED_SIGNATURE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocumentSignatureField> getSignedSignatureFields() {
    return signedSignatureFields;
  }


  public void setSignedSignatureFields(List<DocumentSignatureField> signedSignatureFields) {
    this.signedSignatureFields = signedSignatureFields;
  }


  public FinishedDocument docRefNumber(Integer docRefNumber) {
    
    this.docRefNumber = docRefNumber;
    return this;
  }

   /**
   * Get docRefNumber
   * @return docRefNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOC_REF_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDocRefNumber() {
    return docRefNumber;
  }


  public void setDocRefNumber(Integer docRefNumber) {
    this.docRefNumber = docRefNumber;
  }


  public FinishedDocument fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public FinishedDocument formFields(List<DocumentFormField> formFields) {
    
    this.formFields = formFields;
    return this;
  }

  public FinishedDocument addFormFieldsItem(DocumentFormField formFieldsItem) {
    if (this.formFields == null) {
      this.formFields = new ArrayList<DocumentFormField>();
    }
    this.formFields.add(formFieldsItem);
    return this;
  }

   /**
   * Get formFields
   * @return formFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocumentFormField> getFormFields() {
    return formFields;
  }


  public void setFormFields(List<DocumentFormField> formFields) {
    this.formFields = formFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinishedDocument finishedDocument = (FinishedDocument) o;
    return Objects.equals(this.flowDocumentId, finishedDocument.flowDocumentId) &&
        Objects.equals(this.logDocumentId, finishedDocument.logDocumentId) &&
        Objects.equals(this.attachments, finishedDocument.attachments) &&
        Objects.equals(this.signedSignatureFields, finishedDocument.signedSignatureFields) &&
        Objects.equals(this.docRefNumber, finishedDocument.docRefNumber) &&
        Objects.equals(this.fileName, finishedDocument.fileName) &&
        Objects.equals(this.formFields, finishedDocument.formFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowDocumentId, logDocumentId, attachments, signedSignatureFields, docRefNumber, fileName, formFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinishedDocument {\n");
    sb.append("    flowDocumentId: ").append(toIndentedString(flowDocumentId)).append("\n");
    sb.append("    logDocumentId: ").append(toIndentedString(logDocumentId)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    signedSignatureFields: ").append(toIndentedString(signedSignatureFields)).append("\n");
    sb.append("    docRefNumber: ").append(toIndentedString(docRefNumber)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    formFields: ").append(toIndentedString(formFields)).append("\n");
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

