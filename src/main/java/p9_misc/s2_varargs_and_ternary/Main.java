package p9_misc.s2_varargs_and_ternary;

import java.util.Arrays;

// KAMERAOPPTAK
// Nå skal vi se på hvordan vi kan lage metoder med et variabelt antall argumenter. Dette kalles varargs i Java 

public class Main {
    
    public static void main(String[] args) {
        
        // STEG 1
        // Vi vil ha en summeringsfunksjon som tar et ukjent antall argumenter
        // Da kan vi bruke method overloading, som er at vi har samme funksjonsnavn, men med forskjellige arguemnter
        // Dette funker
        System.out.println(sum(1));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
        System.out.println(varargsSum(1,2,3,4,5));
        // Kan bruke så mange argumenter vi vil
        


        // Så vi ser at dette egt bare er at argumentene gjøres til en array og sendes som en array
        int[] nums = {1,2,3,4};
        System.out.println(sumArray(nums));

        // Og at Java kan gjøre dette for oss når vi bruker varargs
        // Den kan til og med ta arrayen vår som argument
        System.out.println(sumVarargs(nums));
        System.out.println(sumVarargs(1,2,3,4,5));
        
    }

    
    public static int sum(int a) { 
        return a; 
    }
    
    public static int sum(int a, int b) { 
        return a + b; 
    }

    public static int sum(int a, int b, int c) { 
        return a + b + c; 
    }

    public static int sum(int a, int b, int c, int d) { 
        return a + b + c + d; 
    }

    // ...

    public static int varargsSum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }




    public static int sumArray(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public static int sumVarargs(int... nums) {
        return Arrays.stream(nums).sum();
    }
    


}
