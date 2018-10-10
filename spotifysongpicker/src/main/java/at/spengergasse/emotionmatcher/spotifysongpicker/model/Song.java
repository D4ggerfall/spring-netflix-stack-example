package at.spengergasse.emotionmatcher.spotifysongpicker.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Song implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String artist;
    private String songName;

    //could be youtube, spotify, etc.
    private String songLink;
    //number from 1-5 where 5 is the happiest and 1 is the saddest
    private int emotionLevel;
}
