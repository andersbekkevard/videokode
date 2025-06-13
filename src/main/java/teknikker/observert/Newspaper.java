package teknikker.observert;

public class Newspaper implements WeatherListener 
{
    private String name;
    private String headline;
    private WeatherSensor sensor;

    public Newspaper(String name, WeatherSensor sensor) {
        this.name = name;
        this.sensor = sensor;
    }

    @Override
    public void weatherUpdated(int oldTemp, int newTemp) {
        if (newTemp > 20 || newTemp - oldTemp >= 10) {
            this.headline = "EKSTRA! STRÅLENDE VÆR";
        }
    }

    @Override
    public String toString() {
        return name + " - Temp: " + headline;
    }

    

}
