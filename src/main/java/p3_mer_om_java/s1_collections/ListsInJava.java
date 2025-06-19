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

    public List<Integer> getDiceRolls() {
        return this.diceRolls;
    }

    public List<Integer> getUpdatingDiceRolls() {
        return Collections.unmodifiableList(this.diceRolls);
    }

    public List<Integer> getSnapshotDiceRolls() {
        return List.copyOf(this.diceRolls);
    }

    public static void main(String[] args) {

        ListsInJava l = new ListsInJava();
        l.addRoll(5);
        l.addRoll(2);
        System.out.println(l.diceRolls);

        List<Integer> stolenList = l.getDiceRolls();
        stolenList.add(40); // Dette vil kunne skje selv om vi har private
        System.out.println(l.diceRolls);

        List<Integer> updatingList = l.getUpdatingDiceRolls();
        l.addRoll(3); 
        System.out.println(updatingList); // Fortsetter å se oppdatering etter du fikk innsyn

        List<Integer> snapshotList = l.getSnapshotDiceRolls();
        l.addRoll(1);
        System.out.println(snapshotList); // Innsyn begrenset til tidspunktet du fikk tilgang

        l.diceRolls.size();
        l.diceRolls.get(1);
        l.diceRolls.contains(5);
        l.diceRolls.remove(Integer.valueOf(5));
        // getFirst, getLast, clear, isEmpty, indexOf ...

    }

}
