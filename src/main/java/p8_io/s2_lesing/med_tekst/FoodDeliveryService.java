package p8_io.s2_lesing.med_tekst;
import p8_io.s1_skriving.med_tekst.PizzaRecipe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FoodDeliveryService {

    private List<PizzaRecipe> availableOrders = new ArrayList<>();

    public void readOrdersFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                PizzaRecipe newPizza = this.getPizza(line);
                availableOrders.add(newPizza);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public PizzaRecipe getPizza(String lineInfo) {
        String[] splittedLine = lineInfo.split("-"); // ["navn", "ing1-ing2-..."]
        String name = splittedLine[0];
        String[] toppings = splittedLine[1].split(","); // ["ing1", "ing2", ...]
        return new PizzaRecipe(name, Arrays.asList(toppings));
    }


    public static void main(String[] args) {

        FoodDeliveryService fds = new FoodDeliveryService();

        String filename = "pizzaRecipe.txt";
        fds.readOrdersFromFile(filename);

        for (PizzaRecipe r : fds.availableOrders) {
            System.out.println(r);
        }

    }

}
