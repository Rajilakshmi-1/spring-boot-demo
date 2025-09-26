package com.example.OnlineBusTicketBookings.service;

import com.example.OnlineBusTicketBookings.model.Contact;

import java.util.List;

public interface ContactService {
    Contact saveMessage(Contact contactMessage);
    List<Contact> getAllMessages();
}
