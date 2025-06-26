package p3_mer_om_java.s1_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDLists {

    public static void main(String[] args) {

        // 2DLister - Liste av lister
        // 2DArrays - Array av arrays

        
        // Man kan også løse dette med arrays om du ikke har behov for at størrelsen skal være dynamisk
        // Har du et tre på rad spill kan du

        String[] foods = {"Bread", "Cheese", "Ham"};
        String[] drinks = {"Milk", "Juice", "Bread"};
        String[] misc = {"Batteries", "Gum", "Soap"};

        String[][] shoppingCart = {foods, drinks, misc};

        System.out.println(Arrays.toString(shoppingCart));
        System.out.println(Arrays.deepToString(shoppingCart));


        // Kan også være nyttig om du trenger å visualisere noe i et rutenett
        int[][] tictactoe = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };

        tictactoe[1][1] = 1;

        System.out.println(Arrays.toString(tictactoe));
        System.out.println(Arrays.deepToString(tictactoe));





        List<String> kitchen = new ArrayList<>();
        List<String> bedroom = new ArrayList<>(Arrays.asList("Bed"));

        List<List<String>> movingLoad = new ArrayList<>();
        movingLoad.add(kitchen);
        movingLoad.add(bedroom);

        kitchen.add("Fridge");
        kitchen.add("Table");

        System.out.println(movingLoad);



        List<List<Integer>> mutable2dList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(0);
            }
            mutable2dList.add(row);
        }

        mutable2dList.get(1).set(1, 1);

        System.out.println(mutable2dList);
    }

    
}
