package battisti.anderson.listsanddatacollections.model;

public class Dog
    extends
        Animal
{
    @Override
    public void makeNoise()
    {
        System.out.println( "Dog barking!" );
    }
}
