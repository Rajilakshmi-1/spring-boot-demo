package com.example.OnlineBusTicketBookings.service;

import com.example.OnlineBusTicketBookings.dao.UserRepository;
import com.example.OnlineBusTicketBookings.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    //register
    public User register(User user)throws Exception{
        if(userRepository.findByUsername(user.getUsername()).isPresent()){
            throw new Exception("Username already exists");
        }
        if(userRepository.findByEmail(user.getEmail()).isPresent()){
            throw new Exception("Email already exists");
        }
        return userRepository.save(user);
    }
    //login
    public User login(String username,String password)throws Exception{
        Optional<User> optionalUser=userRepository.findByUsername(username);
        if(optionalUser.isPresent()){
            User user=optionalUser.get();
            if (user.getPassword().equals(password)){
                return user;
            }else {
                throw new Exception("Invalid password");
            }
        }else {
            throw new Exception("User not found");
        }
    }
}
