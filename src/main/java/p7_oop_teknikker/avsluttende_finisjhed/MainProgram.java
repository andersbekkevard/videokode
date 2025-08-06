package p7_oop_teknikker.avsluttende;

public class MainProgram {
    public static void main(String[] args) {

        // Step 1: Create WebShop instance
        WebShop ws = new WebShop();

        // Step 2: Create Boss instance
        Boss boss = new Boss();

        // Step 3: Create Worker instances with different IDs
        Worker w1 = new Worker(1);
        Worker w2 = new Worker(2);
        Worker w3 = new Worker(3);

        // Step 4: Add workers to the boss's team
        boss.addWorker(w1);
        boss.addWorker(w2);
        boss.addWorker(w3);

        // Step 5: Register boss as listener with webshop
        ws.addListener(boss);

        // Step 6: Place orders and observe round-robin delegation
        ws.placeOrder("Fotballdrakt", 2);
        ws.placeOrder("Sko", 2);
        ws.placeOrder("Genser", 1);
        ws.placeOrder("Sko", 4);

    }

}