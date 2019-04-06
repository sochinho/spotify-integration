package com.sochino.spotifyint.conf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriTemplateHandler;

import java.time.Duration;

@EnableOAuth2Client
@Configuration
public class SpotifyConfiguration {

    @Value("${spotify.service.spotifyBaseUrl}")
    private String baseUrl;

    @Value("${spotify.service.connectionTimeout}")
    private Long connectionTimeout;

    @Value("${spotify.service.readTimeout}")
    private Long readTimeout;

    @Value("${spotify.service.clientId}")
    private String clientId;

    @Value("${spotify.service.clientSecret}")
    private String clientSecret;

    @Value("${spotify.service.grantTYpe}")
    private String grantType;

    @Value("${spotify.service.accessTokenUri}")
    private String accessTokenUri;

    @Bean
    public RestTemplate spotifyRestTemplate(RestTemplateBuilder builder) {
        DefaultUriTemplateHandler spotifyUriTemplateHandler = new DefaultUriTemplateHandler();
        spotifyUriTemplateHandler.setBaseUrl(baseUrl);
        return builder
                .uriTemplateHandler(spotifyUriTemplateHandler)
                .setConnectTimeout(Duration.ofMillis(connectionTimeout))
                .setReadTimeout(Duration.ofMillis(readTimeout))
                .basicAuthentication(clientId, clientSecret).build();
    }

    @Bean
    @Qualifier("spotifyOAuth2RestTemplate")
    public OAuth2RestTemplate spotifyOAuth2RestTemplate() {
        ClientCredentialsResourceDetails resourceDetails = new ClientCredentialsResourceDetails();
        resourceDetails.setGrantType(grantType);
        resourceDetails.setAccessTokenUri(accessTokenUri);
        resourceDetails.setClientId(clientId);
        resourceDetails.setClientSecret(clientSecret);
        OAuth2RestTemplate oAuth2RestTemplate = new OAuth2RestTemplate(resourceDetails);
        oAuth2RestTemplate.getAccessToken();
        return oAuth2RestTemplate;
    }
}
