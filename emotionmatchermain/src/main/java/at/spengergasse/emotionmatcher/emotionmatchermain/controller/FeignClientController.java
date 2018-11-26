package at.spengergasse.emotionmatcher.emotionmatchermain.controller;

import at.spengergasse.emotionmatcher.emotionmatchermain.model.SongAndTask;
import at.spengergasse.emotionmatcher.emotionmatchermain.service.SongAndTaskService;
import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@JsonFormat
@RequestMapping(path = "/emotion")
public class FeignClientController {

    @Autowired
    public SongAndTaskService songAndTaskService;

    @GetMapping(path = "/{emotionLevel}")
    public Optional<SongAndTask> pickSongAndTask(@PathVariable(name = "emotionLevel") int emotionlevel)
    {
        return songAndTaskService.randomSongAndTaskByEmotionLevel(emotionlevel);
        //  return songAndTaskService.ramdomSong(emotionlevel);
    }

}
