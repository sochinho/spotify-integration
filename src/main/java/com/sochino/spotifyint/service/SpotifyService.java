package com.sochino.spotifyint.service;

import com.sochino.spotifyint.exception.ErrorMessage;
import com.sochino.spotifyint.exception.SpotifyServiceException;
import com.sochino.spotifyint.model.SpotifyTrack;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SpotifyService {

    private final String SPOTIFY_GET_TRACKS_URL = "https://api.spotify.com/v1/tracks/";

    @Qualifier("spotifyOAuth2RestTemplate")
    private final OAuth2RestTemplate spotifyOAuth2RestTemplate;

    public SpotifyTrack getTrack(String id) throws SpotifyServiceException {
        try {
            return spotifyOAuth2RestTemplate.getForObject(SPOTIFY_GET_TRACKS_URL + id, SpotifyTrack.class);
        } catch (final HttpClientErrorException e) {
            throw new SpotifyServiceException(ErrorMessage.SPOTIFY_API_GET_TRACK_ERROR);
        }
    }


}
