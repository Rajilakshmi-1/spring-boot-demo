package com.example.OnlineBusTicketBookings.service;

import com.example.OnlineBusTicketBookings.dao.BusRepository;
import com.example.OnlineBusTicketBookings.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusServiceImplementation implements BusService {
    @Autowired
    private BusRepository busRepository;

//    public BusServiceImplementation(BusRepository busRepository) {
//        this.busRepository = busRepository;
//    }

    @Override
    public List<Bus> searchBuses(String busNumber, String busRoute) {
        return busRepository.findByBusNumberAndBusRoute(busNumber, busRoute);
    }

}
