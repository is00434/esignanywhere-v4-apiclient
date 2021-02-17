package osplus.esignanywhere.v4;

import java.util.Collections;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import osplus.esignanywhere.v4.api.SspFileApi;
import osplus.esignanywhere.v4.invoker.ApiClient;
import osplus.esignanywhere.v4.model.UploadSspFileResult;

/**
 * SspFileApi2
 * 
 * @author j295050
 *
 */
class SspFileApi2 extends SspFileApi {
	
	public SspFileApi2(final ApiClient apiClient) {
		super(apiClient);
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
        if (filename == null || filename.isEmpty()) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                    "Missing the required parameter 'filename' when calling sspFileUploadTemporary");
        }

        final boolean hasPdfExtension = filename.toLowerCase().endsWith(".pdf");

        // verify the required parameter 'content' is set
        if (content == null || content.length == 0) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                    "Missing the required parameter 'content' when calling sspFileUploadTemporary");
        }

        final String path = getApiClient().expandPath("/v4.0/sspfile/uploadtemporary",
                Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final MultiValueMap<String, String> fileMap = new LinkedMultiValueMap<>();
        final ContentDisposition contentDisposition = ContentDisposition.builder("form-data").name("file")
                .filename(filename).build();
        fileMap.add(HttpHeaders.CONTENT_DISPOSITION, contentDisposition.toString());
        if (hasPdfExtension) {
            fileMap.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_PDF_VALUE);
        }

        final HttpEntity<byte[]> fileEntity = new HttpEntity<>(content, fileMap);
        formParams.add("file", fileEntity);

        final String[] localVarAccepts = { "application/json", "text/json" };
        final List<MediaType> localVarAccept = getApiClient().selectHeaderAccept(localVarAccepts);

        final String[] contentTypes = { "multipart/form-data" };
        final MediaType contentType = getApiClient().selectHeaderContentType(contentTypes);

        final String[] authNames = new String[] { "organizationKey", "userLoginName" };

        final ParameterizedTypeReference<UploadSspFileResult> returnType = new ParameterizedTypeReference<UploadSspFileResult>() {
        };
        return getApiClient().invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams,
                formParams, localVarAccept, contentType, authNames, returnType);
    }
}
