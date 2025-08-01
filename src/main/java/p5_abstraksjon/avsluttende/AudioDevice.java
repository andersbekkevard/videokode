package p5_abstraksjon.avsluttende;

public abstract class AudioDevice {

	protected String modelName;
	protected int volume;

	public AudioDevice(String modelName) {
		this.modelName = modelName;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume < 0 || volume > getMaxVolume()) {
			throw new IllegalArgumentException("Volume must be between 0 and " + getMaxVolume());
		}
		this.volume = volume;
	}

	public abstract int getMaxVolume();

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public abstract void playSound(String track);

}
