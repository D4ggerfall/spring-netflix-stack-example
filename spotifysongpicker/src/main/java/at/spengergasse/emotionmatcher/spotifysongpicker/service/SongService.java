package at.spengergasse.emotionmatcher.spotifysongpicker.service;

import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import at.spengergasse.emotionmatcher.spotifysongpicker.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@Transactional
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<Song> all(){
        return songRepository.findAll();
    }

    public Optional<Song> randomSongByEmotionLevel(int emotionLevel){
        Random rnd = new Random();
        List<Song> songList = songRepository.findByEmotionLevel(emotionLevel);
        Optional<Song> result = Optional.of(songList.get(rnd.nextInt(songList.size())));
        return result;
    }

}
