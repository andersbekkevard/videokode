package p2_intro_oop.s2_innkapsling_validering;

public class BankAccountProgram {
    
    public static void main(String[] args) {
        // Oppretter en ny konto
        BankAccount account = new BankAccount("Otto Objekt", "12345678901");

        // Sjekker navn og saldo satt til innsendt verdi og 0.0 ved start
        System.out.println("Navn: " + account.getOwnerName()); // Forventet Otto Objekt0.0
        System.out.println("Saldo: " + account.getBalance()); // Forventet 0.0
        System.out.println();

        // Setter inn penger
        account.deposit(1000);
        System.out.println("Etter innskudd: " + account.getBalance()); // Forventet: 1000.0

        // Tar ut penger
        account.withdraw(400);
        System.out.println("Etter uttak: " + account.getBalance()); // Forventet: 600.0
        System.out.println();
        
        // Endrer navn
        account.setOwnerName("Otto Subjekt");
        System.out.println("Ny kontoeier: " + account.getOwnerName()); // Forventet: Otto Subjekt

        // Kontonummer skal ikke endres, kun vises
        System.out.println("Kontonummer: " + account.getAccountNumber()); // Forventet: 12345678901
    }

}
