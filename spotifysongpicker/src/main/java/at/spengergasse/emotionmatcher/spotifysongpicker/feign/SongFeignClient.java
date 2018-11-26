package at.spengergasse.emotionmatcher.spotifysongpicker.feign;

import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import com.fasterxml.jackson.annotation.JsonFormat;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@FeignClient(name = "songs", fallback = FallbackSong.class, url = "http://localhost:8081/songs")
@JsonFormat
public interface SongFeignClient {

    //@GetMapping(value = "/random/{emotionLevel}")
    @RequestMapping(method = RequestMethod.GET, path = "/random/{emotionLevel}", consumes = "application/json")
    @Headers("Content-Type: application/json")
    Optional<Song> ramdomSong(@PathVariable(value="emotionLevel") int emotionLevel);
}
