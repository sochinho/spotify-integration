
package com.sochino.spotifyint.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

public class SpotifyAnalysisTrack {

    @JsonProperty("analysis_channels")
    private Long analysisChannels;
    @JsonProperty("analysis_sample_rate")
    private Long analysisSampleRate;
    @JsonProperty("code_version")
    private Double codeVersion;
    private String codestring;
    private Double duration;
    @JsonProperty("echoprint_version")
    private Double echoprintVersion;
    private String echoprintstring;
    @JsonProperty("end_of_fade_in")
    private Long endOfFadeIn;
    private Long key;
    @JsonProperty("key_confidence")
    private Double keyConfidence;
    private Double loudness;
    private Long mode;
    @JsonProperty("mode_confidence")
    private Double modeConfidence;
    @JsonProperty("offset_seconds")
    private Long offsetSeconds;
    @JsonProperty("rhythm_version")
    private Long rhythmVersion;
    private String rhythmstring;
    @JsonProperty("sample_md5")
    private String sampleMd5;
    @JsonProperty("start_of_fade_out")
    private Double startOfFadeOut;
    @JsonProperty("synch_version")
    private Long synchVersion;
    private String synchstring;
    private Double tempo;
    @JsonProperty("tempo_confidence")
    private Double tempoConfidence;
    @JsonProperty("time_signature")
    private Long timeSignature;
    @JsonProperty("time_signature_confidence")
    private Long timeSignatureConfidence;
    @JsonProperty("window_seconds")
    private Long windowSeconds;
}
