package com.sochino.spotifyint.model;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

@Data
public class SpotifyAlbum {

    private String href;

    private String id;

    private String name;

    @JsonProperty("released_date")
    private String releaseDate;

    @JsonProperty("released_date_precision")
    private String releaseDatePrecision;

    private String type;

    private String uri;

    @JsonProperty("album_group")
    private String albumGroup;

    @JsonProperty("album_type")
    private String albumType;

    private List<SpotifyArtist> artists;

    @JsonProperty("available_markets")
    private String availableMarkets;

}
