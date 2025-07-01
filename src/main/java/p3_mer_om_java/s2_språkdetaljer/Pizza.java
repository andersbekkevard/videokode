package p3_mer_om_java.s2_språkdetaljer;

public class Pizza {
	private String topping;

	public Pizza(String topping) {
		this.topping = topping;
	}

	@Override
	public String toString() {
		return "A delicious pizza with " + topping + " on top!";
	}

	public static void main(String[] args) {
		Pizza p1 = new Pizza("pepperoni");
		Pizza p2 = new Pizza("mushrooms");

		System.out.println(p1);
		System.out.println(p2);
	}
}
