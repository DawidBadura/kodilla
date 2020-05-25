package com.kodilla.good.patterns.chalenges.flights;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Flight {
    private String departure;
    private String arrival;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM HH:mm");

    public Flight(String departure, String arrival, int year,int month, int depDay,
                  int depHour, int depMin, int flightDuration) {
        this.departure = departure;
        this.arrival = arrival;
        this.departureTime=LocalDateTime.of(year, month, depDay, depHour, depMin);
        this.arrivalTime = this.departureTime.plusMinutes(flightDuration);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) &&
                Objects.equals(arrival, flight.arrival)&&
                Objects.equals(departureTime, flight.departureTime)&&
                Objects.equals(arrivalTime,flight.arrivalTime)
        ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival, departureTime, arrivalTime);
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public  LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public  LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "Flight  " +
                "departure: " + departure +
                ", arrival: " + arrival +
                " departure time: " + departureTime.format(formatter) +
                ", arrival time: " + arrivalTime.format(formatter) +
                "\n";
    }
}
