
package com.sochino.spotifyint.model;

import lombok.Data;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
public class SpotifyAudioAnalysis {

    private List<SpotifyAnalysisBar> bars;
    private List<SpotifyAnalysisBeat> beats;
    private List<SpotifyAnalysisSection> sections;
    private List<SpotifyAnalysisSegment> segments;
    private List<SpotifyAnalysisTatum> tatums;
    private SpotifyAnalysisTrack track;
}
