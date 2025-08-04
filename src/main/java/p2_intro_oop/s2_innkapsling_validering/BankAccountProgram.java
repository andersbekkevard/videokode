package p2_intro_oop.s2_innkapsling_validering;

public class BankAccountProgram {
    
    public static void main(String[] args) {

        // Opprett ny konto og sjekk at verdiene er som forventet
        // Forventet Otto Objekt
        // Forventet 0.0
        // Forventet: 12345678901

        BankAccount account = new BankAccount("Otto Objekt", "12345678901");
        System.out.println("Navn: " + account.getOwnerName()); 
        System.out.println("Saldo: " + account.getBalance());
        System.out.println();

        // Sette inn 1000 og sjekk at dette også blir ny saldo
        // Forventet: 1000.0
        
        account.deposit(1000);
        System.out.println("Etter innskudd: " + account.getBalance()); // Forventet: 1000.0

        // Ta ut 400 og sjekk at oppdatert verdi blir det samme
        // Forventet: 600.0

        account.withdraw(400);
        System.out.println("Etter uttak: " + account.getBalance()); // Forventet: 600.0
        System.out.println();
        
        // Endre navn til Otto Objekt 
        account.setOwnerName("Otto Subjekt");
        System.out.println("Ny kontoeier: " + account.getOwnerName()); // Forventet: Otto Subjekt

        

        // Test en og en at de blir felt av valideringen
        // BankAccount faultyBankAccount = new BankAccount("", "12345");
        // account.deposit(-200);
        // account.withdraw(5000);
    }

}
