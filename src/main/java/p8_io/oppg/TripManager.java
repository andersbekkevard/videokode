package p8_io.oppg;

import java.util.ArrayList;
import java.util.List;

public class TripManager {
    
    private List<Trip> trips = new ArrayList<>();

    public TripManager(List<Trip> trips) {
        this.trips = trips;
    }

    public void addTrip(Trip trip) {
        if (!trips.contains(trip)) {
            trips.add(trip);
        }
    }

    public Trip archiveTrip(Trip trip) {
        trips.remove(trip);
        return trip; 
    }

    public List<Trip> getTrips() {
        return trips;
    }
    
}
