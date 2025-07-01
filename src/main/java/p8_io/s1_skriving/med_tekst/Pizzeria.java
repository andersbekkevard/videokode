package p8_io.s1_skriving.med_tekst;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizzeria {

    List<PizzaRecipe> recipes = new ArrayList<>();

    public void addRecipe(PizzaRecipe resipe) {
        if (!recipes.contains(resipe)) {
            recipes.add(resipe);
        }
    }

    public void removeRecipe(PizzaRecipe recipe) {
        recipes.remove(recipe);
    }

    public void writeRecipesToFile(String filename) {
        try {
            PrintWriter writer = new PrintWriter(filename);
            for (PizzaRecipe r : recipes) {
                String newLine = "";
                newLine += r.getName() + "-";
                for (String s : r.getTopping()) {
                    newLine += s + ",";
                }
                writer.println(newLine);
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void coolerWriteRecipesToFile(String filename) {
        // med try-with-... metoden av å putte instansieringen av Printwriteren inni parentesen, auto- flushes og closes den når den er ferdig
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (PizzaRecipe r : recipes) {
                writer.println(r);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }




    public static void main(String[] args) {
    
        Pizzeria pizzeria = new Pizzeria();

        pizzeria.addRecipe(new PizzaRecipe("Margarita", Arrays.asList("Tomatsaus", "Ost")));
        pizzeria.addRecipe(new PizzaRecipe("Hawaii", Arrays.asList("Tomatsaus", "Ost", "Skinke", "Ananas")));
        pizzeria.addRecipe(new PizzaRecipe("Pepperoni", Arrays.asList("Tomatsaus", "Ost", "Pepperoni")));

        pizzeria.coolerWriteRecipesToFile("pizzaRecipe.txt");

    }

}
