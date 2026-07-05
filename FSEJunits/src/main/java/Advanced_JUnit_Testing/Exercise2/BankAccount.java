package Advanced_JUnit_Testing.Exercise2;



public class BankAccount {

    private double balance;

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public void withDraw(int amount)
    {
        if(amount < balance)
            balance-=amount;

    }

    public double getBalance() {
        return balance;
    }
}
