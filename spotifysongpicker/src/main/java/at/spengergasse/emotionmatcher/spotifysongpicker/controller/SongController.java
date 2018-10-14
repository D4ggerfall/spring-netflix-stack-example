package at.spengergasse.emotionmatcher.spotifysongpicker.controller;

import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import at.spengergasse.emotionmatcher.spotifysongpicker.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/songs")
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping("/random/{emotionLevel}")
    public Optional<Song> ramdomSong(@PathVariable(name="emotionLevel") int emotionLevel){
        return songService.randomSongByEmotionLevel(emotionLevel);
    }
}
