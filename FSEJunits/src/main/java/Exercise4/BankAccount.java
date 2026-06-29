package Exercise4;

import java.util.*;

public class BankAccount {

    private double balance;

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Amount Deposited" + amount);
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance)
            throw new Exception("amount shouldn't be greatewr than balance");
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
}
