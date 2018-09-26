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
public class User
{
    @Id
    @GeneratedValue
    private long id;

    private String firstname;

    private String lastname;

    private LocalDate birthday;

    private int guest;


}
