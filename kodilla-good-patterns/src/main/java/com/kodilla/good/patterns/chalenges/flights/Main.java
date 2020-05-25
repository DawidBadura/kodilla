package com.kodilla.good.patterns.chalenges.flights;

public class Main {
    public static void main(String[] args) {
        FlightsService flightsService= new FlightsService();
        flightsService.add(new Flight("Moskwa","Kraków",2020, 12,2, 13, 20, 120));
        flightsService.add(new Flight("Kraków","Londyn",2020, 12,2, 16, 20, 120));
        flightsService.add(new Flight("Moskwa","Pekin",2020, 12,2, 13, 20, 120));
        flightsService.add(new Flight("Londyn","Warszawa",2020, 12,2, 13, 20, 120));
        flightsService.add(new Flight("Oslo","Moskwa",2020, 12,2, 13, 20, 120));
        flightsService.add(new Flight("Moskwa","Londyn",2020, 12,2, 13, 20, 120));
        flightsService.add(new Flight("Tokyo","Londyn",2020, 12,2, 16, 20, 120));
        flightsService.add(new Flight("Moskwa","Tokyo",2020, 12,2, 13, 20, 120));



        System.out.println(flightsService.flySearcher("Moskwa","Londyn"));
        System.out.println(flightsService.flySearcher("Moskwa","Londyn", "Kraków"));




    }
}
