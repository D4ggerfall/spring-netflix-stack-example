package at.spengergasse.emotionmatcher.todopicker.model;


import org.junit.Assert;
import org.junit.Test;

public class UserTest
{
    @Test
    public void userbuildTest()
    {
        User user = User.builder().build();

        Assert.assertNotNull(user.getId());
    }
}
