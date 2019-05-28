
package com.sochino.spotifyint.model;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

@Data
public class SpotifyAnalysisSegment {

    private Double confidence;
    private Double duration;
    @JsonProperty("loudness_end")
    private Long loudnessEnd;
    @JsonProperty("loudness_max")
    private Double loudnessMax;
    @JsonProperty("loudness_max_time")
    private Double loudnessMaxTime;
    @JsonProperty("loudness_start")
    private Double loudnessStart;
    private List<Double> pitches;
    private Double start;
    private List<Double> timbre;
}
