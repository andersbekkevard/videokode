package p5_abstraksjon.s1_abstrakte_klasser.med_arv;

public class Car extends Vehicle {
	private String fuelType;

	public Car(String brand, String model, int year, String fuelType) {
		super(brand, model, year);
		this.fuelType = fuelType;
	}

	public void refuel() {
		System.out.println("Refueling the car with " + fuelType);
	}
}
