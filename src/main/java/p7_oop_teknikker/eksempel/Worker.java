package p7_oop_teknikker.eksempel;

public class Worker {

    private int id;

    public Worker(int id) {
        this.id = id;
    }

    public void handleOrder(String item, int amount) {
        System.out.println("Ansatt nr " + id + " håndterer bestilling: " + amount + " stk " + item);
    }

}
