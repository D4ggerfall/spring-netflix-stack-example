package at.spengergasse.emotionmatcher.todopicker.model;

import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
@Builder
@Entity
public class Task
{
    private String task;

    private int importance;

    private User user;

    private LocalDate date;

    private String location;
}
