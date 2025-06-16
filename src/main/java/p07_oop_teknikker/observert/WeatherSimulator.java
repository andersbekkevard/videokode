package p07_oop_teknikker.observert;

public class WeatherSimulator {

	public static void main(String[] args) {

		WeatherSensor sensor = new WeatherSensor();
		WeatherListener l1 = new Forecaster("Yr", sensor);
		WeatherListener l2 = new Forecaster("Pent", sensor);
		WeatherListener l3 = new Forecaster("Storm", sensor);
		sensor.addListener(l1);
		sensor.addListener(l2);
		sensor.addListener(l3);

		sensor.setTemp(10);
		sensor.setTemp(30);

	}

}
