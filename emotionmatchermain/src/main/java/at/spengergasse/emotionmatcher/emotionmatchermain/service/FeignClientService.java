package at.spengergasse.emotionmatcher.emotionmatchermain.service;

import at.spengergasse.emotionmatcher.spotifysongpicker.feign.SongFeignClient;
import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import at.spengergasse.emotionmatcher.todopicker.feign.TaskFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
public class FeignClientService {
    private final SongFeignClient songFeignClient;

    private final TaskFeignClient feignClient;

    public Optional<Song> getSongs() {
        return songFeignClient.ramdomSong(1);
    }

}
