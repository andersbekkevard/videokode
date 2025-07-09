package p5_abstraksjon.s1_abstrakte_klasser.med_arv;

public abstract class Vehicle {
	private String brand;
	private String model;
	private int year;

	public Vehicle(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void start() {
		System.out.println("Starting " + brand + " " + model);
	}

	public abstract void refuel();
}
