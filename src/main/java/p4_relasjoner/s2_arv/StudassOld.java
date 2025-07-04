package p4_relasjoner.s2_arv;

/**
 * Denne klassen implementerer Studass fra scratch
 */
public class StudassOld {
	String name;
	String program;
	String teachingSubject;

	public StudassOld(String name, String program, String teachingSubject) {
		this.name = name;
		this.program = program;
		this.teachingSubject = teachingSubject;
	}

	public void grind(String subject) {
		System.out.println(name + " is grinding " + subject + "...");
	}

	public void teach() {
		System.out.println(name + " is teaching " + teachingSubject + "...");
	}
}