package at.spengergasse.emotionmatcher.todopicker.feign;

import at.spengergasse.emotionmatcher.todopicker.model.User;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//@FeignClient(name="user", configuration = UserFeignConfiguration.class)
public interface UserFeignClient {

    /*
    @RequestMapping(method = RequestMethod.GET, value = "/all")
    List<User> findAll();

    @RequestLine("/{id}")
    User findById(@Param("id") long id);

   // @RequestMapping(method = RequestMethod.GET, value = "{id}")

    @RequestMapping(method = RequestMethod.POST, path = "create")
    @Headers("Content-Type: application/json")

    public User creatUser(@RequestBody User user);
    */
}
