package at.spengergasse.emotionmatcher.todopicker.model;

import lombok.*;

import javax.persistence.*;
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
@Table(name = "task")
public class Task  implements Serializable
{
    @Id
    @GeneratedValue
    private long id;

    private String title;

    private String description;

    private int importance;

    private LocalDate date;

    private String location;


}
