package innkapsling_1;

public class BankCustomer {

    // Må legge til private senere
    String name;
    String uid;
    String job;
    int pin;
    double balance;

    // Må legge til public senere
    BankCustomer(String name, String uid, String job, int pin, double balance) {
        this.name = name;
        this.uid = uid;
        this.job = job;
        this.pin = pin;
        this.balance = balance;
    }

    // Dette kalles en getter
    // public String getName() {
    //     return this.name;
    // }

    // Dette kalles en setter
    // public String setJob() {
    //     return this.job;
    // }

    // Høyreklikk, source action, generate getters and setters, huk av

    // public int getAge() {
    //     String birthyear = uid.substring(4, 6);
    //     int age = 25 - Integer.parseInt(birthyear);
    //     return age;
    // }

}
