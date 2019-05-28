
package com.sochino.spotifyint.model;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

@Data
public class SpotifyAnalysisSection {

    private Long confidence;
    private Double duration;
    private Long key;
    @JsonProperty("key_confidence")
    private Double keyConfidence;
    private Double loudness;
    private Long mode;
    @JsonProperty("mode_confidence")
    private Double modeConfidence;
    private Double start;
    private Double tempo;
    @JsonProperty("tempo_confidence")
    private Double tempoConfidence;
    @JsonProperty("time_signature")
    private Long timeSignature;
    @JsonProperty("time_signature_confidence")
    private Long timeSignatureConfidence;

}
