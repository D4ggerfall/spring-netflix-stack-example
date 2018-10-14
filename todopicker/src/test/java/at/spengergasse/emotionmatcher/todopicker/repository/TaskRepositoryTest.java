package at.spengergasse.emotionmatcher.todopicker.repository;

import at.spengergasse.emotionmatcher.todopicker.model.Task;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class TaskRepositoryTest {

    @Autowired
    public TaskRepository taskRepository;

    @Test
    public void addTaskTest()
    {

        Task task = Task.builder().date(LocalDate.now()).description("This jut a test task")
                .importance(1).location("Austria")
                .title("Task Test with a User").build();

        Task task2 =taskRepository.save(task);

        Assertions.assertEquals(task,task2);
    }
}
