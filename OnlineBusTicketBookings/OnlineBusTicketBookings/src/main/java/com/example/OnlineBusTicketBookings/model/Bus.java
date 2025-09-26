package com.example.OnlineBusTicketBookings.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Bus {
    @Id
    private String busNumber;
    private String busRoute;

}
