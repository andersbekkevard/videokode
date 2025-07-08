package p7_oop_teknikker.s2_observert;

public class Forecaster implements WeatherListener {

	private String name;
	private int currentTemp;

	public Forecaster(String name) {
		this.name = name;
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
