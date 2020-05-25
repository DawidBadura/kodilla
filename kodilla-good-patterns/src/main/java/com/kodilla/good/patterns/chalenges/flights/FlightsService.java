package com.kodilla.good.patterns.chalenges.flights;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsService {
    private List<Flight> flightList=new LinkedList<>();
    public void add(Flight flight){
        flightList.add(flight);
    }

    List<Flight>flyFromCIty(String depCity) {
        return flightList.stream().filter(flight -> flight.getDeparture().equals(depCity)).collect(Collectors.toList());
    }

    List<Flight>flyToCity(String arrCity) {
        return flightList.stream().filter(flight -> flight.getArrival().equals(arrCity)).collect(Collectors.toList());
    }


    List<Flight>flySearcher(String depCity, String arrCity){
        List<Flight>flightsFrom= flyFromCIty(depCity);
        List<Flight>flightsTo= flyToCity(arrCity);
        List<Flight>result= flightList.stream()
                .filter(flight -> flight.getArrival().equals(arrCity)&&flight.getDeparture().equals(depCity))
                .collect(Collectors.toList());


        for (int i=0; i<flightsFrom.size(); i++){
            for(int j=0;j<flightsTo.size();j++){
                if(flightsFrom.get(i).getArrival().equals(flightsTo.get(j).getDeparture())&&flightsFrom.get(i).getArrivalTime().plusMinutes(30).isBefore(flightsTo.get(j).getDepartureTime())){
                    result.add(flightsFrom.get(i));
                    result.add(flightsTo.get(j));
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "FlightsService{" +
                "flightList=" + flightList +
                '}';
    }
}
