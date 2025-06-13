package oop;

public class Person {
    
    String name;
    int age;

    void setName(String newName) {
        name = newName;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    void presenterDegSelv() {
        System.out.println("Jeg heter " + name + " og jeg er " + age + " år gammel");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Hans");
        p.setAge(21);
        p.presenterDegSelv();
    }
}
