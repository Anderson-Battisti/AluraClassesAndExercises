package battisti.anderson.aluraoopclasses.Modules;

public class BankAccount
{
    private int accountNumber;
    private double balance;
    public String owner;

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber( int accountNumber )
    {
        this.accountNumber = accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance( double balance )
    {
        this.balance = balance;
    }
}
