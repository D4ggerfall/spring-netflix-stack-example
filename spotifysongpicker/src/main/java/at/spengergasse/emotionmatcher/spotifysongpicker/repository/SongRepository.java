package at.spengergasse.emotionmatcher.spotifysongpicker.repository;

import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    public List<Song> findByEmotionLevel(int emotionLevel);
}
