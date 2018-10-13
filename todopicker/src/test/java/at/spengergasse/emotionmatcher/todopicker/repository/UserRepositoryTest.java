package at.spengergasse.emotionmatcher.todopicker.repository;

import at.spengergasse.emotionmatcher.todopicker.model.Task;
import at.spengergasse.emotionmatcher.todopicker.model.User;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.ArrayList;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    @Autowired
    public UserRepository userRepository;
    // findid, findUSer , deleteUser, delteId, create

    @Test
    public void saveUser()
    {
        User user = User.builder().firstname("Baum").guest(0)
                .birthday(LocalDate.now())
                .lastname("Tanne")
                .tasklist(null).build();

        userRepository.save(user);

        Assert.assertEquals(user.getId(), userRepository.findById(user.getId()));

    }

    /*
    @Test
    public void userbuildwithTaskListinItDataTest()
    {
        ArrayList tasklist = new ArrayList();

        Task task = Task.builder().date(LocalDate.now()).description("This jut a test task").importance(1).location("Austria")
                .title("Task Test with a User").user(null).build();

        tasklist.add(task);


        Assert.assertNotNull(user.getId());
    }

    */
}
