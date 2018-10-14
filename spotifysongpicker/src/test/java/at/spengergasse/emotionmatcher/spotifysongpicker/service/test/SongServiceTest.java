package at.spengergasse.emotionmatcher.spotifysongpicker.service.test;

import at.spengergasse.emotionmatcher.spotifysongpicker.model.Song;
import at.spengergasse.emotionmatcher.spotifysongpicker.repository.SongRepository;
import at.spengergasse.emotionmatcher.spotifysongpicker.service.SongService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SongServiceTest {

    @Autowired
    private SongService songService;

    //Ensures that at least 2 different songs of emotionlevel category 1 (saddest) are picked
    @Test
    public void testRandomCat1SongPicks(){
        boolean differentSongsPicked = false;
        Song song1;
        Song song2;

        while (!differentSongsPicked){

            song1 = songService.randomSongByEmotionLevel(1).get();
            song2 = songService.randomSongByEmotionLevel(1).get();

            if(!song1.equals(song2)){
                differentSongsPicked = true;
            }
        }
        Assert.assertTrue(differentSongsPicked);
    }

}
