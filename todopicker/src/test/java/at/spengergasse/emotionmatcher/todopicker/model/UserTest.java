package at.spengergasse.emotionmatcher.todopicker.model;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserTest
{
    @Test
    public void userbuildTest()
    {
        User user = User.builder().build();

        Assert.assertNotNull(user.getId());
    }


    @Test
    public void userbuildwithDataTest()
    {
        User user = User.builder().firstname("Baum").guest(0).birthday(LocalDate.now()).lastname("Tanne").tasklist(null).build();

        Assert.assertNotNull(user.getId());
    }

    @Test
    public void userbuildwithTaskListinItDataTest()
    {
        ArrayList tasklist = new ArrayList();

        Task task = Task.builder().date(LocalDate.now()).description("This jut a test task").importance(1).location("Austria")
                .title("Task Test with a User").user(null).build();

        tasklist.add(task);

        User user = User.builder().firstname("Baum").guest(0).tasklist(tasklist).birthday(LocalDate.now()).lastname("Tanne").tasklist(null).build();

        Assert.assertNotNull(user.getId());
    }


}

