package at.spengergasse.emotionmatcher.emotionmatchermain.controller;

import at.spengergasse.emotionmatcher.emotionmatchermain.service.FeignClientService;
import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import at.spengergasse.emotionmatcher.todopicker.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/feign")
public class FeignClientController {

    @Autowired
    public FeignClientService feignClientService;

    @GetMapping(path = "/all")
    public @ResponseBody Optional<Song> findAll()
    {
        return feignClientService.getSongs();
    }
}
