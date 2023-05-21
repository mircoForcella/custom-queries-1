package co.develhope.customqueries1.controllers;

import co.develhope.customqueries1.entities.Flight;
import co.develhope.customqueries1.entities.FlightStatus;
import co.develhope.customqueries1.repositories.FlightRepository;
import co.develhope.customqueries1.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    @PostMapping
    public List<Flight> createFlights(){
        return flightService.createFlights(50);
    }
}