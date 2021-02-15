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

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import osplus.esignanywhere.v4.api.EnvelopeApi;
import osplus.esignanywhere.v4.api.SspFileApi;
import osplus.esignanywhere.v4.api.VersionApi;
import osplus.esignanywhere.v4.invoker.ApiClient;
import osplus.esignanywhere.v4.model.EnvelopeSendModel;
import osplus.esignanywhere.v4.model.EnvelopeStatus;
import osplus.esignanywhere.v4.model.FlowApiResult;
import osplus.esignanywhere.v4.model.SendEnvelopeResult;
import osplus.esignanywhere.v4.model.UploadSspFileResult;

/**
 * ESignAnywhereClient.
 */
public class ESignAnywhereClient {

    private final String basePath;
    private final Map<String, String> headers;

    /**
     * Builder
     */
    public static class Builder {

        private String basePath;
        private Map<String, String> headers = new HashMap<>();

        private Builder() {}

        public Builder setBasePath(final String basePath) {
            this.basePath = basePath;
            return this;
        }

        public Builder addHeader(final String header, final String value) {
            headers.put(header, value);
            return this;
        }

        public ESignAnywhereClient build() {
            final ESignAnywhereClient client = new ESignAnywhereClient(basePath, headers);
            return client;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private ESignAnywhereClient(final String basePath, final Map<String, String> headers) {
        this.basePath = basePath;
        this.headers = headers;
    }

    public EnvelopeStatus getEnvelopeStatus(final String envelopeId) throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeById(envelopeId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public SendEnvelopeResult sendEnvelope(final EnvelopeSendModel sendModel) throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeSend(sendModel);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public byte[] downloadCompletedDocument(final String documentId) throws ESignAnywhereClientException {
        try {
            return getEnvelopeApi().envelopeDownloadCompletedDocument(documentId);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public UploadSspFileResult uploadFile(final File file) throws ESignAnywhereClientException {
        try {
            return getSspFileApi().sspFileUploadTemporary(file);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public UploadSspFileResult uploadFile(final String filename, final byte[] content) throws ESignAnywhereClientException {
        try {
            return getSspFileApi().sspFileUploadTemporaryFromByteArray(filename, content);
        } catch (final RestClientException e) {
            throw new ESignAnywhereClientException(e.getMessage());
        }
    }

    public FlowApiResult getVersion() throws ESignAnywhereClientException {
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
                    } 
                    throw new ESignAnywhereClientException(httpStatus.value(), bodyToString(response.getBody()));
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

    private SspFileApi sspFileApi = null;

    private SspFileApi getSspFileApi() {
        if (sspFileApi == null) {
            sspFileApi = new SspFileApi(getApiClient()); 
        }
        return sspFileApi;
    }

    private EnvelopeApi envelopeApi = null;

    private EnvelopeApi getEnvelopeApi() {
        if (envelopeApi == null) {
            envelopeApi = new EnvelopeApi(getApiClient()); 
        }
        return envelopeApi;
    }
}
