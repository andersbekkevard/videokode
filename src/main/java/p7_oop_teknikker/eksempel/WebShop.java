package p7_oop_teknikker.eksempel;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    public static final List<String> availableOrders = List.of("Fotballdrakt", "Sko", "Genser");

    private List<OrderListener> listeners = new ArrayList<>();

    public void addListener(OrderListener l) {
        if (!listeners.contains(l)) {
            listeners.add(l);
        }
    }

    public void removeListener(OrderListener l) {
        listeners.remove(l);
    }

    public void placeOrder(String item, int amout) {
        if (item == null || item.isBlank() || amout <= 0) {
            throw new IllegalArgumentException("Ugyldig bestilling");
        }
        if (!availableOrders.contains(item))
            throw new IllegalArgumentException("Ikke i sortement");

        listeners.forEach(l -> l.orderPlaced(item, amout));
    }

}
