package listsanddatacollections.model;

import listsanddatacollections.interfaces.Shape;

public class Square
    implements
        Shape
{
    private double size;

    public Square( double size )
    {
        this.size = size;
    }

    @Override
    public double calculateArea()
    {
        return size * size;
    }
}
