package at.spengergasse.emotionmatcher.todopicker.repository;


import at.spengergasse.emotionmatcher.todopicker.model.Task;
import org.junit.Test;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/*
@SpringBootTest
@ExtendWith(SpringExtension.class)
@DataJdbcTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskRepositoryTest {

    @Autowired
    public TaskRepository taskRepository;


    @Test
    public void addTaskTest() {

        Task task = Task.builder().date(LocalDate.now()).description("This is just a test task").importance(1).location("Austria").title("Task Test with a User").build();

        Task task2 = taskRepository.save(task);

        assertEquals(task, task2);
    }


    @Test
    public void deleteTaskTest() {

        Task task = Task.builder().date(LocalDate.now()).description("This is just a test task").importance(1).location("Austria").title("Task Test with a User").build();

        Task task2 = taskRepository.save(task);

        assertEquals(task, task2);

        taskRepository.delete(task);

        Assertions.assertThat(taskRepository.findById(task.getId())).isEmpty();


    }


    @Test
    public void findbyIdTest()
    {
        Task task = Task.builder().date(LocalDate.now()).description("This is just a test task").importance(1).location("Austria").title("Task Test with a User").build();

        Task task2 = taskRepository.save(task);

        assertNotNull(taskRepository.findById(task.getId()));
    }
}



