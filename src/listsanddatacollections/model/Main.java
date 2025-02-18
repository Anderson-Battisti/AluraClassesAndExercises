package listsanddatacollections.model;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main ( String[] args )
    {
        List<Person> people = new ArrayList<>();

        people.add( new Person( "Anderson", 24 ) );
        people.add( new Person( "Jessica",  21 ) );
        people.add( new Person( "Romeu",    63 ) );

        System.out.println( "Size of the list: " + people.size() );
        System.out.println( "First person of the list: " + people.getFirst() );
        System.out.println( people );
    }
}
