package at.spengergasse.emotionmatcher.todopicker.repository;

import at.spengergasse.emotionmatcher.todopicker.model.User;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.time.LocalDate;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    public UserRepository userRepository;
    // findid, findUSer , deleteUser, delteId, create

    @Test
    public void saveUser()
    {
        User user = User.builder().firstname("Baum").guest(0)
                .birthday(LocalDate.now())
                .lastname("Tanne").build();

        userRepository.save(user);

    //    Assert.assertEquals(user.getId(), userRepository.findById(user.getId()));

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
