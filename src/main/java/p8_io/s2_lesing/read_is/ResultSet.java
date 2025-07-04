package p8_io.s2_lesing.read_is;

import java.util.List;
import java.util.Map;

import p8_io.s1_skriving.write_os.PizzaRecipe;

public record ResultSet(List<PizzaRecipe> pizzaRecipes, Map<Integer, String> errorLines) {
}
