package p5_abstraksjon.s2_interface;

public class Motorcycle implements Vehicle {
	private String brand;
	private String model;
	private int year;

	public Motorcycle(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void start() {
		System.out.println("Starting " + brand + " " + model);
	}

	public void refuel() {
		System.out.println("Refueling the motorcycle");
	}

}
