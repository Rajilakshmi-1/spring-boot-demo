package com.example.OnlineBusTicketBookings.service;

import com.example.OnlineBusTicketBookings.dao.ContactRepository;
import com.example.OnlineBusTicketBookings.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactServiceImplementation implements ContactService{
    private final ContactRepository repository;
    public ContactServiceImplementation(ContactRepository repository){
        this.repository=repository;
    }
    @Override
    public Contact saveMessage(Contact contactMessage){
        return repository.save(contactMessage);
    }
    @Override
    public List<Contact> getAllMessages(){
        return repository.findAll();
    }
}
