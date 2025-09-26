package com.example.OnlineBusTicketBookings.dao;

import com.example.OnlineBusTicketBookings.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
