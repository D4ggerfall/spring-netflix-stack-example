package at.spengergasse.emotionmatcher.spotifysongpicker.feign;

import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@FeignClient
public interface SongFeignClient {

    @GetMapping("/random/{emotionLevel}")
    Optional<Song> ramdomSong(@PathVariable(name="emotionLevel") int emotionLevel);
}
