package battisti.anderson.aluraoopclasses.Modules;

public class CurrentAccount
    extends
        BankAccount
{
    public void chargeAccountFee()
    {
        this.setBalance( this.getBalance() - 40.5 );
    }
}
