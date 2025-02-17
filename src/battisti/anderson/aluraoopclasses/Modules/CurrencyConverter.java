package battisti.anderson.aluraoopclasses.Modules;

import battisti.anderson.aluraoopclasses.Interfaces.FinancialConverter;

public class CurrencyConverter
    implements
        FinancialConverter
{
    private double dolarPrice;

    public void setDolarPrice( double dolarPrice )
    {
        this.dolarPrice = dolarPrice;
    }

    public double getDolarPrice()
    {
        return this.dolarPrice;
    }

    @Override
    public double convertDolarToReal( double dolarAmount )
    {
        return dolarAmount * dolarPrice;
    }
}
