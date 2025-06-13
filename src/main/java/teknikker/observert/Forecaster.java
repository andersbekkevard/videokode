package teknikker.observert;
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
    }

    @Override
    public String toString() {
        return name + " - Temp: " + currentTemp;
    }

}
