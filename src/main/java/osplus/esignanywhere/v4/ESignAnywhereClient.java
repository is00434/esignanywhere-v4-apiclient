package osplus.esignanywhere.v4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import osplus.esignanywhere.v4.api.AuthorizationApi;
import osplus.esignanywhere.v4.api.LicenseApi;
import osplus.esignanywhere.v4.api.RecipientApi;
import osplus.esignanywhere.v4.api.TeamApi;
import osplus.esignanywhere.v4.api.UserApi;
import osplus.esignanywhere.v4.api.VersionApi;
import osplus.esignanywhere.v4.invoker.ApiClient;
import osplus.esignanywhere.v4.model.CopyDocumentFromTemplateResult;
import osplus.esignanywhere.v4.model.CreateDraftResult;
import osplus.esignanywhere.v4.model.CreateUserResult;
import osplus.esignanywhere.v4.model.DeleteUserReassignDescriptor;
import osplus.esignanywhere.v4.model.DraftCreateFromTemplateModel;
import osplus.esignanywhere.v4.model.DraftCreateModel;
import osplus.esignanywhere.v4.model.EnvelopePrepareModel;
import osplus.esignanywhere.v4.model.EnvelopeSendFromTemplateModel;
import osplus.esignanywhere.v4.model.EnvelopeSendModel;
import osplus.esignanywhere.v4.model.EnvelopeStatus;
import osplus.esignanywhere.v4.model.ExtendedFindEnvelopesResult;
import osplus.esignanywhere.v4.model.ExtendedFindUsersResult;
import osplus.esignanywhere.v4.model.ExtendedFindUsersResultEntry;
import osplus.esignanywhere.v4.model.FindEnvelopesDescriptor;
import osplus.esignanywhere.v4.model.FindUsersDescriptor;
import osplus.esignanywhere.v4.model.FlowApiResult;
import osplus.esignanywhere.v4.model.LicenseInformation;
import osplus.esignanywhere.v4.model.PrepareSendEnvelopeStepsResult;
import osplus.esignanywhere.v4.model.ReplaceRecipientData;
import osplus.esignanywhere.v4.model.SendEnvelopeResult;
import osplus.esignanywhere.v4.model.SendRemindersResult;
import osplus.esignanywhere.v4.model.Teams;
import osplus.esignanywhere.v4.model.UploadSspFileResult;
import osplus.esignanywhere.v4.model.UserCreateModel;
import osplus.esignanywhere.v4.model.UserUpdateDescription;
import osplus.esignanywhere.v4.model.Error;

/**
 * ESignAnywhereClient.
 */
public class ESignAnywhereClient {

    private String basePath = null;
    private final Map<String, String> headers = new HashMap<>();

    /**
     * Builder
     */
    public static class Builder {

        private final ESignAnywhereClient client;

        private Builder() {
            client = new ESignAnywhereClient();
            setDspSessionId(UUID.randomUUID().toString());
        }

        public Builder setBasePath(final String basePath) {
            if (basePath == null || basePath.isEmpty()) {
                throw new IllegalArgumentException("Argument basePath is null or empty");
            }
            client.basePath = basePath;
            return this;
        }

        public Builder setUserLoginName(final String userLoginName) {
            addHeader("userLoginName", userLoginName);
            return this;
        }

        public Builder setOrganizationKey(final String organizationKey) {
            addHeader("organizationKey", organizationKey);
            return this;
        }

        public Builder setApiToken(final String apiToken) {
            addHeader("ApiToken", apiToken);
            return this;
        }

        public Builder setDspSessionId(final String dspSessionId) {
            addHeader("DSPSessionID", dspSessionId);
            return this;
        }

        public Builder addHeader(final String header, final String value) {
            if (header == null || header.isEmpty()) {
                throw new IllegalArgumentException("Argument header is null or empty");
            }
            if (value == null || value.isEmpty()) {
                client.headers.remove(header);
            } else {
                client.headers.put(header, value);
            }
            return this;
        }

        public ESignAnywhereClient build() {
            if (client.basePath == null) {
                throw new IllegalStateException("Base path not initialized");
            }
            return client;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private ESignAnywhereClient() {}

    public boolean validateAuthorization() {
        boolean validAuthorization = true;
        try {
            getAuthorizationApi().authorizationValidate();
        } catch (final RestClientException e) {
            validAuthorization = false;
        }
        return validAuthorization;
    }

    public void cancelEnvelope(final String envelopeId) 
            throws ESignAnywhereClientException {
        try {
            getEnvelopeApi().envelopeCancel(envelopeId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public CopyDocumentFromTemplateResult copyEnvelopeFromTempalte(final String templateId)
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeCopyFromTemplate(templateId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public CreateDraftResult createEnvelope(final DraftCreateModel draftCreateModel)
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeCreate(draftCreateModel);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public CreateDraftResult createEnvelopeFromTemplate(final DraftCreateFromTemplateModel createFromTemplateModel)
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeCreateFromTemplate(createFromTemplateModel);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public void deleteEnvelope(final String envelopeId) 
            throws ESignAnywhereClientException {
        try {
            getEnvelopeApi().envelopeDelete(envelopeId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public EnvelopeStatus queryEnvelopeStatus(final String envelopeId) 
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeById(envelopeId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public SendEnvelopeResult sendEnvelope(final EnvelopeSendModel sendModel) 
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeSend(sendModel);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public File downloadCompletedDocument(final String documentId) 
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeDownloadCompletedDocument(documentId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public byte[] downloadCompletedDocumentAsByteArray(final String documentId) 
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeDownloadCompletedDocumentAsByteArray(documentId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public File downloadPageImage(final String envelopeId, final String docRefNumber, final String pageNumber)
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeDownloadPageImage(envelopeId, docRefNumber, pageNumber);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public byte[] downloadPageImageAsByteArray(final String envelopeId, final String docRefNumber, final String pageNumber)
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeDownloadPageImageAsByteArray(envelopeId, docRefNumber, pageNumber);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public ExtendedFindEnvelopesResult findEnvelope(final FindEnvelopesDescriptor descriptor)
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeFind(descriptor);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public PrepareSendEnvelopeStepsResult prepareEnvelope(final EnvelopePrepareModel prepareModel)
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopePrepare(prepareModel);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public SendRemindersResult remindeEnvelope(final String envelopeId)
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeRemind(envelopeId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public void restartEnvelope(final String envelopeId, final int expirationInDays)
            throws ESignAnywhereClientException {
        try {
            getEnvelopeApi().envelopeRestart(envelopeId, expirationInDays);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public SendEnvelopeResult sendEnvelopeFromTemplate(final EnvelopeSendFromTemplateModel sendFromTemplateModel)
            throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeSendFromTemplate(sendFromTemplateModel);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public void unlockEnvelope(final String envelopeId)
            throws ESignAnywhereClientException {
        try {
            getEnvelopeApi().envelopeUnlock(envelopeId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public LicenseInformation getLicense(final String envelopeId)
            throws ESignAnywhereClientException {
        try {
            return getLicenseApi().licenseGet();
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public void deleteRecipient(final String envelopeId, final String recipientId) 
            throws ESignAnywhereClientException {
        try {
            getRecipientApi().recipientDeleteRecipient(envelopeId, recipientId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }    
    }    

    public void replaceRecipient(final String envelopeId, final String recipientId, final ReplaceRecipientData recipient)
            throws ESignAnywhereClientException {
        try {
            getRecipientApi().recipientReplace(envelopeId, recipientId, recipient);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }            
    }

    public UploadSspFileResult uploadFile(final File file) 
            throws ESignAnywhereClientException {
        try {
            return getSspFileApi().sspFileUploadTemporary(file);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public UploadSspFileResult uploadFile(final String filename, final byte[] content) 
            throws ESignAnywhereClientException {
        try {
            return getSspFileApi().sspFileUploadTemporaryFromByteArray(filename, content);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public void disposeFile(final String sspFileId) 
            throws ESignAnywhereClientException {
        try {
            getSspFileApi().sspFileDisposeFile(sspFileId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public Teams getTeams() 
            throws ESignAnywhereClientException {
        try {
            return getTeamApi().teamGet();
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public void setTeams(final Teams teams) 
            throws ESignAnywhereClientException {
        try {
            getTeamApi().teamSet(teams);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public CreateUserResult createUser(final UserCreateModel model)
            throws ESignAnywhereClientException {
        try {
            return getUserApi().userCreate(model);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }
    
    public void deleteUser(final String userId, final DeleteUserReassignDescriptor reassignDescriptor)
            throws ESignAnywhereClientException {
        try {
            getUserApi().userDelete(userId, reassignDescriptor);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public ExtendedFindUsersResult findUser(final FindUsersDescriptor findUsersDescriptor) 
            throws ESignAnywhereClientException {
        try {
            return getUserApi().userFindV2(findUsersDescriptor);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }
    
    public ExtendedFindUsersResultEntry getUserByEmail(final String email) 
            throws ESignAnywhereClientException {
        try {
            return getUserApi().userGetUserByEmail(email);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public void updateUser(final String userId, final UserUpdateDescription userUpdateDescription)
            throws ESignAnywhereClientException {
        try {
            getUserApi().userUpdateWithHttpInfo(userId, userUpdateDescription);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }
    
    public void uploadSignatureImage(final String userId, final File file)
            throws ESignAnywhereClientException {
        try {
            getUserApi().userUploadSignatureImage(userId, file);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public FlowApiResult getVersion() 
            throws ESignAnywhereClientException {
        try {
            return getVersionApi().versionGet();
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    /**
     * ResponseInterceptingApiClient
     */
    private static class ResponseInterceptingApiClient extends ApiClient implements ClientHttpRequestInterceptor {

        @Override
        protected RestTemplate buildRestTemplate() {
            final RestTemplate restTemplate = super.buildRestTemplate();
            List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
            if (interceptors == null) {
                interceptors = new ArrayList<>();
            }
            interceptors.add(this);
            restTemplate.setInterceptors(interceptors);
            return restTemplate;
        }

		@Override
		public ClientHttpResponse intercept(final HttpRequest request, final byte[] body, final ClientHttpRequestExecution execution)
				throws IOException {
			final ClientHttpResponse response = execution.execute(request, body);
            throwIfNot2xxSuccessful(response);
			return response;
		}

        private void throwIfNot2xxSuccessful(final ClientHttpResponse response) throws ESignAnywhereClientException {
            try {
                final HttpStatus httpStatus = HttpStatus.valueOf(response.getRawStatusCode());
                if (!httpStatus.is2xxSuccessful()) {
                    if (httpStatus == HttpStatus.UNAUTHORIZED) {
                        throw new ESignAnywhereClientException(httpStatus.value(), httpStatus.getReasonPhrase());
                    } else {
                        final String body = bodyToString(response.getBody());
                        if (httpStatus == HttpStatus.BAD_REQUEST) {
                            final ObjectMapper mapper = new ObjectMapper();
                            final Error error = mapper.readValue(body, Error.class);
                            throw new ESignAnywhereClientException(httpStatus.value(), error); 
                        } 
                        throw new ESignAnywhereClientException(httpStatus.value(), body);
                    }
                }
            } catch (final IOException e) {
                throw new ESignAnywhereClientException("Failed to evaluate response", e);
            }
        }    

        private String bodyToString(final InputStream body) throws IOException {
            final StringBuilder builder = new StringBuilder();
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(body, StandardCharsets.UTF_8));
            String line = bufferedReader.readLine();
            while (line != null) {
                builder.append(line).append(System.lineSeparator());
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            return builder.toString();
        }    
    }

    private ApiClient apiClient = null;

    private ApiClient getApiClient() {
        if (apiClient == null) {
            apiClient = new ResponseInterceptingApiClient();
            apiClient.setBasePath(basePath);
            headers.forEach(apiClient::addDefaultHeader);
        }
        return apiClient;
    }

    private VersionApi versionApi = null;

    private VersionApi getVersionApi() {
        if (versionApi == null) {
            versionApi = new VersionApi(getApiClient()); 
        }
        return versionApi;
    }

    private SspFileApi2 sspFileApi = null;

    private SspFileApi2 getSspFileApi() {
        if (sspFileApi == null) {
            sspFileApi = new SspFileApi2(getApiClient()); 
        }
        return sspFileApi;
    }

    private EnvelopeApi2 envelopeApi = null;

    private EnvelopeApi2 getEnvelopeApi() {
        if (envelopeApi == null) {
            envelopeApi = new EnvelopeApi2(getApiClient()); 
        }
        return envelopeApi;
    }

    private AuthorizationApi authorizationApi = null;

    private AuthorizationApi getAuthorizationApi() {
        if (authorizationApi == null) {
            authorizationApi = new AuthorizationApi(getApiClient()); 
        }
        return authorizationApi;
    }

    private LicenseApi licenseApi = null;

    private LicenseApi getLicenseApi() {
        if (licenseApi == null) {
            licenseApi = new LicenseApi(getApiClient()); 
        }
        return licenseApi;
    }

    private RecipientApi recipientApi = null;

    private RecipientApi getRecipientApi() {
        if (recipientApi == null) {
            recipientApi = new RecipientApi(getApiClient()); 
        }
        return recipientApi;
    }

    private TeamApi teamApi = null;

    private TeamApi getTeamApi() {
        if (teamApi == null) {
            teamApi = new TeamApi(getApiClient()); 
        }
        return teamApi;
    }

    private UserApi userApi = null;

    private UserApi getUserApi() {
        if (userApi == null) {
            userApi = new UserApi(getApiClient()); 
        }
        return userApi;
    }
}
