package at.spengergasse.emotionmatcher.spotifysongpicker.feign;

import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FallbackSong implements SongFeignClient {
    @Override
    public Optional<Song> ramdomSong(int emotionLevel) {
        return Optional.empty();
    }
}
