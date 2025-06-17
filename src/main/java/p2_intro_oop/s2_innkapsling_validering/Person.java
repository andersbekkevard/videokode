package p2_intro_oop.s2_innkapsling_validering;

public class Person {
    
    private int age;

    public void setAge(int age) {
        // if (age >= 0) {
        //     this.age = age;
        // }
        
        // if (age < 0) {
        //     throw new IllegalArgumentException();
        // }

        if (age < 0) {
            throw new IllegalArgumentException("Alder må være positiv!");
        }

        this.age = age;
    }

    


    // Endres når video er igang
    public static void main(String[] args) {
        
    }

}

