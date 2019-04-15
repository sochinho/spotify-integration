package com.sochino.spotifyint.web;

import com.devskiller.friendly_id.FriendlyId;
import com.sochino.spotifyint.exception.SpotifyServiceException;
import com.sochino.spotifyint.model.SpotifyTrack;
import com.sochino.spotifyint.service.SpotifyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/spotify")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SpotifyController {

    private final SpotifyService spotifyService;

    @GetMapping("/track")
    public ResponseEntity<SpotifyTrack> getRandomTrack() throws SpotifyServiceException {
        return ResponseEntity.ok(spotifyService.getTrack(FriendlyId.createFriendlyId()));
    }

    @GetMapping("/track/{trackId}")
    public ResponseEntity<SpotifyTrack> getSpotifyTrack(@PathVariable("trackId") String trackId) throws SpotifyServiceException {
        return ResponseEntity.ok(spotifyService.getTrack(trackId));
    }

}
