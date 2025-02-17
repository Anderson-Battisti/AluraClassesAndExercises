package battisti.anderson.aluraoopclasses.Modules;

import battisti.anderson.aluraoopclasses.Interfaces.Calculable;

public class Book
    implements
        Calculable
{
    private String title;
    private double price;

    @Override
    public double calculateFinalPrice()
    {
        return ( this.price * 0.95 );
    }
}
