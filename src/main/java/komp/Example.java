package komp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example {
    static int count = 0;

    public void inc() {
        count++;
    }

    public static void main(String[] args) {
        Example e1 = new Example();
        e1.inc();
        Example e2 = new Example();
        e2.inc();
        System.out.println(count);
        
        Consumer<String> unknown = 
      s -> System.out.println(s.toLowerCase()
                               .substring(1, 3)
                               .toUpperCase()); 
unknown.accept("helLO");

    }
}
