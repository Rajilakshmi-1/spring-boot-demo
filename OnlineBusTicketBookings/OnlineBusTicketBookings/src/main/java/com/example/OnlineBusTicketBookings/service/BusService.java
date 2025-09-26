package com.example.OnlineBusTicketBookings.service;

import com.example.OnlineBusTicketBookings.model.Bus;

import java.util.List;

public interface BusService {
    List<Bus> searchBuses(String busNumber, String BusRoute);
}
