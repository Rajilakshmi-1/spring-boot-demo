package com.example.OnlineBusTicketBookings.dao;

import com.example.OnlineBusTicketBookings.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,String> {
     Admin findByUsername(String username);
}
