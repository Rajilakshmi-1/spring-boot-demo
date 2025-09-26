package com.example.OnlineBusTicketBookings.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDto {
    @NotBlank(message ="Username is required")
    @Column(unique = true)
    private String username;
    @NotBlank(message ="Password is Required")
    private String password;
    @NotBlank(message ="Email is required")
    @Email(message ="Email should be valid")
    @Column(unique = true)
    private String email;

}
