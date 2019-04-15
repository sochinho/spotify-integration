package com.sochino.spotifyint.exception;

import lombok.Getter;

@Getter
public enum ErrorMessage {

    SPOTIFY_API_GET_TRACK_ERROR("SPOTIFY_API_GET_TRACK_ERROR");

    private String message;

    ErrorMessage(String msg) {
        this.message = msg;
    }
}
