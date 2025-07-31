package p4_relasjoner.avsluttende_v4;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GarageTest {

    private Garage garage;
    private Car car;
    private Motorcycle motorcycle;
    private Truck truck;

    @BeforeEach
    void setUp() {
        garage = new Garage(3);
        car = new Car("EL67890", 4);
        motorcycle = new Motorcycle("MC54321", 750);
        truck = new Truck("TR98765", 5000.0);
    }

    @Test
    void testAddVehicle() {
        assertTrue(garage.addVehicle(car));
        assertTrue(garage.addVehicle(motorcycle));
        assertEquals(2, garage.getVehicles().size());
    }

    @Test
    void testAddVehicleToFullGarage() {
        garage.addVehicle(car);
        garage.addVehicle(motorcycle);
        garage.addVehicle(truck);
        assertFalse(garage.addVehicle(new Car("FULL123", 2)));
    }

    @Test
    void testRemoveVehicle() {
        garage.addVehicle(car);
        garage.addVehicle(motorcycle);
        Vehicle removed = garage.removeVehicle("EL67890");
        assertNotNull(removed);
        assertEquals("EL67890", removed.getRegistrationNumber());
        assertEquals(1, garage.getVehicles().size());
    }

    @Test
    void testRemoveNonExistentVehicle() {
        garage.addVehicle(car);
        assertNull(garage.removeVehicle("BOGUS"));
    }

    @Test
    void testFindVehicle() {
        garage.addVehicle(car);
        garage.addVehicle(motorcycle);
        Vehicle found = garage.findVehicle("MC54321");
        assertNotNull(found);
        assertTrue(found instanceof Motorcycle);
    }

    @Test
    void testFindNonExistentVehicle() {
        assertNull(garage.findVehicle("BOGUS"));
    }

    @Test
    void testGetVehicles() {
        garage.addVehicle(car);
        garage.addVehicle(truck);
        List<Vehicle> vehicles = garage.getVehicles();
        assertEquals(2, vehicles.size());
        assertTrue(vehicles.contains(car));
        assertTrue(vehicles.contains(truck));
    }

    @Test
    void testCalculateTotalCarbonFootprint() {
        garage.addVehicle(car); // 1500.0
        garage.addVehicle(motorcycle); // 800.0
        garage.addVehicle(truck); // 3000.0
        assertEquals(5300.0, garage.calculateTotalCarbonFootprint(), 0.01);
    }

    @Test
    void testToString() {
        garage.addVehicle(car);
        garage.addVehicle(motorcycle);
        String expectedCarStr = "Car{registrationNumber='EL67890', numDoors=4}";
        String expectedMotorcycleStr = "Motorcycle{registrationNumber='MC54321', engineDisplacement=750}";
        String garageStr = garage.toString();
        assertTrue(garageStr.contains(expectedCarStr));
        assertTrue(garageStr.contains(expectedMotorcycleStr));
    }
}
