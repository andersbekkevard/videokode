package p5_abstraksjon.avsluttende_finished;

public class Speaker extends AudioDevice {

	private int batteryLevel;

	public Speaker(String name) {
		super(name);
	}

	@Override
	public void playSound(String track) {
		System.out.println("Playing sound " + track + " on the speaker" + getModelName());
	}

	@Override
	public int getMaxVolume() {
		return 20;
	}

}
