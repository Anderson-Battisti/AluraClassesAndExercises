package listsanddatacollections.model;

public class Product
{
    String name;
    double price;
    int quantity;

    public Product(String name, double price )
    {
        this.name = name;
        this.price = price;
    }

    public Product( String name )
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}
