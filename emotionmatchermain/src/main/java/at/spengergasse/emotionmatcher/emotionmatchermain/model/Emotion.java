package at.spengergasse.emotionmatcher.emotionmatchermain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Optional;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
@Setter
@Builder
@Entity
public class Emotion implements Serializable
{
    @Id
    @Getter
    public long id;

    @Getter
    public int emotionlevel;


}
