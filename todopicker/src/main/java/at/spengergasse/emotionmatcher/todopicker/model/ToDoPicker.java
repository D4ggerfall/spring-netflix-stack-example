package at.spengergasse.emotionmatcher.todopicker.model;

import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
@Builder
@Entity
public class ToDoPicker implements Serializable
{
    private Task task;

    private User user;

    private String[] customlist;


}
