package org.example;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;


public class TrainTest {

    private City city;
    private Train train;

    @Before
    public void prepare () {
        city = new City("City",1);
        train = new Train("1","Train", true, 1,1,1,1);
    }

    @Test
    public void shouldTransportIsNotNull () {
        assertNotNull(train);
    }
    @Test
    public void shouldCityInNotNull () {
        assertNotNull(city);
    }
    @Test
    public void shouldTransportBeEqualItsSet () {
        assertEquals("Train",train.getName());
        assertTrue(train.isExpress());
        assertEquals(1,train.getCapacity());
        assertEquals(1,train.getCarriageCount());
        assertEquals(1,train.getSpeed());
        assertEquals(1,train.getCostOfKm(),0);

    }
    @Test
    public void shouldCityBeEqualItsSet () {
        assertEquals("City",city.getName());
        assertFalse(city.isHasAirport());
        assertTrue(city.isOnWater());
        assertEquals(1, city.getDistanceKm());
    }
    @Test
    public void shouldCalculate (){
        assertEquals(1,train.getPrice(city),0);
    }
    @Test
    public void shouldRepair() {
        assertFalse(train.isRepairing());
        train.startRepair();
        assertTrue(train.isRepairing());
        train.finishRepair();
        assertFalse(train.isRepairing());
    }
    @Test @Ignore
    public void shouldNewVehicleBe() {
        Plane plane = new Plane("Plane",1,1,1);
        plane.printVehicleFetcher();

    }

}
