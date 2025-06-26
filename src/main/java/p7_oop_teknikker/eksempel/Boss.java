package p7_oop_teknikker.eksempel;

import java.util.ArrayList;
import java.util.List;

public class Boss implements OrderListener {
    
    private List<Worker> workers = new ArrayList<>();
    private int turn;
    
    public void addWorker(Worker w) {
        if (!workers.contains(w)) {
            workers.add(w);
        }
    }

    public void removeWorker(Worker w) {
        workers.remove(w);
    }

    public void updateTurn() {
        turn++;
        if (turn == workers.size()) turn = 0;
    }

    @Override
    public void orderPlaced(String item, int amout) {
        workers.get(turn).handleOrder(item, amout);
        updateTurn();
    }
}
