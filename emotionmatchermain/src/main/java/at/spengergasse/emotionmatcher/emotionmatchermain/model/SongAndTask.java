package at.spengergasse.emotionmatcher.emotionmatchermain.model;

import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import at.spengergasse.emotionmatcher.todopicker.model.Task;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SongAndTask {

    private Song song;
    private Task task;
}
