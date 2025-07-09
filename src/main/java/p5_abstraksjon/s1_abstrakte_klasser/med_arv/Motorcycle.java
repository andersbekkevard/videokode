package p5_abstraksjon.s1_abstrakte_klasser.med_arv;

public class Motorcycle extends Vehicle {

	public Motorcycle(String brand, String model, int year) {
		super(brand, model, year);
	}

	public void refuel() {
		System.out.println("Refueling the motorcycle");
	}
}
