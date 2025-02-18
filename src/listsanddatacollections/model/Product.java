package listsanddatacollections.model;

public class Product
{
    String name;
    double price;
    int quantity;

    public Product(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}
