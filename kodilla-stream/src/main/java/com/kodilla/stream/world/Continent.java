package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {
    public final List<Country> countries=new ArrayList<>();

    public List<Country> getCountries() {
        return countries;
    }

    void addCountry(Country country){
        countries.add(country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(countries, continent.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countries);
    }
}
