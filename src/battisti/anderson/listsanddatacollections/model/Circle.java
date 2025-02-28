package battisti.anderson.listsanddatacollections.model;

import battisti.anderson.listsanddatacollections.interfaces.Shape;

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
