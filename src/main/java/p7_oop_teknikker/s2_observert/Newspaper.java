package p7_oop_teknikker.s2_observert;

public class Newspaper implements WeatherListener {
	private String name;
	private String headline;

	public Newspaper(String name) {
		this.name = name;
	}

	@Override
	public void weatherUpdated(int oldTemp, int newTemp) {
		if (newTemp >= 20 || newTemp - oldTemp >= 10) {
			System.out.println(this.name + ": " + "EKSTRA! STRÅLENDE VÆR");
		}
	}

	@Override
	public String toString() {
		return name + " - Temp: " + headline;
	}

}
