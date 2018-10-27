package at.spengergasse.emotionmatcher.todopicker.controller;


import at.spengergasse.emotionmatcher.todopicker.model.User;
import at.spengergasse.emotionmatcher.todopicker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    public UserService userService;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> findAll()
    {
        return userService.returnUser();
    }

    @GetMapping(path="/{id}")
    public @ResponseBody
    Optional<User> findById(@PathVariable(name = "id") long id)
    {
        return userService.findById(id);
    }

    @PostMapping(path = "/create")
    public User creatUser(User user)
    {
        return userService.createUser(user);
    }


    @DeleteMapping(path="/deleteId/{id}")
    public void deletebyIdOUser(@PathVariable(name = "id")long id)
    {
        userService.deletebyId(id);
    }
}
