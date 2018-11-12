package at.spengergasse.emotionmatcher.todopicker.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
@Builder
@Entity
@Table(name = "User")
public class User  implements Serializable
{
    @Id
    @GeneratedValue
    private long id;

    private String firstname;

    private String lastname;

    private LocalDate birthday;

    private int guest;

 //   private ArrayList<Task> tasklist;

    /*
    Fragen bzg.Beziehung

    @Getter
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "takslist", referencedColumnName = "id")
    private Task task;
    */


}
