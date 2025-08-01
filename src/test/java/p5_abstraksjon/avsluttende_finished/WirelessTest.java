package p5_abstraksjon.avsluttende_finished;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WirelessTest {

    private Wireless wirelessDevice;

    @BeforeEach
    void setUp() {
        // Use Headset as a concrete implementation of Wireless for testing
        wirelessDevice = new Headset("Test Wireless Device");
    }

    @Test
    void getBatteryLevelShouldReturnCurrentBatteryLevel() {
        assertEquals(0, wirelessDevice.getBatteryLevel());
    }

    @Test
    void chargeShouldIncreaseBatteryLevel() {
        wirelessDevice.charge(25);
        assertEquals(25, wirelessDevice.getBatteryLevel());
    }

    @Test
    void chargeShouldAccumulateBatteryLevel() {
        wirelessDevice.charge(30);
        wirelessDevice.charge(20);
        assertEquals(50, wirelessDevice.getBatteryLevel());
    }

    @Test
    void chargeShouldNotExceed100Percent() {
        wirelessDevice.charge(70);
        wirelessDevice.charge(50); // This should cap at 100%
        assertEquals(100, wirelessDevice.getBatteryLevel());
    }

    @Test
    void chargeShouldCapExactlyAt100Percent() {
        wirelessDevice.charge(60);
        wirelessDevice.charge(40); // Exactly 100%
        assertEquals(100, wirelessDevice.getBatteryLevel());
    }

    @Test
    void chargeShouldThrowExceptionForNegativePercentage() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            wirelessDevice.charge(-1);
        });
        assertEquals("Charge must be positive", exception.getMessage());
    }

    @Test
    void chargeShouldThrowExceptionForLargeNegativePercentage() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            wirelessDevice.charge(-50);
        });
        assertEquals("Charge must be positive", exception.getMessage());
    }

    @Test
    void chargeShouldAcceptZeroPercentage() {
        int initialBattery = wirelessDevice.getBatteryLevel();
        wirelessDevice.charge(0);
        assertEquals(initialBattery, wirelessDevice.getBatteryLevel());
    }

    @Test
    void chargeFromZeroToFullShouldWork() {
        assertEquals(0, wirelessDevice.getBatteryLevel());
        wirelessDevice.charge(100);
        assertEquals(100, wirelessDevice.getBatteryLevel());
    }

    @Test
    void multipleSmallChargesShouldAccumulate() {
        for (int i = 0; i < 10; i++) {
            wirelessDevice.charge(5);
        }
        assertEquals(50, wirelessDevice.getBatteryLevel());
    }

    @Test
    void chargeWithOverflowShouldCapAt100() {
        wirelessDevice.charge(80);
        assertEquals(80, wirelessDevice.getBatteryLevel());

        wirelessDevice.charge(30); // Would be 110%, should cap at 100%
        assertEquals(100, wirelessDevice.getBatteryLevel());
    }

    @Test
    void batteryLevelShouldNeverGoAbove100() {
        wirelessDevice.charge(100);
        assertEquals(100, wirelessDevice.getBatteryLevel());

        // Try to charge more when already at 100%
        wirelessDevice.charge(50);
        assertEquals(100, wirelessDevice.getBatteryLevel());
    }

    @Test
    void interfaceMethodsShouldBeAccessibleThroughInterface() {
        // Test that interface methods work when accessed through Wireless reference
        Wireless device = new Headset("Interface Test");

        assertEquals(0, device.getBatteryLevel());
        device.charge(45);
        assertEquals(45, device.getBatteryLevel());
    }

    @Test
    void wirelessInterfaceShouldSupportPolymorphism() {
        // Test that Wireless can be used polymorphically
        Wireless[] devices = {
                new Headset("Device1"),
                new Headset("Device2")
        };

        for (Wireless device : devices) {
            device.charge(25);
            assertEquals(25, device.getBatteryLevel());
        }
    }

    @Test
    void chargingBehaviorShouldBeConsistent() {
        Wireless device1 = new Headset("Device1");
        Wireless device2 = new Headset("Device2");

        device1.charge(30);
        device2.charge(30);

        assertEquals(device1.getBatteryLevel(), device2.getBatteryLevel());

        device1.charge(20);
        device2.charge(20);

        assertEquals(device1.getBatteryLevel(), device2.getBatteryLevel());
    }
}