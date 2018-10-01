package at.spengergasse.emotionmatcher.todopicker.service;

import at.spengergasse.emotionmatcher.todopicker.model.User;
import at.spengergasse.emotionmatcher.todopicker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    public UserRepository userRepository;

    public Iterable<User> returnUser()
    {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id)
    {
        return userRepository.findById(id);
    }

    public User createUser(User user)
    {
        return userRepository.save(user);
    }

    public void deleteTask(User task)
    {
        userRepository.delete(task);
    }

    public void deletebyId(long id)
    {
        userRepository.deleteById(id);
    }

    public void deleteAll()
    {
        userRepository.deleteAll();
    }
}
