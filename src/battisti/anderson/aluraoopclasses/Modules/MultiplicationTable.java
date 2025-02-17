package battisti.anderson.aluraoopclasses.Modules;

import battisti.anderson.aluraoopclasses.Interfaces.MultiplicationTableInterface;

public class MultiplicationTable
        implements
            MultiplicationTableInterface
{
    public void showMultiplicationTable( int multiplier )
    {
        for ( int i = 1; i <= 10; i++ )
        {
            System.out.println( i + " x " + multiplier + " = " + ( i * multiplier ) );
        }
    }
}
