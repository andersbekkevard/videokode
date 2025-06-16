package p01_intro_java;

public class Arrays {
    
    public static void main(String[] args) {
        

        // Med verdier direkte
        int[] tall1 = {10, 20, 30, 40};

        // Eller tomt array med plass til 5 tall
        int[] tall2 = new int[4];
        tall2[0] = 10;
        tall2[1] = 20;
        tall2[2] = 30;
        tall2[3] = 40;

        System.out.println(tall2);
        System.out.println("Tall 2: " + tall2[0] + ", " + tall2[1] + ", " + tall2[2] + ", " + tall2[3]);


        String[] navn = new String[2];
        navn[0] = "Hans";
        navn[1] = "Ola";
        System.out.println("Første navn i lista: " + navn[0]);

    }
}
