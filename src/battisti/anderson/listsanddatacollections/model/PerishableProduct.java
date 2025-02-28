package battisti.anderson.listsanddatacollections.model;

import java.util.Date;

public class PerishableProduct
        extends
            Product
{
    private Date expirationDate;

    public PerishableProduct( String name )
    {
        super( name );
    }
}
