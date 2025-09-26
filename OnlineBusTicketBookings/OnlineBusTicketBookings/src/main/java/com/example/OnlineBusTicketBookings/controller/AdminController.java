package com.example.OnlineBusTicketBookings.controller;

import com.example.OnlineBusTicketBookings.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/OnlineBusTicketBookings/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password){
        boolean isValid=adminService.validateAdmin(username, password);
        if(isValid){
            return "Admin Login Successful!";
        }else{
            return "Invalid Credentials";
        }
    }
}
