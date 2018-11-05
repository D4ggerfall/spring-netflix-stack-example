package at.spengergasse.emotionmatcher.spotifysongpicker.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Song implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ARTIST")
    private String artist;

    @Column(name = "SONGNAME")
    private String songName;

    //could be youtube, spotify, etc.
    @Column(name = "SONGLINK")
    private String songLink;

    //number from 1-3 where 3 is the happiest and 1 is the saddest
    @Column(name = "EMOTIONLEVEL")
    private int emotionLevel;
}
