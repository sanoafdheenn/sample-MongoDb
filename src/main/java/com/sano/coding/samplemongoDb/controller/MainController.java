package com.sano.coding.samplemongoDb.controller;

import com.sano.coding.samplemongoDb.document.Users;
import com.sano.coding.samplemongoDb.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Users> getList(){
        return userRepository.findAll();
    }
}
