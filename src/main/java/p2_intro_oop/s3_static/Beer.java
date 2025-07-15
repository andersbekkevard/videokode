package p2_intro_oop.s3_static;

public class Beer {
	String brand;
	int price;
	static int numberOfBeers; // Senere

	public Beer(String brand, int price) {
		this.brand = brand;
		this.price = price;
		numberOfBeers++; // Senere
	}

	public void drink() {
		System.out.println("Drinking " + brand + ", mmm, it was definitely worth " + price + " kr");
	}

	public static int getNumberOfBeers() { // Senere
		return numberOfBeers;
	}

	@Override
	public String toString() {
		return "This is a " + brand + " beer, it costs " + price + " kr";
	}

	public static void main(String[] args) {
		Beer beer1 = new Beer("Tuborg", 10);
		Beer beer2 = new Beer("Carlsberg", 12);
		Beer beer3 = new Beer("Heineken", 15);

		beer1.drink();
		beer2.drink();
		beer3.drink();
		// Kan ikke kalle
		// Beer.drink();

		System.out.println("Number of beers: " + Beer.numberOfBeers);
		// Gir ikke mening å kalle beer1.numberOfBeers, (selv om vi får lov)
		// System.out.println("Number of beers: " + beer1.numberOfBeers);

		// Gir ikke mening å kalle beer1.getNumberOfBeers(), (selv om vi får lov)
		// System.out.println("Number of beers: " + Beer.getNumberOfBeers());

		// Vis at inne i klassen trenger vi ikke definere Beer for å kalle static
		// metoder. Demonstrer utenfor klassen.
		System.out.println("Number of beers: " + getNumberOfBeers());
	}

}
