package listsanddatacollections.model;

import listsanddatacollections.interfaces.Shape;

public class Circle
    implements
        Shape
{
    private double circleRadius;

    public Circle( double circleRadius )
    {
        this.circleRadius = circleRadius;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI * Math.pow( circleRadius, 2 );
    }
}
