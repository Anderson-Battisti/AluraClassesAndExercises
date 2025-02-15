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

/*
    GENERAL ANNOTATIONS

    The access modifier "PROTECTED" allows a subclasses to access the attributes from
    its mother class AND this access modifier allows to classes in the same package to access it.
 */
