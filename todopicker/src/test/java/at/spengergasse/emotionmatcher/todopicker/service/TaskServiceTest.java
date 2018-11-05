package at.spengergasse.emotionmatcher.todopicker.service;

import at.spengergasse.emotionmatcher.todopicker.model.Task;
import at.spengergasse.emotionmatcher.todopicker.repository.TaskRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskServiceTest {

    @Autowired
    public TaskService taskService;

    @Test
    public void createTaskAndFINDTest()
    {
        Task task = Task.builder().date(LocalDate.now()).description("This jut a test task")
                .importance(1).location("Austria")
                .title("Task Test with a User")
                .build();

        Assertions.assertNotNull(task);
        Assertions.assertNotNull(task.getId());

        Task task2= taskService.createTask(task);

        Assert.assertEquals(task2.getId(),taskService.findbyId(task.getId()));
    }


    @Test
    public void deleteTask()
    {
        Task task = Task.builder().date(LocalDate.now()).description("This jut a test task")
                .importance(1).location("Austria")
                .title("Task Test with a User")
                .build();

        Assertions.assertNotNull(task);
        Assertions.assertNotNull(task.getId());

        Task task2= taskService.createTask(task);

        taskService.deletebyId(task.getId());

        org.assertj.core.api.Assertions.assertThat(taskService.findbyId(task.getId())).isEmpty();
    }



}
