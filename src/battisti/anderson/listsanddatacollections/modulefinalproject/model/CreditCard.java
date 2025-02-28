package battisti.anderson.listsanddatacollections.modulefinalproject.model;

public class CreditCard
{
    private double creditLimit;

    public CreditCard( double creditLimit )
    {
        this.creditLimit = creditLimit;
    }

    public void setCreditLimit( double creditLimit )
    {
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }
}
