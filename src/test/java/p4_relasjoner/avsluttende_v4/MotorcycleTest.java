package p4_relasjoner.avsluttende_v4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MotorcycleTest {

    @Test
    void testMotorcycleCreation() {
        Motorcycle motorcycle = new Motorcycle("MC54321", 750);
        assertEquals("MC54321", motorcycle.getRegistrationNumber());
        assertEquals(750, motorcycle.getEngineDisplacement());
    }

    @Test
    void testCalculateCarbonFootprint() {
        Motorcycle motorcycle = new Motorcycle("MC54321", 750);
        assertEquals(800.0, motorcycle.calculateCarbonFootprint(), 0.01);
    }

    @Test
    void testToString() {
        Motorcycle motorcycle = new Motorcycle("MC54321", 750);
        assertEquals("Motorcycle{registrationNumber='MC54321', engineDisplacement=750}", motorcycle.toString());
    }
}
