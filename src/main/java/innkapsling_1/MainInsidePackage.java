package innkapsling_1;

public class MainInsidePackage {

	public static void main(String[] args) {
		BankCustomer bc = new BankCustomer("Otto", "170504 01023", "Student", 1418, 2.3);

		bc.balance = 1000.0;

		// Uten private har man tilgang til felter uten hverken private eller public
		System.out.println(bc.pin);

		// System.out.println(bc.getAge());
	}

}
