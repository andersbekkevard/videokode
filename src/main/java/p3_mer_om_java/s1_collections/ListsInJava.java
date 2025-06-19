package p3_mer_om_java.s1_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsInJava {

    private List<Integer> diceRolls = new ArrayList<>();

    public void addRoll(int n) {
        if (n >= 1 && n <= 6) {
            diceRolls.add(n);
        }
    }

    public List<Integer> getLivefeedDiceRolls() {
        // return this.diceRolls;
        return Collections.unmodifiableList(this.diceRolls);
        // return new ArrayList<>(this.diceRolls);
        // return List.copyOf(this.diceRolls);
    }

    public static void main(String[] args) {

        ListsInJava lij = new ListsInJava();
        lij.addRoll(5);
        lij.addRoll(2);
        lij.addRoll(7);
        System.out.println(lij.diceRolls);

        List<Integer> stolenList = lij.getDiceRolls();
        stolenList.add(2);
        
    }

}
