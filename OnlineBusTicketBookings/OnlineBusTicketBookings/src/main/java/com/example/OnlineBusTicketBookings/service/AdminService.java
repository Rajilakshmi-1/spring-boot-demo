package com.example.OnlineBusTicketBookings.service;

import com.example.OnlineBusTicketBookings.dao.AdminRepository;
import com.example.OnlineBusTicketBookings.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public boolean validateAdmin(String username, String password) {
        Admin admin = adminRepository.findByUsername(username);
        if (admin != null && admin.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
