package com.aiven.postgres.Tranko.Controller;

import com.aiven.postgres.Tranko.Entity.User;
import com.aiven.postgres.Tranko.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class UserController {
    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/add")
    public @ResponseBody User addnewUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        //return new ResponseEntity<>(user, HttpStatus.CREATED);
        return user;
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getallUsers() {
        return userRepository.findAll();
    }
    //if you want to contribute to this project there is an first issue
    //keystore error:
}
