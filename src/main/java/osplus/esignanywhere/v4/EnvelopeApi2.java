package osplus.esignanywhere.v4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import osplus.esignanywhere.v4.api.EnvelopeApi;
import osplus.esignanywhere.v4.invoker.ApiClient;

/**
 * EnvelopeApi2.
 * 
 * @author j295050
 *
 */
class EnvelopeApi2 extends EnvelopeApi {
	
	public EnvelopeApi2(final ApiClient apiClient) {
		super(apiClient);
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
    @Override
    public ResponseEntity<byte[]> envelopeDownloadCompletedDocumentAsByteArrayWithHttpInfo(final String documentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentId' when calling envelopeDownloadCompletedDocument");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("documentId", documentId);
        String path = getApiClient().expandPath("/v4.0/envelope/downloadCompletedDocument/{documentId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
        		"application/pdf", "application/octet-stream", "text/json", "application/json"
        };
        final List<MediaType> localVarAccept = getApiClient().selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = getApiClient().selectHeaderContentType(contentTypes);

        final String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return getApiClient().invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Override
    public ResponseEntity<byte[]> envelopeDownloadPageImageAsByteArrayWithHttpInfo(final String envelopeId, final String docRefNumber, final String pageNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'envelopeId' is set
        if (envelopeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'envelopeId' when calling envelopeDownloadPageImageAsByteArray");
        }
        
        // verify the required parameter 'docRefNumber' is set
        if (docRefNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'docRefNumber' when calling envelopeDownloadPageImageAsByteArray");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageNumber' when calling envelopeDownloadPageImageAsByteArray");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("envelopeId", envelopeId);
        uriVariables.put("docRefNumber", docRefNumber);
        uriVariables.put("pageNumber", pageNumber);
        String path = getApiClient().expandPath("/v4.0/envelope/{envelopeId}/downloadPageImage/{docRefNumber}/{pageNumber}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream", "text/json", "application/json"
         };
        final List<MediaType> localVarAccept = getApiClient().selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = getApiClient().selectHeaderContentType(contentTypes);

        final String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return getApiClient().invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
