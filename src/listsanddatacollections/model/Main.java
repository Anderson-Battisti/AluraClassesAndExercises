package listsanddatacollections.model;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main ( String[] args )
    {
        //Exercise 1
        List<Person> people = new ArrayList<>();

        people.add( new Person( "Anderson", 24 ) );
        people.add( new Person( "Jessica",  21 ) );
        people.add( new Person( "Romeu",    63 ) );

        System.out.println( "Size of the list: " + people.size() );
        System.out.println( "First person of the list: " + people.getFirst() );
        System.out.println( people );


        // Exercise 2
        List<Product> products = new ArrayList<>();

        products.add( new Product( "Computer" ) );
        products.add( new Product( "Mouse" ) );
        products.add( new Product( "Television" ) );
        products.add( new Product( "Tablet" ) );
        products.add( new Product( "Smartphone" ) );

        System.out.println( "Size of the list: " + products.size() );
        System.out.println( "Random product of the list: " + products.get( 3 ) );

        PerishableProduct perishableProduct = new PerishableProduct( "Apple" );
        System.out.println( perishableProduct );
    }
}
