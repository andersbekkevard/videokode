package p3_mer_om_java.s1_collections;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListsInJava {

    private List<Integer> diceRolls = new ArrayList<>();

    private List<Integer> predefinedDiceRolls = new ArrayList<>(Arrays.asList(4,6,5,3,2));
    private List<Integer> predefinedDiceRolls2 = new ArrayList<>(List.of(4,6,5,3,2));

    public void addRoll(int n) {
        if (n >= 1 && n <= 6) {
            diceRolls.add(n);
        }
    }
Scanner scanner = new Scanner(new File("filnavn.txt"));
BufferedReader reader = new BufferedReader(new FileReader("filnavn.txt"));
FileReader reader = new FileReader("filnavn.txt");
InputStream input = new FileInputStream("filnavn.txt");
InputStreamReader reader = new InputStreamReader(new FileInputStream("filnavn.txt"));
BufferedInputStream input = new BufferedInputStream(new FileInputStream("filnavn.txt"));
DataInputStream input = new DataInputStream(new FileInputStream("filnavn.txt"));
    public List<Integer> getDiceRolls() {
        return this.diceRolls;
    }

    public List<Integer> getUpdatingDiceRolls() {
        return Collections.unmodifiableList(this.diceRolls);
    }

    public List<Integer> getSnapshotDiceRolls() {
        return List.copyOf(this.diceRolls);
    }

    public void printPredefinedDiceRolls() {
        for (int i = 0; i < predefinedDiceRolls.size(); i++) {
            System.out.println(predefinedDiceRolls.get(i));
        }
    }

    public boolean containsSix() {
        return this.predefinedDiceRolls.contains(6); 
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


        l.printPredefinedDiceRolls();

        System.out.println(l.containsSix());
        // l.predefinedDiceRolls.remove(6);
        l.predefinedDiceRolls.remove(Integer.valueOf(6));
        System.out.println(l.containsSix());
        // getFirst, getLast, clear, isEmpty, indexOf ...



    }

}
