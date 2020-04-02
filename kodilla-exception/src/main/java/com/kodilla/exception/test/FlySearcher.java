package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlySearcher {

    void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports=new HashMap<>();
        airports.put("Balice",true);
        airports.put("Rębiechowo",true);
        airports.put("Chopina",true);
        airports.put("Modlin",true);
        airports.put("Pyrzowice",false);
        airports.put("Lawica",true);
        airports.put("Jesionka",true);
        if(airports.keySet().contains(flight.getArrivalAirport())&&airports.get(flight.arrivalAirport)) {
            System.out.println(flight.getArrivalAirport()+" is availible");
        }
        else {
            throw new RouteNotFoundException();
        }
    }
}





