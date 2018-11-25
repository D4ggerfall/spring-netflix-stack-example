package at.spengergasse.emotionmatcher.emotionmatchermain.controller;

import at.spengergasse.emotionmatcher.emotionmatchermain.model.SongAndTask;
import at.spengergasse.emotionmatcher.emotionmatchermain.service.SongAndTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/songandtask")
public class FeignClientController {

    @Autowired
    public SongAndTaskService songAndTaskService;

    @GetMapping(path = "/{emotion}")
    public Optional<SongAndTask> pickSongAndTask(@PathVariable(name = "emotion") int emotionlevel)
    {
        return songAndTaskService.randomSongAndTaskByEmotionLevel(emotionlevel);
        //  return songAndTaskService.ramdomSong(emotionlevel);
    }

    @GetMapping(path = "/test")
    public String aa()
    {
        return "GHallo";
    }
}
