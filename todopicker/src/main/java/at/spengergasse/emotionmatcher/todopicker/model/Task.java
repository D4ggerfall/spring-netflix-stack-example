package at.spengergasse.emotionmatcher.todopicker.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    @Id
    @GeneratedValue
    private long id;

    private String title;

    private String description;

    private int importance;

    private LocalDate date;

    private String location;

    private User user;
}
