package at.spengergasse.emotionmatcher.todopicker.service;

import at.spengergasse.emotionmatcher.todopicker.model.Task;
import at.spengergasse.emotionmatcher.todopicker.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService
{
    @Autowired
    private TaskRepository taskRepository;

    public Iterable<Task> returnTask()
    {
        return taskRepository.findAll();
    }

    public Optional<Task> findbyId(long id)
    {
        return taskRepository.findById(id);
    }

    public Task createTask(Task task)
    {
        return taskRepository.save(task);
    }

    public void deleteTask(Task task)
    {
        taskRepository.delete(task);
    }

    public void deletebyId(long id)
    {
        taskRepository.deleteById(id);
    }

    public void deleteAll()
    {
        taskRepository.deleteAll();
    }
}
