package com.spring.busticket.bus.ticket.booking.controllers;

import com.spring.busticket.bus.ticket.booking.services.UserService;
import com.spring.busticket.bus.ticket.booking.sqlschema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody List<User> users)
    {
        return userService.addUser(users);
    }

    @GetMapping("/getUserList/{userId}")
    public Optional<User> getUserList(@PathVariable int userId){
        Optional<User> user = userService.getUserList(userId);
        if (user == null){
            throw new RuntimeException("User not found"+ userId);
        }
        else {
            return user;
        }

    }
    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable int userId){

        userService.deleteUser(userId);
        return "User " +userId +" deleted";
    }

}
