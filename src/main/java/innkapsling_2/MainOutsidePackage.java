package innkapsling_2;

import innkapsling_1.BankCustomer;

public class MainOutsidePackage {
    
	public static void main(String[] args) {
        // Kan heller ikke opprette med mindre man har skrevet public foran kontruktøren
        // BankCustomer bc = new BankCustomer("Otto", "170504 01023", "Student", 1418, 2.3);

		// Uten public har man IKKE tilgang til felter utenfor package
		// System.out.println(bc.pin);


        // System.out.println(bc.getName());
        // System.out.println(bc.getAge());
        // bc.deposit();
        // System.out.println(bc.getJob());
    }

}
