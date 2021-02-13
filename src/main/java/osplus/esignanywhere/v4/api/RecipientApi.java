package osplus.esignanywhere.v4.api;

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
import osplus.esignanywhere.v4.model.ReplaceRecipientData;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
@Component("osplus.esignanywhere.v4.api.RecipientApi")
public class RecipientApi {
    private ApiClient apiClient;

    public RecipientApi() {
        this(new ApiClient());
    }

    @Autowired
    public RecipientApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes a recipient from an envelope.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @param recipientId The id of an recipient in the bulk or envelope. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void recipientDeleteRecipient(String envelopeId, String recipientId) throws RestClientException {
        recipientDeleteRecipientWithHttpInfo(envelopeId, recipientId);
    }

    /**
     * Deletes a recipient from an envelope.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @param recipientId The id of an recipient in the bulk or envelope. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> recipientDeleteRecipientWithHttpInfo(String envelopeId, String recipientId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'envelopeId' is set
        if (envelopeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'envelopeId' when calling recipientDeleteRecipient");
        }
        
        // verify the required parameter 'recipientId' is set
        if (recipientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipientId' when calling recipientDeleteRecipient");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("envelopeId", envelopeId);
        uriVariables.put("recipientId", recipientId);
        String path = apiClient.expandPath("/v4.0/recipient/{recipientId}/fromEnvelope/{envelopeId}", uriVariables);

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
     * Replaces a recipient in an envelope.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @param recipientId The id of an recipient in the bulk or envelope. (required)
     * @param recipient The new recipient data. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void recipientReplace(String envelopeId, String recipientId, ReplaceRecipientData recipient) throws RestClientException {
        recipientReplaceWithHttpInfo(envelopeId, recipientId, recipient);
    }

    /**
     * Replaces a recipient in an envelope.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param envelopeId The id of the envelope/bulk. (required)
     * @param recipientId The id of an recipient in the bulk or envelope. (required)
     * @param recipient The new recipient data. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> recipientReplaceWithHttpInfo(String envelopeId, String recipientId, ReplaceRecipientData recipient) throws RestClientException {
        Object postBody = recipient;
        
        // verify the required parameter 'envelopeId' is set
        if (envelopeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'envelopeId' when calling recipientReplace");
        }
        
        // verify the required parameter 'recipientId' is set
        if (recipientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipientId' when calling recipientReplace");
        }
        
        // verify the required parameter 'recipient' is set
        if (recipient == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipient' when calling recipientReplace");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("envelopeId", envelopeId);
        uriVariables.put("recipientId", recipientId);
        String path = apiClient.expandPath("/v4.0/recipient/{recipientId}/fromEnvelope/{envelopeId}", uriVariables);

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
