package battisti.anderson.aluraoopclasses.Modules;

import battisti.anderson.aluraoopclasses.Interfaces.TemperatureConverter;

public class StandardTemperatureConverter
        implements
            TemperatureConverter
{
    @Override
    public double celsiusToFahrenheit( double celsius )
    {
        return ( celsius * ( 9/5 ) + 32 );
    }

    @Override
    public double fahrenheitToCelsius( double fahrenheit )
    {
        return ( ( fahrenheit - 32 ) * ( 5/9 ) );
    }
}
