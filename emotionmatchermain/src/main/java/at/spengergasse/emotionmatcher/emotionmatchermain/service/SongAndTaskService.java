package at.spengergasse.emotionmatcher.emotionmatchermain.service;

import at.spengergasse.emotionmatcher.emotionmatchermain.model.SongAndTask;
import at.spengergasse.emotionmatcher.spotifysongpicker.feign.SongFeignClient;
import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import at.spengergasse.emotionmatcher.spotifysongpicker.service.SongService;
import at.spengergasse.emotionmatcher.todopicker.feign.TaskFeignClient;
import at.spengergasse.emotionmatcher.todopicker.model.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

//@RequiredArgsConstructor
@Service
//@Transactional
public class SongAndTaskService implements  SongFeignClient, TaskFeignClient {

//    @Autowired
//    private SongFeignClient songFeignClient;
//
//    @Autowired
//    private TaskFeignClient taskFeignClient;

    @Autowired
    private SongService songService;

    public Optional<SongAndTask> randomSongAndTaskByEmotionLevel(int emotionlevel){
        Song song =ramdomSong(emotionlevel).get();
        Task task =randomTask(emotionlevel).get();
        return Optional.of(new SongAndTask(song,task));
    }

    @Override
    public Optional<Song> ramdomSong(int emotionLevel) {
        songService.randomSongByEmotionLevel(emotionLevel);
        return Optional.of(null);
    }

    @Override
    public Iterable<Task> findAll() {
        return null;
    }

    @Override
    public Task findById(long id) {
        return null;
    }

    @Override
    public Task creaTask(Task task) {
        return null;
    }

    @Override
    public Optional<Task> randomTask(int importance) {
        return Optional.empty();
    }
}
