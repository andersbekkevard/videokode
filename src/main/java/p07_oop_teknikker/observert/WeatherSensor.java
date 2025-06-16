package p07_oop_teknikker.observert;

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
}
