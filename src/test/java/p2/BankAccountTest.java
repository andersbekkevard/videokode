package p2;

import org.junit.jupiter.api.Test;

import p2_intro_oop.s2_innkapsling_validering.BankAccount;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void constructorInitializesCorrectly() {
        BankAccount konto = new BankAccount("Ola", "1001");
        assertEquals("Ola", konto.getOwnerName());
        assertEquals("1001", konto.getAccountNumber());
        assertEquals(0.0, konto.getBalance());
    }

    @Test
    void constructorThrowsOnInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount("", "1002");
        });
    }

    @Test
    void depositIncreasesBalance() {
        BankAccount konto = new BankAccount("Kari", "1003");
        konto.deposit(300);
        assertEquals(300.0, konto.getBalance());
    }

    @Test
    void depositThrowsOnNegativeAmount() {
        BankAccount konto = new BankAccount("Kari", "1003");
        assertThrows(IllegalArgumentException.class, () -> konto.deposit(-100));
    }

    @Test
    void withdrawDecreasesBalance() {
        BankAccount konto = new BankAccount("Per", "1004");
        konto.deposit(500);
        konto.withdraw(200);
        assertEquals(300.0, konto.getBalance());
    }

    @Test
    void withdrawThrowsIfTooMuch() {
        BankAccount konto = new BankAccount("Per", "1004");
        konto.deposit(100);
        assertThrows(IllegalStateException.class, () -> konto.withdraw(200));
    }

    @Test
    void withdrawThrowsOnNegativeAmount() {
        BankAccount konto = new BankAccount("Lise", "1005");
        assertThrows(IllegalArgumentException.class, () -> konto.withdraw(-10));
    }

    @Test
    void setOwnerNameChangesName() {
        BankAccount konto = new BankAccount("Lise", "1006");
        konto.setOwnerName("Lisa");
        assertEquals("Lisa", konto.getOwnerName());
    }

    @Test
    void setOwnerNameThrowsOnInvalidInput() {
        BankAccount konto = new BankAccount("Lise", "1006");
        assertThrows(IllegalArgumentException.class, () -> konto.setOwnerName(""));
    }
}
