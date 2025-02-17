package battisti.anderson.aluraoopclasses;

import battisti.anderson.aluraoopclasses.Modules.MultiplicationTable;
import battisti.anderson.aluraoopclasses.Modules.PersonAge;

public class Main
{
    public static void main(String[] args)
    {
        PersonAge personAge = new PersonAge();

        personAge.setAge( 15 );
        personAge.setName( "Anderson" );
        personAge.checkAdulthood();

        MultiplicationTable multiplicationTable = new MultiplicationTable();

        multiplicationTable.showMultiplicationTable( 7 );
    }
}

/*
    GENERAL ANNOTATIONS

    The access modifier "PROTECTED" allows a subclasses to access the attributes from
    its mother class AND this access modifier allows the classes in the same package to access it.
 */
