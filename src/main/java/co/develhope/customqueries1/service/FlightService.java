package co.develhope.customqueries1.service;

import co.develhope.customqueries1.entities.Flight;
import co.develhope.customqueries1.entities.FlightStatus;
import co.develhope.customqueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> createFlights(int count) {
        List<Flight> flights = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            Flight flight = new Flight();
            flight.setDescription("Flight " + (i + 1));
            flight.setFromAirport("Airport " + random.nextInt(100));
            flight.setToAirport("Airport " + random.nextInt(100));
            flight.setStatus(FlightStatus.ONTIME);

            flights.add(flight);
        }

        return flightRepository.saveAll(flights);
    }

}
