package com.example.OnlineBusTicketBookings.dao;

import com.example.OnlineBusTicketBookings.model.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);

}
