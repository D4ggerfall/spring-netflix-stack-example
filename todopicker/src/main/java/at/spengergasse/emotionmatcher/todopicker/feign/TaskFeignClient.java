package at.spengergasse.emotionmatcher.todopicker.feign;

import at.spengergasse.emotionmatcher.todopicker.model.Task;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient(name="task", configuration = FeignConfiguration.class, fallback = FallbackTask.class) //,url="http://localhost:8082/task/all"
public interface TaskFeignClient {


    @RequestMapping(method = RequestMethod.GET, value = "/all")
    Iterable<Task> findAll();

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Task findById(@Param("id") long id);

   // @RequestMapping(method = RequestMethod.GET, value = "{id}")

    @RequestMapping(method = RequestMethod.POST, path = "create")
    @Headers("Content-Type: application/json")
    public Task creaTask(@RequestBody Task task);

    @GetMapping(path = "/random/{importance}")
    Optional<Task> randomTask(@PathVariable (name = "importance") int importance);
}
