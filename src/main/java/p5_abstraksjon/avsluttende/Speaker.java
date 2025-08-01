package p5_abstraksjon.avsluttende;

public class Speaker extends AudioDevice {

	private int batteryLevel;

	public Speaker(String name) {
		super(name);
	}

	@Override
	public void playSound(String track) {
		System.out.println("Playing sound: " + track);
	}

	@Override
	public int getMaxVolume() {
		return 20;
	}

}
