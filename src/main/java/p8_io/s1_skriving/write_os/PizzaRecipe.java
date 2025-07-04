package p8_io.s1_skriving.write_os;

import java.util.List;
import java.util.ArrayList;

public class PizzaRecipe {
    
    String name;

    List<String> topping = new ArrayList<>();

    public PizzaRecipe(String name, List<String> topping) {
        this.name = name;
        this.topping = topping;
    }

    public String getName() {
        return name;
    }

    public List<String> getTopping() {
        return List.copyOf(topping);
    }

    @Override
    public String toString() {
        return name + "-" + String.join(",", topping);
    }

}
