package p3_mer_om_java.s3_testing.battery;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BatteryTest {

	private Battery battery;

	@BeforeEach
	public void setUp() {
		battery = new Battery(5000.0, 2500.0); // 5000 mAh capacity, 2500 mAh current
	}

	@Test
	public void testValidConstruction() {
		Battery testBattery = new Battery(1000.0, 500.0);
		assertEquals(1000.0, testBattery.getMaxCapacity());
		assertEquals(500.0, testBattery.getCurrentCharge());
	}

	@Test
	public void testDefaultConstruction() {
		Battery defaultBattery = new Battery();
		assertEquals(0.0, defaultBattery.getMaxCapacity());
		assertEquals(0.0, defaultBattery.getCurrentCharge());
	}

	@Test
	public void testValidCharging() {
		battery.chargeBattery(1000.0);
		assertEquals(3500.0, battery.getCurrentCharge());
	}

	@Test
	public void testValidDraining() {
		battery.drainBattery(1000.0);
		assertEquals(1500.0, battery.getCurrentCharge());
	}

	@Test
	public void testUpgradeBattery() {
		battery.upgradeBattery(2000.0);
		assertEquals(7000.0, battery.getMaxCapacity());
	}

	@Test
	public void testOverchargeThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			battery.chargeBattery(3000.0); // Would exceed capacity
		});
	}

	@Test
	public void testOverdrainThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			battery.drainBattery(3000.0); // Would drain more than available
		});
	}

	@Test
	public void testInvalidCapacityThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Battery(-100.0, 50.0);
		});
	}

	@Test
	public void testInvalidChargeThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Battery(1000.0, 1500.0); // Charge exceeds capacity
		});
	}
}