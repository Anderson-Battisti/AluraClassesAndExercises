package battisti.anderson.aluraoopclasses.Modules;

import battisti.anderson.aluraoopclasses.Interfaces.Calculable;

public class PhysicalProduct
    implements
        Calculable
{
    public String name;
    public double price;

    @Override
    public double calculateFinalPrice()
    {
        return ( this.price * 0.80 );
    }
}
