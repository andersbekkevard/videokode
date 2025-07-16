package p6_funksjonell_programmering.s3_comparator_iterator.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WeatherMeasurement implements Iterable<Double> {

    private List<Double> measurements = new ArrayList<>();

    public WeatherMeasurement(List<Double> l) {
        this.measurements = l;
    } 
    @Override
    public Iterator<Double> iterator() {
        return measurements.iterator();
    }

    public static void main(String[] args) {
        WeatherMeasurement wm = new WeatherMeasurement(Arrays.asList(2.3, 11.4, 4.5));
        for (Double m : wm) {
            System.out.println("Measured: " + m);
        }
    }
    

}
