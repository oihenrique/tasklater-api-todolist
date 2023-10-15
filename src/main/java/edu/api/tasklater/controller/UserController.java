package edu.api.tasklater.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import edu.api.tasklater.dtos.UserDto;
import edu.api.tasklater.model.User;
import edu.api.tasklater.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @PostMapping()
    public void create(@RequestBody @Valid UserDto userDto) {
        String hashedPassword = BCrypt.withDefaults().hashToString(12, userDto.password().toCharArray());

        repository.save(new User(userDto, hashedPassword));
    }
}
