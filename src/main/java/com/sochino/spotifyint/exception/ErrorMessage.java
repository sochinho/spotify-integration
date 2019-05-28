package com.sochino.spotifyint.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessage {

    SPOTIFY_API_GET_TRACK_ERROR("exception.spotify_api_get_track"),
    SPOTIFY_API_GET_TRACK_AUDIO_ANALYSIS_ERROR("exception.spotify_api_get_track_audio_analysis");

    private String message;
}
