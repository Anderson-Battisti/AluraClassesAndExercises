package battisti.anderson.aluraoopclasses.Modules;

import battisti.anderson.aluraoopclasses.Interfaces.Salable;

public class Service
    implements
        Salable
{
    private int id;
    private String name;
    private double price;

    @Override
    public double calculatePriceByQuantity( int quantity )
    {
        if ( quantity < 2 )
        {
            return this.price;
        }
        else
        {
            return ( this.price * 0.90 );
        }
    }
}
