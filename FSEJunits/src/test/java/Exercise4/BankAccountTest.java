package Exercise4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp(){
        System.out.println("Setting account");
        account = new BankAccount(1000);
    }
    @AfterEach
    void tearDown(){
        System.out.println("clearing");
        account = null;
    }

    @Test
    void testDeposit(){
        //arranging
        double amt = 500;

        // act

        account.deposit(amt);

        //valid
        assertEquals(1500 , account.getBalance());
    }

    @Test
    void testWithdraw() throws Exception {
        // Arrange
        double amount = 300;

        // Act
        account.withdraw(amount);

        // Assert
        assertEquals(700, account.getBalance());
    }

}
