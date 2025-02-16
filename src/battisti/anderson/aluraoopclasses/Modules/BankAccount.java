package battisti.anderson.aluraoopclasses.Modules;

public class BankAccount
{
    private double balance;
    private String owner;

    public double getBalance()
    {
        return this.balance;
    }

    public void setBalance( double balance )
    {
        this.balance = balance;
    }

    public void setOwner( String owner )
    {
        this.owner = owner;
    }

    public void withdraw( double amount )
    {
        if ( amount > balance )
        {
            balance -= amount;
        }
        else
        {
            System.out.println( "Insufficient balance" );
        }
    }

    public void depositMoney( double amount )
    {
        balance += amount;
    }
}
