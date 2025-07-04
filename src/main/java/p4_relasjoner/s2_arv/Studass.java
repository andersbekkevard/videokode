package p4_relasjoner.s2_arv;

/**
 * Denne klassen arver fra Student
 */
public class Studass extends Student {
	String teachingSubject;

	public Studass(String name, String program, String teachingSubject) {
		super(name, program);
		this.teachingSubject = teachingSubject;
	}

	public void teach() {
		System.out.println(name + " is teaching " + teachingSubject + "...");
	}

	/**
	 * Fordeler med arv:
	 * 
	 * - Slipper å gjenta kode
	 * Studass-klassen er mye kortere enn StudassOld
	 * 
	 * - Kan nå bruke forskjellige klasser i samme program
	 * Kan fortsatt betrakte Studass som en Student
	 */
}
