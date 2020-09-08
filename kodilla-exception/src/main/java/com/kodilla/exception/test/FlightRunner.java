package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight = new Flight("Balice", "Pyrzowice");
        FlySearcher flySearcher = new FlySearcher();
        try {
            flySearcher.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("No route available");
        }
    }
}
