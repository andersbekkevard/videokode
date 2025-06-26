package p7_oop_teknikker.s2_observert;

public class Forecaster implements WeatherListener {

	private String name;
	private int currentTemp;
	private WeatherSensor sensor;

	public Forecaster(String name, WeatherSensor sensor) {
		this.name = name;
		this.sensor = sensor;
	}

	@Override
	public void weatherUpdated(int oldTemp, int newTemp) {
		this.currentTemp = newTemp;
		System.out.println(this.name + ": " + this.currentTemp);
	}

	@Override
	public String toString() {
		return name + " - Temp: " + currentTemp;
	}

}
