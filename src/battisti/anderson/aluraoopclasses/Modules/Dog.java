package battisti.anderson.aluraoopclasses.Modules;

public class Dog
    extends
        Animal
{
    @Override
    public void makeSound()
    {
        System.out.println( "Barking!" );
    }

    public void wagTail()
    {
        System.out.println( "Wagging the Tail!" );
    }
}
