package com.example.OnlineBusTicketBookings.controller;

import com.example.OnlineBusTicketBookings.model.User;
import com.example.OnlineBusTicketBookings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/OnlineBusTicketBookings/users")
public class UserController {
    @Autowired
    private UserService userService;
    //Register User
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user){
        try{
            User registeredUser=userService.register(user);
            return ResponseEntity.ok(registeredUser);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    //Login User
    @PostMapping("/login")
    public ResponseEntity<?>loginUser(@RequestBody User user){
        try{
            User loggedInUser=userService.login(user.getUsername(),user.getPassword());
            return ResponseEntity.ok(loggedInUser);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
