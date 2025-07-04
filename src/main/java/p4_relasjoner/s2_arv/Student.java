package p4_relasjoner.s2_arv;

/**
 * Vi skal nå se på arv
 * 
 * Vi skal lage en klasse Student
 * 
 * Deretter skal vi lage en klasse Studass som arver fra Student
 */
public class Student {
	String name;
	String program;

	public Student(String name, String program) {
		this.name = name;
		this.program = program;
	}

	public void grind(String subject) {
		System.out.println(name + " is grinding " + subject + "...");
	}

	public static void main(String[] args) {
		Student otto = new Student("Otto", "Indøk");
		Student anne = new Student("Anne", "DataTek");
		Studass fredrik = new Studass("Fredrik", "DataTek", "ITGK");

		otto.grind("ITGK");
		anne.grind("ITGK");
		fredrik.teach();
		fredrik.grind("ITGK");

		Student harald = new Studass("Harald", "DataTek", "ITGK");
		harald.grind("ITGK");
		// harald.teach();
	}
}
