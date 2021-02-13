package osplus.esignanywhere.v4.api;

import java.util.Collections;
import java.util.List;

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
import osplus.esignanywhere.v4.model.Teams;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
@Component("osplus.esignanywhere.v4.api.TeamApi")
public class TeamApi {
    private ApiClient apiClient;

    public TeamApi() {
        this(new ApiClient());
    }

    @Autowired
    public TeamApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns the teams set for the organization of the api user.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @return Teams
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Teams teamGet() throws RestClientException {
        return teamGetWithHttpInfo().getBody();
    }

    /**
     * Returns the teams set for the organization of the api user.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @return ResponseEntity&lt;Teams&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Teams> teamGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/v4.0/team", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<Teams> returnType = new ParameterizedTypeReference<Teams>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Replaces all teams with the provided teams.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param teams A list of Teams. If empty, all teams get deleted. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void teamSet(Teams teams) throws RestClientException {
        teamSetWithHttpInfo(teams);
    }

    /**
     * Replaces all teams with the provided teams.
     * 
     * <p><b>204</b> - NoContent
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Unauthorized
     * @param teams A list of Teams. If empty, all teams get deleted. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> teamSetWithHttpInfo(Teams teams) throws RestClientException {
        Object postBody = teams;
        
        // verify the required parameter 'teams' is set
        if (teams == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teams' when calling teamSet");
        }
        
        String path = apiClient.expandPath("/v4.0/team", Collections.<String, Object>emptyMap());

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
