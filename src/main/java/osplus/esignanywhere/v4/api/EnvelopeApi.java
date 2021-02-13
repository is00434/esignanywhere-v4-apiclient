package osplus.esignanywhere.v4.api;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import osplus.esignanywhere.v4.invoker.ApiClient;
import osplus.esignanywhere.v4.model.CopyDocumentFromTemplateResult;
import osplus.esignanywhere.v4.model.CreateDraftResult;
import osplus.esignanywhere.v4.model.DraftCreateFromTemplateModel;
import osplus.esignanywhere.v4.model.DraftCreateModel;
import osplus.esignanywhere.v4.model.EnvelopePrepareModel;
import osplus.esignanywhere.v4.model.EnvelopeSendFromTemplateModel;
import osplus.esignanywhere.v4.model.EnvelopeSendModel;
import osplus.esignanywhere.v4.model.EnvelopeStatus;
import osplus.esignanywhere.v4.model.ExtendedFindEnvelopesResult;
import osplus.esignanywhere.v4.model.FindEnvelopesDescriptor;
import osplus.esignanywhere.v4.model.PrepareSendEnvelopeStepsResult;
import osplus.esignanywhere.v4.model.SendEnvelopeResult;
import osplus.esignanywhere.v4.model.SendRemindersResult;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
@Component("osplus.esignanywhere.v4.api.EnvelopeApi")
public class EnvelopeApi {
    private ApiClient apiClient;

    public EnvelopeApi() {
        this(new ApiClient());
    }

    @Autowired
    public EnvelopeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns an envelope for the given id.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @return EnvelopeStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnvelopeStatus envelopeById(String envelopeId) throws RestClientException {
        return envelopeByIdWithHttpInfo(envelopeId).getBody();
    }

    /**
     * Returns an envelope for the given id.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @return ResponseEntity&lt;EnvelopeStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EnvelopeStatus> envelopeByIdWithHttpInfo(String envelopeId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'envelopeId' is set
        if (envelopeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'envelopeId' when calling envelopeById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("envelopeId", envelopeId);
        String path = apiClient.expandPath("/v4.0/envelope/{envelopeId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<EnvelopeStatus> returnType = new ParameterizedTypeReference<EnvelopeStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Cancel an envelope with the given envelope id.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void envelopeCancel(String envelopeId) throws RestClientException {
        envelopeCancelWithHttpInfo(envelopeId);
    }

    /**
     * Cancel an envelope with the given envelope id.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> envelopeCancelWithHttpInfo(String envelopeId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'envelopeId' is set
        if (envelopeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'envelopeId' when calling envelopeCancel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("envelopeId", envelopeId);
        String path = apiClient.expandPath("/v4.0/envelope/{envelopeId}/cancel", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Copy all the ids from the documents uploaded in the provided template.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param templateId The id of the template. (required)
     * @return CopyDocumentFromTemplateResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CopyDocumentFromTemplateResult envelopeCopyFromTemplate(String templateId) throws RestClientException {
        return envelopeCopyFromTemplateWithHttpInfo(templateId).getBody();
    }

    /**
     * Copy all the ids from the documents uploaded in the provided template.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param templateId The id of the template. (required)
     * @return ResponseEntity&lt;CopyDocumentFromTemplateResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CopyDocumentFromTemplateResult> envelopeCopyFromTemplateWithHttpInfo(String templateId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'templateId' when calling envelopeCopyFromTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("templateId", templateId);
        String path = apiClient.expandPath("/v4.0/envelope/{templateId}/copyFromTemplate", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<CopyDocumentFromTemplateResult> returnType = new ParameterizedTypeReference<CopyDocumentFromTemplateResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Creates a draft with the given information.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param draftCreateModel Draft creation model. (required)
     * @return CreateDraftResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateDraftResult envelopeCreate(DraftCreateModel draftCreateModel) throws RestClientException {
        return envelopeCreateWithHttpInfo(draftCreateModel).getBody();
    }

    /**
     * Creates a draft with the given information.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param draftCreateModel Draft creation model. (required)
     * @return ResponseEntity&lt;CreateDraftResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateDraftResult> envelopeCreateWithHttpInfo(DraftCreateModel draftCreateModel) throws RestClientException {
        Object postBody = draftCreateModel;
        
        // verify the required parameter 'draftCreateModel' is set
        if (draftCreateModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'draftCreateModel' when calling envelopeCreate");
        }
        
        String path = apiClient.expandPath("/v4.0/envelope/create", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<CreateDraftResult> returnType = new ParameterizedTypeReference<CreateDraftResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Creates a draft from an existing template.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param createFromTemplateModel  (required)
     * @return CreateDraftResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateDraftResult envelopeCreateFromTemplate(DraftCreateFromTemplateModel createFromTemplateModel) throws RestClientException {
        return envelopeCreateFromTemplateWithHttpInfo(createFromTemplateModel).getBody();
    }

    /**
     * Creates a draft from an existing template.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param createFromTemplateModel  (required)
     * @return ResponseEntity&lt;CreateDraftResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateDraftResult> envelopeCreateFromTemplateWithHttpInfo(DraftCreateFromTemplateModel createFromTemplateModel) throws RestClientException {
        Object postBody = createFromTemplateModel;
        
        // verify the required parameter 'createFromTemplateModel' is set
        if (createFromTemplateModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createFromTemplateModel' when calling envelopeCreateFromTemplate");
        }
        
        String path = apiClient.expandPath("/v4.0/envelope/createFromTemplate", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<CreateDraftResult> returnType = new ParameterizedTypeReference<CreateDraftResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Delete an envelope with the given id.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void envelopeDelete(String envelopeId) throws RestClientException {
        envelopeDeleteWithHttpInfo(envelopeId);
    }

    /**
     * Delete an envelope with the given id.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> envelopeDeleteWithHttpInfo(String envelopeId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'envelopeId' is set
        if (envelopeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'envelopeId' when calling envelopeDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("envelopeId", envelopeId);
        String path = apiClient.expandPath("/v4.0/envelope/{envelopeId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns a pdf document for the given id.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param documentId The id of the document you want to download. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] envelopeDownloadCompletedDocument(String documentId) throws RestClientException {
        return envelopeDownloadCompletedDocumentWithHttpInfo(documentId).getBody();
    }

    /**
     * Returns a pdf document for the given id.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param documentId The id of the document you want to download. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> envelopeDownloadCompletedDocumentWithHttpInfo(String documentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentId' when calling envelopeDownloadCompletedDocument");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("documentId", documentId);
        String path = apiClient.expandPath("/v4.0/envelope/downloadCompletedDocument/{documentId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream", "text/json", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns a png image for the given page.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id for the envelope. NO Bulk id. (required)
     * @param docRefNumber The document number (starting with 1) (required)
     * @param pageNumber The page number (starting with 1) (required)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File envelopeDownloadPageImage(String envelopeId, String docRefNumber, String pageNumber) throws RestClientException {
        return envelopeDownloadPageImageWithHttpInfo(envelopeId, docRefNumber, pageNumber).getBody();
    }

    /**
     * Returns a png image for the given page.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id for the envelope. NO Bulk id. (required)
     * @param docRefNumber The document number (starting with 1) (required)
     * @param pageNumber The page number (starting with 1) (required)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> envelopeDownloadPageImageWithHttpInfo(String envelopeId, String docRefNumber, String pageNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'envelopeId' is set
        if (envelopeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'envelopeId' when calling envelopeDownloadPageImage");
        }
        
        // verify the required parameter 'docRefNumber' is set
        if (docRefNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'docRefNumber' when calling envelopeDownloadPageImage");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageNumber' when calling envelopeDownloadPageImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("envelopeId", envelopeId);
        uriVariables.put("docRefNumber", docRefNumber);
        uriVariables.put("pageNumber", pageNumber);
        String path = apiClient.expandPath("/v4.0/envelope/{envelopeId}/downloadPageImage/{docRefNumber}/{pageNumber}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream", "text/json", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns the found envelopes for the given descriptor.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param descriptor The find descriptor. (required)
     * @return ExtendedFindEnvelopesResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExtendedFindEnvelopesResult envelopeFind(FindEnvelopesDescriptor descriptor) throws RestClientException {
        return envelopeFindWithHttpInfo(descriptor).getBody();
    }

    /**
     * Returns the found envelopes for the given descriptor.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param descriptor The find descriptor. (required)
     * @return ResponseEntity&lt;ExtendedFindEnvelopesResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExtendedFindEnvelopesResult> envelopeFindWithHttpInfo(FindEnvelopesDescriptor descriptor) throws RestClientException {
        Object postBody = descriptor;
        
        // verify the required parameter 'descriptor' is set
        if (descriptor == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'descriptor' when calling envelopeFind");
        }
        
        String path = apiClient.expandPath("/v4.0/envelope/find", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<ExtendedFindEnvelopesResult> returnType = new ParameterizedTypeReference<ExtendedFindEnvelopesResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Parses the provided files for markup fields and sig string and returns the containing elements.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param prepareModel  (required)
     * @return PrepareSendEnvelopeStepsResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PrepareSendEnvelopeStepsResult envelopePrepare(EnvelopePrepareModel prepareModel) throws RestClientException {
        return envelopePrepareWithHttpInfo(prepareModel).getBody();
    }

    /**
     * Parses the provided files for markup fields and sig string and returns the containing elements.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param prepareModel  (required)
     * @return ResponseEntity&lt;PrepareSendEnvelopeStepsResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PrepareSendEnvelopeStepsResult> envelopePrepareWithHttpInfo(EnvelopePrepareModel prepareModel) throws RestClientException {
        Object postBody = prepareModel;
        
        // verify the required parameter 'prepareModel' is set
        if (prepareModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'prepareModel' when calling envelopePrepare");
        }
        
        String path = apiClient.expandPath("/v4.0/envelope/prepare", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<PrepareSendEnvelopeStepsResult> returnType = new ParameterizedTypeReference<PrepareSendEnvelopeStepsResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Sends a reminder email to the recipient which action is awaited for the provided envelope.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @return SendRemindersResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SendRemindersResult envelopeRemind(String envelopeId) throws RestClientException {
        return envelopeRemindWithHttpInfo(envelopeId).getBody();
    }

    /**
     * Sends a reminder email to the recipient which action is awaited for the provided envelope.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @return ResponseEntity&lt;SendRemindersResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SendRemindersResult> envelopeRemindWithHttpInfo(String envelopeId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'envelopeId' is set
        if (envelopeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'envelopeId' when calling envelopeRemind");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("envelopeId", envelopeId);
        String path = apiClient.expandPath("/v4.0/envelope/{envelopeId}/remind", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<SendRemindersResult> returnType = new ParameterizedTypeReference<SendRemindersResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Restarts the envelope with the given id and sets the expiration days.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @param expirationInDays The number of days until the restarted envelope expires again. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void envelopeRestart(String envelopeId, Integer expirationInDays) throws RestClientException {
        envelopeRestartWithHttpInfo(envelopeId, expirationInDays);
    }

    /**
     * Restarts the envelope with the given id and sets the expiration days.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @param expirationInDays The number of days until the restarted envelope expires again. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> envelopeRestartWithHttpInfo(String envelopeId, Integer expirationInDays) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'envelopeId' is set
        if (envelopeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'envelopeId' when calling envelopeRestart");
        }
        
        // verify the required parameter 'expirationInDays' is set
        if (expirationInDays == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'expirationInDays' when calling envelopeRestart");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("envelopeId", envelopeId);
        uriVariables.put("expirationInDays", expirationInDays);
        String path = apiClient.expandPath("/v4.0/envelope/{envelopeId}/restart/{expirationInDays}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Creates and directly sends a new envelope.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param sendModel  (required)
     * @return SendEnvelopeResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SendEnvelopeResult envelopeSend(EnvelopeSendModel sendModel) throws RestClientException {
        return envelopeSendWithHttpInfo(sendModel).getBody();
    }

    /**
     * Creates and directly sends a new envelope.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param sendModel  (required)
     * @return ResponseEntity&lt;SendEnvelopeResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SendEnvelopeResult> envelopeSendWithHttpInfo(EnvelopeSendModel sendModel) throws RestClientException {
        Object postBody = sendModel;
        
        // verify the required parameter 'sendModel' is set
        if (sendModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sendModel' when calling envelopeSend");
        }
        
        String path = apiClient.expandPath("/v4.0/envelope/send", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<SendEnvelopeResult> returnType = new ParameterizedTypeReference<SendEnvelopeResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Creates an envelope from a existing template and directly sends it.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param sendFromTemplateModel  (required)
     * @return SendEnvelopeResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SendEnvelopeResult envelopeSendFromTemplate(EnvelopeSendFromTemplateModel sendFromTemplateModel) throws RestClientException {
        return envelopeSendFromTemplateWithHttpInfo(sendFromTemplateModel).getBody();
    }

    /**
     * Creates an envelope from a existing template and directly sends it.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param sendFromTemplateModel  (required)
     * @return ResponseEntity&lt;SendEnvelopeResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SendEnvelopeResult> envelopeSendFromTemplateWithHttpInfo(EnvelopeSendFromTemplateModel sendFromTemplateModel) throws RestClientException {
        Object postBody = sendFromTemplateModel;
        
        // verify the required parameter 'sendFromTemplateModel' is set
        if (sendFromTemplateModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sendFromTemplateModel' when calling envelopeSendFromTemplate");
        }
        
        String path = apiClient.expandPath("/v4.0/envelope/sendFromTemplate", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<SendEnvelopeResult> returnType = new ParameterizedTypeReference<SendEnvelopeResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Unlock an envelope with the given id.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void envelopeUnlock(String envelopeId) throws RestClientException {
        envelopeUnlockWithHttpInfo(envelopeId);
    }

    /**
     * Unlock an envelope with the given id.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> envelopeUnlockWithHttpInfo(String envelopeId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'envelopeId' is set
        if (envelopeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'envelopeId' when calling envelopeUnlock");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("envelopeId", envelopeId);
        String path = apiClient.expandPath("/v4.0/envelope/{envelopeId}/unlock", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
