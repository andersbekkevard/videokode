package p3_mer_om_java.s3_testing.battery;

import java.util.Random;

public class BatteryProgram {

	private Battery battery;
	private Random r;

	private void part1() {
		this.battery = new Battery();
		this.r = new Random(246810121L);
		this.battery.upgradeBattery(3000.0); // 3000 mAh capacity
		this.battery.chargeBattery(1500.0); // Charge to 1500 mAh
		this.battery.drainBattery(Math.floor(this.r.nextDouble() * 1500.0));
		this.battery.chargeBattery(2200.0); // Try to charge more
		this.battery.drainBattery(Math.ceil(this.r.nextDouble() * 2800.0));
		this.battery.drainBattery(Math.ceil(this.r.nextDouble() * 3500.0)); // This might cause issues
		this.battery.upgradeBattery(1000.0);
		this.battery.drainBattery(2500.0); // Drain a lot
		this.battery.drainBattery(Math.ceil(this.r.nextDouble() * 3500.0));
		this.battery.drainBattery(Math.floor(this.r.nextDouble() * 1500.0));
		this.battery.chargeBattery(2200.0);
		this.battery.drainBattery(Math.ceil(this.r.nextDouble() * 2800.0));
		this.battery.drainBattery(Math.ceil(this.r.nextDouble() * 3500.0));
		this.battery.upgradeBattery(1000.0);
	}

	private void part2() {
		this.battery = new Battery(3000.0, 1500.0); // 3000 mAh capacity, 1500 mAh current
		this.r = new Random(135792468L);
		this.battery.drainBattery(Math.floor(this.r.nextDouble() * 1500.0));
		this.battery.chargeBattery(Math.floor(this.r.nextDouble() * 2000.0));
		this.battery.drainBattery(Math.ceil(this.r.nextDouble() * 2800.0));
		this.battery.drainBattery(Math.ceil(this.r.nextDouble() * 3500.0));
		this.battery.upgradeBattery(Math.floor(this.r.nextDouble() * 2000.0));
		this.battery.chargeBattery(Math.ceil(this.r.nextDouble() * 4000.0)); // This will likely cause overcharge
		this.battery.drainBattery(Math.ceil(this.r.nextDouble() * 3500.0));
		this.battery.upgradeBattery(Math.floor(this.r.nextDouble() * 2500.0));
		this.battery.chargeBattery(Math.floor(this.r.nextDouble() * 2000.0));
		this.battery.upgradeBattery(Math.floor(this.r.nextDouble() * 2000.0));
	}

	public static void main(String[] args) {
		BatteryProgram program = new BatteryProgram();
		program.part1();
		program.part2();
	}
}