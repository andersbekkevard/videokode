package p5_abstraksjon.s1_abstrakte_klasser.uten_arv;

public class Car {
	private String fuelType;
	private String brand;
	private String model;
	private int year;

	public Car(String brand, String model, int year, String fuelType) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.fuelType = fuelType;
	}

	public void start() {
		System.out.println("Starting " + brand + " " + model);
	}

	public void refuel() {
		System.out.println("Refueling the car with " + fuelType);
	}
}
