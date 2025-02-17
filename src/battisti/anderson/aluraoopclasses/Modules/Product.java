package battisti.anderson.aluraoopclasses.Modules;

import battisti.anderson.aluraoopclasses.Interfaces.Salable;

public class Product
        implements
            Salable
{
    private int id;
    private String name;
    private double price;

    @Override
    public double calculatePriceByQuantity( int quantity )
    {
        if ( quantity < 5 )
        {
            return ( this.price );
        }
        else if ( quantity >= 5 && quantity <= 10 )
        {
            return ( this.price * 0.90 );
        }
        else
        {
            return ( this.price * 0.80 );
        }
    }
}
