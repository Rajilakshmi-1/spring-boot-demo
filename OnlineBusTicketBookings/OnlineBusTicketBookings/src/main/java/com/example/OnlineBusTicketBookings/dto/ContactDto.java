package com.example.OnlineBusTicketBookings.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class ContactDto {
    @NotBlank(message ="name is required")
    private String name;
    @Email(message ="enter a valid email")
    private String email;
    @NotBlank(message = "message cannot be empty")
    @Column(length =1000)
    private String message;
}
