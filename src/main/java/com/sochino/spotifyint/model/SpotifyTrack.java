package com.sochino.spotifyint.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SpotifyTrack {

    private String id;

    private String name;

    private String href;

    private String type;

    private String uri;

    private String popularity;

    @JsonProperty("disc_number")
    private Long discNumber;

    @JsonProperty("duration_ms")
    private Long durationMs;

    @JsonProperty("is_playable")
    private Boolean isPlayable;

    @JsonProperty("preview_url")
    private String previewUrl;

    @JsonProperty("track_number")
    private Long trackNumber;

    @JsonProperty("is_local")
    private Boolean isLocal;

    private SpotifyAlbum album;
}
