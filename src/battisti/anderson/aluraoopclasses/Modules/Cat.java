package battisti.anderson.aluraoopclasses.Modules;

public class Cat
        extends
            Animal
{
    @Override
    public void makeSound()
    {
        System.out.println( "Meawing sound!" );
    }

    public void scratchFurniture()
    {
        System.out.println( "Scratching furniture!" );
    }
}
