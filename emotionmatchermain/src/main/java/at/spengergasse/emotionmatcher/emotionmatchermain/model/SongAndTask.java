package at.spengergasse.emotionmatcher.emotionmatchermain.model;

import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import at.spengergasse.emotionmatcher.todopicker.model.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;


@AllArgsConstructor
@Data
public class SongAndTask{

    @Autowired
    private Song song;

    @Autowired
    private Task task;
}
