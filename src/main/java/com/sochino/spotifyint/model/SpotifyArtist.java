package com.sochino.spotifyint.model;

import lombok.Data;

@Data
public class SpotifyArtist {

    private String id;

    private String href;

    private String name;

    private String type;

    private String uri;
}
