package p5_abstraksjon.s1_abstrakte_klasser.uten_arv;

/**
 * Viser først uten arv
 */
public class Bike {
	private String brand;
	private String model;
	private int year;

	public Bike(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void start() {
		System.out.println("Starting the bike");
	}

	public void refuel() {
		System.out.println("Mmm, eating a banana on the bike");
	}

}
