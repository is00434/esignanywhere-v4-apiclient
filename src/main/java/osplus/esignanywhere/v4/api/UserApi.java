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
import osplus.esignanywhere.v4.model.CreateUserResult;
import osplus.esignanywhere.v4.model.DeleteUserReassignDescriptor;
import osplus.esignanywhere.v4.model.ExtendedFindUsersResult;
import osplus.esignanywhere.v4.model.ExtendedFindUsersResultEntry;
import osplus.esignanywhere.v4.model.FindUsersDescriptor;
import osplus.esignanywhere.v4.model.UserCreateModel;
import osplus.esignanywhere.v4.model.UserUpdateDescription;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
@Component("osplus.esignanywhere.v4.api.UserApi")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates an user in the organization of the api user.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param model  (required)
     * @return CreateUserResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateUserResult userCreate(UserCreateModel model) throws RestClientException {
        return userCreateWithHttpInfo(model).getBody();
    }

    /**
     * Creates an user in the organization of the api user.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param model  (required)
     * @return ResponseEntity&lt;CreateUserResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateUserResult> userCreateWithHttpInfo(UserCreateModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling userCreate");
        }
        
        String path = apiClient.expandPath("/v4.0/user/create", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CreateUserResult> returnType = new ParameterizedTypeReference<CreateUserResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Deletes an user from the api user&#39;s organization.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param userId The id of the user who should be deleted. (required)
     * @param reassignDescriptor Information about the user and remaining envelopes handling. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void userDelete(String userId, DeleteUserReassignDescriptor reassignDescriptor) throws RestClientException {
        userDeleteWithHttpInfo(userId, reassignDescriptor);
    }

    /**
     * Deletes an user from the api user&#39;s organization.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param userId The id of the user who should be deleted. (required)
     * @param reassignDescriptor Information about the user and remaining envelopes handling. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> userDeleteWithHttpInfo(String userId, DeleteUserReassignDescriptor reassignDescriptor) throws RestClientException {
        Object postBody = reassignDescriptor;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling userDelete");
        }
        
        // verify the required parameter 'reassignDescriptor' is set
        if (reassignDescriptor == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reassignDescriptor' when calling userDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        String path = apiClient.expandPath("/v4.0/user/{userId}", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Finds users corresponding to the given user descriptor.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param findUsersDescriptor The descriptor for finding users (filter). (required)
     * @return ExtendedFindUsersResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExtendedFindUsersResult userFindV2(FindUsersDescriptor findUsersDescriptor) throws RestClientException {
        return userFindV2WithHttpInfo(findUsersDescriptor).getBody();
    }

    /**
     * Finds users corresponding to the given user descriptor.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param findUsersDescriptor The descriptor for finding users (filter). (required)
     * @return ResponseEntity&lt;ExtendedFindUsersResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExtendedFindUsersResult> userFindV2WithHttpInfo(FindUsersDescriptor findUsersDescriptor) throws RestClientException {
        Object postBody = findUsersDescriptor;
        
        // verify the required parameter 'findUsersDescriptor' is set
        if (findUsersDescriptor == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'findUsersDescriptor' when calling userFindV2");
        }
        
        String path = apiClient.expandPath("/v4.0/user/find", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ExtendedFindUsersResult> returnType = new ParameterizedTypeReference<ExtendedFindUsersResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get user by email.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param email Email to find user. (required)
     * @return ExtendedFindUsersResultEntry
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExtendedFindUsersResultEntry userGetUserByEmail(String email) throws RestClientException {
        return userGetUserByEmailWithHttpInfo(email).getBody();
    }

    /**
     * Get user by email.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param email Email to find user. (required)
     * @return ResponseEntity&lt;ExtendedFindUsersResultEntry&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExtendedFindUsersResultEntry> userGetUserByEmailWithHttpInfo(String email) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'email' when calling userGetUserByEmail");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email", email);
        String path = apiClient.expandPath("/v4.0/user/{email}", uriVariables);

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

        ParameterizedTypeReference<ExtendedFindUsersResultEntry> returnType = new ParameterizedTypeReference<ExtendedFindUsersResultEntry>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates settings of a particular user.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param userId The id of the user who should be updated. (required)
     * @param userUpdateDescription Information about the user to be updated (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void userUpdate(String userId, UserUpdateDescription userUpdateDescription) throws RestClientException {
        userUpdateWithHttpInfo(userId, userUpdateDescription);
    }

    /**
     * Updates settings of a particular user.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * @param userId The id of the user who should be updated. (required)
     * @param userUpdateDescription Information about the user to be updated (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> userUpdateWithHttpInfo(String userId, UserUpdateDescription userUpdateDescription) throws RestClientException {
        Object postBody = userUpdateDescription;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling userUpdate");
        }
        
        // verify the required parameter 'userUpdateDescription' is set
        if (userUpdateDescription == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userUpdateDescription' when calling userUpdate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        String path = apiClient.expandPath("/v4.0/user/{userId}", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Replaces the signature image.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * <p><b>415</b> - UnsupportedMediaType
     * @param userId The id of the user whos signature image should be replaced. (required)
     * @param file Upload software package (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void userUploadSignatureImage(String userId, File file) throws RestClientException {
        userUploadSignatureImageWithHttpInfo(userId, file);
    }

    /**
     * Replaces the signature image.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - NotFound
     * <p><b>415</b> - UnsupportedMediaType
     * @param userId The id of the user whos signature image should be replaced. (required)
     * @param file Upload software package (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> userUploadSignatureImageWithHttpInfo(String userId, File file) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling userUploadSignatureImage");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'file' when calling userUploadSignatureImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        String path = apiClient.expandPath("/v4.0/user/{userId}/uploadSignatureImage", uriVariables);

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
