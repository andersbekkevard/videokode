package p2_intro_oop.s2_innkapsling_validering;

/**
 * Representerer en enkel bankkonto med navn, kontonummer og saldo.
 * Støtter innskudd, uttak og tilgang til kontoinformasjon.
 */
public class BankAccount {

    private String ownerName;
    private String accountNumber;
    private double balance;

    /**
     * Lager en ny bankkonto med angitt navn og kontonummer.
     * Startsaldon settes til 0.
     *
     * @param ownerName Navnet til kontoeier. Kan ikke være tomt.
     * @param accountNumber Unik identifikator for kontoen.
     * @throws IllegalArgumentException hvis navn enten er null eller en tom streng.
     */
    public BankAccount(String ownerName, String accountNumber) {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Navn kan ikke være tomt.");
        }
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    /**
     * Returnerer navnet på kontoeier.
     *
     * @return kontoeiers navn
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Returnerer kontonummeret.
     *
     * @return kontonummer
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Returnerer saldoen på kontoen.
     *
     * @return gjeldende saldo
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Oppdaterer kontoeiers navn.
     *
     * @param newName nytt navn. Kan ikke være tomt eller null.
     * @throws IllegalArgumentException hvis nytt navn enten er null eller en tom streng.
     */
    public void setOwnerName(String newName) {
        if (newName == null || newName.isBlank()) {
            throw new IllegalArgumentException("Navnet må være gyldig.");
        }
        this.ownerName = newName;
    }

    /**
     * Setter inn penger på kontoen.
     *
     * @param amount beløpet som skal settes inn. Må være positivt.
     * @throws IllegalArgumentException hvis beløpet er negativt.
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Innskudd må være større enn null.");
        }
        balance += amount;
    }

    /**
     * Tar ut penger fra kontoen.
     *
     * @param amount beløpet som skal tas ut. Må være positivt og ikke overstige saldoen.
     * @throws IllegalArgumentException hvis beløpet er negativt.
     * @throws IllegalStateException hvis beløpet overstiger saldoen.
     */
    public void withdraw(double amount) {
        checkWithdraw(amount);
        balance -= amount;
    }

    /**
     * Privat funksjon kun ment for internt bruk. Sjekker om uttak er gyldig.
     *
     * @param amount beløpet som skal tas ut. Må være positivt og ikke overstige saldoen.
     * @throws IllegalArgumentException hvis beløpet er negativt.
     * @throws IllegalStateException hvis beløpet overstiger saldoen.
     */
    private void checkWithdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Uttak må være større enn null.");
        }
        if (amount > balance) {
            throw new IllegalStateException("Ikke nok penger på konto.");
        }
    }

}
