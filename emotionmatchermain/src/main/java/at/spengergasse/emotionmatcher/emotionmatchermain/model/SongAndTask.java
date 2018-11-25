package at.spengergasse.emotionmatcher.emotionmatchermain.model;

import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import at.spengergasse.emotionmatcher.todopicker.model.Task;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.Entity;


@AllArgsConstructor
@Data
@Builder
public class SongAndTask{

    @Autowired
    private Song song;

    @Autowired
    private Task task;
}
