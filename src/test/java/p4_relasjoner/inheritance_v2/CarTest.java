package p4_relasjoner.inheritance_v2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void testCarCreation() {
        Car car = new Car("EL67890", 4);
        assertEquals("EL67890", car.getRegistrationNumber());
        assertEquals(4, car.getNumDoors());
    }

    @Test
    void testCalculateCarbonFootprint() {
        Car car = new Car("EL67890", 4);
        assertEquals(1500.0, car.calculateCarbonFootprint(), 0.01);
    }

    @Test
    void testToString() {
        Car car = new Car("EL67890", 4);
        assertEquals("Car{registrationNumber='EL67890', numDoors=4}", car.toString());
    }
}
