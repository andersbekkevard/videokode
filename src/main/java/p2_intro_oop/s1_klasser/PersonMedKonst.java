package p2_intro_oop.s1_klasser;

public class PersonMedKonst {

	String name;
	int age;

	// Hva er en default-konstruktør
	// PersonMedKonst() {

	// }

	PersonMedKonst(String newName, int newAge) {
		name = newName;
		age = newAge;
	}

	// PersonMedKonst(String name, int age) {
	// 	this.name = name;
	// 	this.age = age;
	// // Sett dette objektet sin name til verdien vi fikk inn
	// }

	// PersonMedKonst(String name) {
	// 	this(name, 0);
	// }

	// String getName() {
	// 	return this.name;
    // }

    // void setName(String name) {
	// 	this.name = name;
	// }


	public static void main(String[] args) {
		PersonMedKonst person = new PersonMedKonst("Hans", 22);
		person.name = "Hanne";
		person.age = 23;
		System.out.println("Jeg heter " + person.name + " og jeg er " + person.age + " år gammel");
	}
}
