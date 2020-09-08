package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //given
        Country poland = new Country(new BigDecimal(2500000));
        Country sweeden = new Country(new BigDecimal(250000));
        Country germany = new Country(new BigDecimal(4500000));
        Country zambia = new Country(new BigDecimal(5500000));
        Country egypt = new Country(new BigDecimal(200000));
        Country china = new Country(new BigDecimal(25000000));
        Country japan = new Country(new BigDecimal(2500000));
        Country brasil = new Country(new BigDecimal(6300000));
        Country venezuela = new Country(new BigDecimal(3500000));
        Country usa = new Country(new BigDecimal(10000000));
        Country canada = new Country(new BigDecimal(200000));
        Country australia = new Country(new BigDecimal(500000));

        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent australiA = new Continent();
        Continent africa = new Continent();
        Continent northamerica = new Continent();
        Continent southamerica = new Continent();

        World earth = new World();

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(sweeden);
        africa.addCountry(zambia);
        africa.addCountry(egypt);
        asia.addCountry(china);
        asia.addCountry(japan);
        southamerica.addCountry(brasil);
        southamerica.addCountry(venezuela);
        northamerica.addCountry(usa);
        northamerica.addCountry(canada);
        australiA.addCountry(australia);
        earth.addContinent(europe);
        earth.addContinent(africa);
        earth.addContinent(asia);
        earth.addContinent(southamerica);
        earth.addContinent(northamerica);
        earth.addContinent(australiA);

        //When
        BigDecimal result = earth.getPeopleQuantity();
        //Then
        BigDecimal expected = new BigDecimal(60950000);
        Assert.assertEquals(expected, result);
    }
}
