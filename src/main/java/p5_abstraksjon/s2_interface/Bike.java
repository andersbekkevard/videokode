package p5_abstraksjon.s2_interface;

import java.util.ArrayList;
import java.util.List;

/**
 * Samme eksempel som med arv, men med interface istedenfor superklasse (for et
 * lettvekts alternativ)
 * Eks: "Vi vil bare kune ha en list.forEach(vehicle -> vehicle.start())"
 */

/**
 * Denne kan være kort, for de kommer rett fra forrige video. Trenger derfor
 * ikke introdusere klassene så nøye
 */
public class Bike implements Vehicle {
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

	public static void main(String[] args) {
		Bike bike = new Bike("Scott", "Scale 910", 2024);
		bike.start();
		bike.refuel();

		Car car = new Car("Toyota", "Corolla", 2024, "Gasoline");
		car.start();
		car.refuel();

		Motorcycle motorcycle = new Motorcycle("Honda", "CBR 650R", 2024);
		motorcycle.start();
		motorcycle.refuel();

		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(bike);
		vehicles.add(car);
		vehicles.add(motorcycle);

		for (Vehicle vehicle : vehicles) {
			vehicle.start();
		}
	}

}
