package p5_abstraksjon.avsluttende;

public class Headset extends AudioDevice implements Wireless {

	private int batteryLevel;

	public Headset(String name) {
		super(name);
	}

	@Override
	public int getBatteryLevel() {
		return batteryLevel;
	}

	@Override
	public void charge(int percentage) {
		if (percentage < 0)
			throw new IllegalArgumentException("Charge must be positive");
		if (batteryLevel + percentage > 100)
			batteryLevel = 100;
		else
			batteryLevel += percentage;
	}

	@Override
	public int getMaxVolume() {
		return 10;
	}

	@Override
	public void playSound(String track) {
		System.out.println("Playing sound: " + track);
	}

}
