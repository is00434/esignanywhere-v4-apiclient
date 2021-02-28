package osplus.esignanywhere.v4.api;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
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
import osplus.esignanywhere.v4.model.UploadSspFileResult;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
@Component("osplus.esignanywhere.v4.api.SspFileApi")
public class SspFileApi {
    private ApiClient apiClient;

    public SspFileApi() {
        this(new ApiClient());
    }

    @Autowired
    public SspFileApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Diposes a file which was uploaded beforehand.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param sspFileId The id for the uploaded file. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void sspFileDisposeFile(String sspFileId) throws RestClientException {
        sspFileDisposeFileWithHttpInfo(sspFileId);
    }

    /**
     * Diposes a file which was uploaded beforehand.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param sspFileId The id for the uploaded file. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> sspFileDisposeFileWithHttpInfo(String sspFileId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'sspFileId' is set
        if (sspFileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sspFileId' when calling sspFileDisposeFile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("sspFileId", sspFileId);
        String path = apiClient.expandPath("/v4.0/sspfile/disposefile/{sspFileId}", uriVariables);

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
     * Uploads a file for further processing/using.  Content-Type must be multipart/form-data!
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>415</b> - UnsupportedMediaType
     * @param file Filename of uploaded software package (required)
     * @return UploadSspFileResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UploadSspFileResult sspFileUploadTemporary(File file) throws RestClientException {
        return sspFileUploadTemporaryWithHttpInfo(file).getBody();
    }

    /**
     * Uploads a file for further processing/using.  Content-Type must be multipart/form-data!
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>415</b> - UnsupportedMediaType
     * @param file Filename of uploaded software package (required)
     * @return ResponseEntity&lt;UploadSspFileResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UploadSspFileResult> sspFileUploadTemporaryWithHttpInfo(File file) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'file' when calling sspFileUploadTemporary");
        }
        
        String path = apiClient.expandPath("/v4.0/sspfile/uploadtemporary", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (file != null)
            formParams.add("File", new FileSystemResource(file));

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<UploadSspFileResult> returnType = new ParameterizedTypeReference<UploadSspFileResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Uploads a file for further processing/using. The implementation MUST be reimplemented (overridden) in Subclass!  Content-Type must be multipart/form-data!
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>415</b> - UnsupportedMediaType
     * @param filename Filename of uploaded software package (required)
     * @param content Content of uploaded software package (required)
     * @return UploadSspFileResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UploadSspFileResult sspFileUploadTemporaryFromByteArray(String filename, byte[] content) throws RestClientException {
        return sspFileUploadTemporaryFromByteArrayWithHttpInfo(filename, content).getBody();
    }

    /**
     * Uploads a file for further processing/using. The implementation MUST be reimplemented (overridden) in Subclass!  Content-Type must be multipart/form-data!
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>415</b> - UnsupportedMediaType
     * @param filename Filename of uploaded software package (required)
     * @param content Content of uploaded software package (required)
     * @return ResponseEntity&lt;UploadSspFileResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UploadSspFileResult> sspFileUploadTemporaryFromByteArrayWithHttpInfo(String filename, byte[] content) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'filename' is set
        if (filename == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filename' when calling sspFileUploadTemporaryFromByteArray");
        }
        
        // verify the required parameter 'content' is set
        if (content == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'content' when calling sspFileUploadTemporaryFromByteArray");
        }
        
        String path = apiClient.expandPath("/v4.0/sspfile/uploadtemporaryfrombytearray", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (filename != null)
            formParams.add("Filename", filename);
        if (content != null)
            formParams.add("Content", content);

        final String[] localVarAccepts = { 
            "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "organizationKey", "userLoginName" };

        ParameterizedTypeReference<UploadSspFileResult> returnType = new ParameterizedTypeReference<UploadSspFileResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
