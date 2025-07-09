package p5_abstraksjon.s1_abstrakte_klasser.med_arv;

/**
 * Så generaliserer vi til Vehicle, og slipper å skrive så mye
 */
public class Bike extends Vehicle {

	public Bike(String brand, String model, int year) {
		super(brand, model, year);
	}

	public void refuel() {
		System.out.println("Mmm, eating a banana on the bike");
	}

}
