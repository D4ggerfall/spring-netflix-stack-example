package at.spengergasse.emotionmatcher.todopicker.controller;


import at.spengergasse.emotionmatcher.todopicker.model.Task;
import at.spengergasse.emotionmatcher.todopicker.model.User;
import at.spengergasse.emotionmatcher.todopicker.service.TaskService;
import at.spengergasse.emotionmatcher.todopicker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController
{
    @Autowired
    public TaskService taskService;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Task> findAll()
    {
        return taskService.returnTask();
    }

    @GetMapping(path="/{id}")
    public @ResponseBody
    Optional<Task> findById(@PathVariable(name = "id") long id)
    {
        return taskService.findbyId(id);
    }


    @PostMapping(path = "/create")
    public Task createTask(Task task)
    {
        return taskService.createTask(task);
    }


    @DeleteMapping(path="/deleteId/{id}")
    public void deletebyIdOTask(@PathVariable(name = "id")long id)
    {
        taskService.deletebyId(id);
    }

}
