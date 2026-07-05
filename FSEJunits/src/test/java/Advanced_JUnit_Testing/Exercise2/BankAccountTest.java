package Advanced_JUnit_Testing.Exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    void testValidDeposit() {
        BankAccount bank = new BankAccount(1000);

        bank.deposit(200);

        assertEquals(1200 , bank.getBalance());
    }
    @Test
    void testWithdrawMoreThanBalance() {

        BankAccount account = new BankAccount(1000);

        account.withDraw(1500);

        assertEquals(1000, account.getBalance());
    }
}
