package com.example.OnlineBusTicketBookings.dao;

import com.example.OnlineBusTicketBookings.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusRepository extends JpaRepository<Bus,String> {
    List<Bus> findByBusNumberAndBusRoute(String busNumber, String busRoute);
}
