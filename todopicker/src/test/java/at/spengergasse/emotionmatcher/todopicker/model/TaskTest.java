package at.spengergasse.emotionmatcher.todopicker.model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class TaskTest {

    @Test
    public void buildTaskTest()
    {
        Task task = Task.builder().date(LocalDate.now()).description("This jut a test task")
                .importance(1).location("Austria")
                .title("Task Test with a User")
                .user(null).build();

        Assertions.assertNotNull(task);
        Assertions.assertNotNull(task.getId());
    }

    @Test
    public void buildTaskWithUsertest()
    {
        User user = User.builder().firstname("Baum").guest(0).birthday(LocalDate.now()).lastname("Tanne").tasklist(null).build();

        Task task = Task.builder().date(LocalDate.now()).description("This jut a test task")
                .importance(1).location("Austria")
                .title("Task Test with a User")
                .user(user).build();

        Assertions.assertNotNull(task);
        Assertions.assertNotNull(task.getUser());

    }
}




