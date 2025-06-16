package p02_intro_oop;

public class AvansertPerson {

	String name;
	int age;

	AvansertPerson(String newName, int newAge) {
		name = newName;
		age = newAge;
	}

	public static void main(String[] args) {
		AvansertPerson person = new AvansertPerson("Hans", 22);
		person.name = "Hanne";
		person.age = 23;
		System.out.println("Jeg heter " + person.name + " og jeg er " + person.age + " år gammel");
	}
}
