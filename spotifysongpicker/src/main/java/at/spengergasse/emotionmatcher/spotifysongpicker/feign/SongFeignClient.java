package at.spengergasse.emotionmatcher.spotifysongpicker.feign;

import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "songs", fallback = FallbackSong.class, url = "http://localhost:8081/songs")
public interface SongFeignClient {

    @GetMapping("/random/{emotionLevel}")
    Optional<Song> ramdomSong(@PathVariable(value="emotionLevel") int emotionLevel);
}
