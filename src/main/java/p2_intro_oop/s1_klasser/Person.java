package p2_intro_oop.s1_klasser;


// Kommenter at det står class her. "Så alle filer vi har lagd tidligere har vært klasser uten at vi har tenkt over det"
public class Person {

	// Opprettelse av klassen Person

	String name;
	int age;

	// Vi kan nå også ha unik oppførsel tilknyttet objektene
	// Hva denne metoden skriver ut kommer an på hvilket objekt den er tilknytta
	void sayHi() {
		System.out.println("Hei jeg heter " + name);
	}


	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Hans";
		person1.age = 22;

		Person person2 = new Person();
		person2.name = "Ola";
		person2.age = 24;

		if (person1.age > person2.age) {
			System.out.println(person1.name + " er eldst");
		} else if (person1.age == person2.age) {
			System.out.println(person1.name + " og " + person2.name + " er like gamle");
		} else {
			System.out.println(person2.name + " er eldst");
		}

		// Begge personene kommer fra samme kode men de er hver sin uavhengige entitet likevel

		person1.sayHi();
		person2.sayHi();

		// Vi ser at hva metoden gjør avhenger av hvilket objekt som utfører metoden
	}

	
}
