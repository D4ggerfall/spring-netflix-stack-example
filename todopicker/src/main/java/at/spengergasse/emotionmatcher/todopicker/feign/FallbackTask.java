package at.spengergasse.emotionmatcher.todopicker.feign;

import at.spengergasse.emotionmatcher.todopicker.model.Task;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FallbackTask implements TaskFeignClient {
    @Override
    public Iterable<Task> findAll() {
        return null;
    }

    @Override
    public Task findById(long id) {
        return null;
    }

    @Override
    public Task creaTask(Task task) {
        return null;
    }
}
