package battisti.anderson.aluraoopclasses.Modules;

public class PersonAge
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge( int age )
    {
        this.age = age;
    }

    public void checkAdulthood()
    {
        if ( age >= 18 )
        {
            System.out.println( "Adulthood" );
        }

        else if ( age >= 0 && age < 18 )
        {
            System.out.println( "Not Adulthood" );
        }

        else
        {
            System.out.println( "Invalid Age" );
        }
    }
}
