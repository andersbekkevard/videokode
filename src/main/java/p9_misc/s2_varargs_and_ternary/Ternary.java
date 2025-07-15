package p9_misc.s2_varargs_and_ternary;

// I mange tilfeller setter vi verdier basert på betingelser.
// Ternary er bare en veldig kort if/else setning

public class Ternary {
    
    public static void main(String[] args) {
        
        System.out.println("Pris gitt student: " + getPrice(true));
        System.out.println("Pris gitt ikke student: " + getPrice(false));

        System.out.println(nicknameOf("Alexander"));
        // System.out.println(nicknameOf("Tor"));
        System.out.println(ternaryNicknameOf("Tor"));

    }

    public static String nicknameOf(String name) {
        return name.substring(0, 4);
    }

     public static String ternaryNicknameOf(String name) {
        return name.length() > 6 ? name.substring(0, 6) : name;
    }


    public static int getPrice(boolean isStudent) {
        int price = isStudent ? 99 : 149;
        return price;
    }
}
