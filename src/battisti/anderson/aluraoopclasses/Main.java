package battisti.anderson.aluraoopclasses;

import battisti.anderson.aluraoopclasses.Modules.PersonAge;

public class Main
{
    public static void main(String[] args)
    {
        PersonAge personAge = new PersonAge();

        personAge.setAge( 15 );
        personAge.setName( "Anderson" );
        personAge.checkAdulthood();
    }
}
