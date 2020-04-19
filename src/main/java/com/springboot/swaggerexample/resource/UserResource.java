package com.springboot.swaggerexample.resource;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.swaggerexample.domain.User;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
@Api(value = "User Resource REST Endpoint", description = "Shows the user info")
public class UserResource {

    @GetMapping
    public List<User> getUsers() {

        return Arrays.asList(
                new User("Sumedh", 20000000L),
                new User("Pruthviraj", 30000000L)
        );
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName)
    {
        return new User(userName, 20000000L);
    }
    
}
