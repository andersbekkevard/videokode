package p7_oop_teknikker.s2_observert;

import java.util.ArrayList;
import java.util.List;

public class WeatherSensor {

	private int temp;

	private List<WeatherListener> listeners = new ArrayList<>();

	public void setTemp(int newTemp) {
		this.fireStateChanged(this.temp, newTemp);
		this.temp = newTemp;
	}

	public void addListener(WeatherListener listener) {
		if (!this.listeners.contains(listener)) {
			this.listeners.add(listener);
		}
	}

	public void removeListener(WeatherListener listener) {
		this.listeners.remove(listener);
	}

	public void fireStateChanged(int oldTemp, int newTemp) {
		listeners.forEach(l -> l.weatherUpdated(oldTemp, newTemp));
	}


	public static void main(String[] args) {

		WeatherSensor sensor = new WeatherSensor();
		WeatherListener l1 = new Forecaster("Yr", sensor);
		WeatherListener l2 = new Forecaster("Pent", sensor);
		WeatherListener l3 = new Newspaper("VG", sensor);
		sensor.addListener(l1);
		sensor.addListener(l2);
		sensor.addListener(l3);

		sensor.setTemp(0);
		sensor.setTemp(5);
		sensor.setTemp(15);
		sensor.setTemp(20);
		sensor.setTemp(21);
		sensor.setTemp(22);

	}

}
