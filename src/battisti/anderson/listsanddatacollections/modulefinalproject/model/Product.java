package battisti.anderson.listsanddatacollections.modulefinalproject.model;

public class Product
    implements
        Comparable<Product>
{
    private String name;
    private double price;

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo( Product product )
    {
        if ( this.price < product.price )
        {
            return -1;
        }
        else if ( this.price > product.price )
        {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString()
    {
        return this.name + " - R$" + this.price;
    }
}
