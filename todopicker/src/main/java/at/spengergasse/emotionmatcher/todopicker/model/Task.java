package at.spengergasse.emotionmatcher.todopicker.model;

import com.sun.istack.Nullable;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

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
public class Task  implements Serializable
{
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMPORTANCE")
    private int importance;

    @Column(name = "DATETASK")
    private String dateTask;

    @Column(name = "LOCATION")
    private String location;


}
