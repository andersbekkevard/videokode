package p4_relasjoner.avsluttende_v4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TruckTest {

    @Test
    void testTruckCreation() {
        Truck truck = new Truck("TR98765", 5000.0);
        assertEquals("TR98765", truck.getRegistrationNumber());
        assertEquals(5000.0, truck.getCargoCapacity(), 0.01);
    }

    @Test
    void testCalculateCarbonFootprint() {
        Truck truck = new Truck("TR98765", 5000.0);
        assertEquals(3000.0, truck.calculateCarbonFootprint(), 0.01);
    }

    @Test
    void testToString() {
        Truck truck = new Truck("TR98765", 5000.0);
        assertEquals("Truck{registrationNumber='TR98765', cargoCapacity=5000.0}", truck.toString());
    }
}
