package teknikker.delegering;

public class Teori {
	public static void main(String[] args) {
		// Delegering = Teknikk for å løse problemer ved å dele dem inn i mindre deler

		// Med delegering
		System.out.println("\n--------------------------------");
		System.out.println("Med delegering:");
		SmartPerson smarteFredrik = new SmartPerson("Fredrik");
		SmartPerson smarteAnne = new SmartPerson("Anne");

		smarteFredrik.addFriend(smarteAnne);
		smarteAnne.addFriend(smarteFredrik);

		System.out.println("Fredrik's venner: " + smarteFredrik.getFriends());
		System.out.println("Anne's venner: " + smarteAnne.getFriends());

		// Uten delegering
		System.out.println("\n--------------------------------");
		System.out.println("Uten delegering:");
		DumbPerson dummeFredrik = new DumbPerson("Fredrik");
		DumbPerson dummeAnne = new DumbPerson("Anne");

		dummeFredrik.addFriend(dummeAnne);
		dummeAnne.addFriend(dummeFredrik);

		System.out.println("Fredrik's venner: " + dummeFredrik.getFriends());
		System.out.println("Anne's venner: " + dummeAnne.getFriends());

		/*
		 * Legg merke til at fra utsiden er oppførselen identisk; det er bare
		 * innvendig at objektene oppfører seg annerledes.
		 */
	}
}
