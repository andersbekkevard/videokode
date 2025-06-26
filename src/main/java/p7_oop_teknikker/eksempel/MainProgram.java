package p7_oop_teknikker.eksempel;

public class MainProgram {
    

    public static void main(String[] args) {
        
        WebShop ws = new WebShop();

        Boss boss = new Boss();
        Worker w1 = new Worker(1);
        Worker w2 = new Worker(2);
        Worker w3 = new Worker(3);
        boss.addWorker(w1);
        boss.addWorker(w2);
        boss.addWorker(w3);

        ws.addListener(boss);

        ws.placeOrder("Fotballdrakt", 2);
        ws.placeOrder("Sko", 2);
        ws.placeOrder("Genser", 1);
        ws.placeOrder("Sko", 4);

    }


}
