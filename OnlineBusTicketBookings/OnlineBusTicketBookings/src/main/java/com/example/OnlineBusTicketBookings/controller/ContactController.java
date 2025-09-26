package com.example.OnlineBusTicketBookings.controller;

import com.example.OnlineBusTicketBookings.model.Contact;
import com.example.OnlineBusTicketBookings.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/OnlineBusTicketBooking/contact")
    public class ContactController {
        private final ContactService services;
        public ContactController(ContactService services){
            this.services=services;
        }
        @PostMapping("/send")
        public ResponseEntity<Contact> sendMessage(@Valid @RequestBody Contact contactMessage){
            return ResponseEntity.ok(services.saveMessage(contactMessage));
        }
        @GetMapping("/messages")
        public ResponseEntity<List<Contact>>getAllMessages(){
            return ResponseEntity.ok(services.getAllMessages());
        }

    }
