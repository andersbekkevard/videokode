package p8_io.s2_lesing;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import p8_io.s1_skriving.PizzaRecipe;

public class FoodDeliveryService {

    private List<PizzaRecipe> availableOrders = new ArrayList<>();

    public void scannerReadOrdersFromFile(String filename) {
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

    public void bufferedReaderReadOrdersFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                PizzaRecipe newPizza = this.getPizza(line);
                availableOrders.add(newPizza);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
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
        fds.bufferedReaderReadOrdersFromFile(filename);

        for (PizzaRecipe r : fds.availableOrders) {
            System.out.println(r);
        }

    }

}
