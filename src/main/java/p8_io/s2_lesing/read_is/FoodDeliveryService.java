package p8_io.s2_lesing.read_is;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import p8_io.s1_skriving.write_os.PizzaRecipe;

public class FoodDeliveryService {

    public static List<PizzaRecipe> read(InputStream inputStream) {
        List<PizzaRecipe> pizzaRecipes = new ArrayList<>();

        // Vis at dette går, og at det i så fall bare er å bruke samme metoder som da vi leste fra filename
        // Scanner scanner = new Scanner(inputStream);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                PizzaRecipe newPizza = FoodDeliveryService.getPizza(line);
                pizzaRecipes.add(newPizza);
            }
        } catch (IOException e) {
            System.out.println("Skjedde feil i lesinga!");
        }
        return pizzaRecipes;
    }

    public static PizzaRecipe getPizza(String line) {
        String[] splittedLine = line.split("-"); // ["name", "topping1, topping2, ..."]
        String name = splittedLine[0];
        String[] topping = splittedLine[1].split(","); // [topping1, topping2, ...]
        return new PizzaRecipe(name, Arrays.asList(topping));
    }


    public static void main(String[] args) {
        // Prøv også med feil navn på fil for å se feilprint
        try (InputStream inputStream = new FileInputStream("pizzaRecipes.txt")) {
            List<PizzaRecipe> readPizzas = FoodDeliveryService.read(inputStream);
            readPizzas.forEach(p -> System.out.println(p));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
