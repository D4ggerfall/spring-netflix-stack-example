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
                .build();

        Assertions.assertNotNull(task);
        Assertions.assertNotNull(task.getId());
    }

}




