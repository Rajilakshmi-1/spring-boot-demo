package com.example.OnlineBusTicketBookings.controller;

import com.example.OnlineBusTicketBookings.model.Bus;
import com.example.OnlineBusTicketBookings.service.BusService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/OnlineBusTicketBookings/bus")
public class BusController {
    private final BusService busService;
    public BusController(BusService busService){
        this.busService=busService;
    }
    @GetMapping("/search")
    public ResponseEntity<List<Bus>> searchBuses(@RequestParam String busNumber, @RequestParam String busRoute){
        List<Bus>buses=busService.searchBuses(busNumber,busRoute);
        return ResponseEntity.ok(buses);
    }
}
