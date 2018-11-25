package at.spengergasse.emotionmatcher.emotionmatchermain.service;

import at.spengergasse.emotionmatcher.emotionmatchermain.model.SongAndTask;
import at.spengergasse.emotionmatcher.spotifysongpicker.feign.SongFeignClient;
import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import at.spengergasse.emotionmatcher.spotifysongpicker.service.SongService;
import at.spengergasse.emotionmatcher.todopicker.feign.TaskFeignClient;
import at.spengergasse.emotionmatcher.todopicker.model.Task;
import at.spengergasse.emotionmatcher.todopicker.service.TaskService;
import feign.Feign;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class SongAndTaskService {

    @Autowired
    private SongFeignClient songFeignClient;

    @Autowired
    private TaskFeignClient taskFeignClient;


    public Optional<SongAndTask> randomSongAndTaskByEmotionLevel(int emotionlevel) {
        Song song = songFeignClient.ramdomSong(emotionlevel).get();
        Task task = taskFeignClient.randomTask(emotionlevel).get();
        return Optional.of(new SongAndTask(song, task));
    }

}
