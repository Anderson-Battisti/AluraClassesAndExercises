package listsanddatacollections;

import listsanddatacollections.interfaces.Shape;
import listsanddatacollections.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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

        // Exercise 3
        List<String> items = new ArrayList<>();
        items.add( "Watermelon" );
        items.add( "Banana" );
        items.add( "Orange" );
        items.add( "Grape" );
        items.add( "Pear" );

        for ( String item : items )
        {
            System.out.println( item );
        }


        Dog dog = new Dog();
        if ( dog instanceof Animal)
        {
            Animal animal = dog;
            animal.makeNoise();
        }

        List<Product> products1 = new ArrayList<>();
        products1.add( new Product( "Orange", 2.5 ) );
        products1.add( new Product( "Pear",   5.6 ) );
        products1.add( new Product( "Grape",  8.3 ) );
        products1.add( new Product( "Banana", 1.5 ) );

        double sumOfPrices = 0;

        for ( Product product : products1 )
        {
            sumOfPrices += product.getPrice();
        }

        System.out.println( "Average of the prices in the list: " + ( sumOfPrices / products1.size() ) );

        List<Shape> shapes =  new ArrayList<>();
        shapes.add( new Circle( 6.4 ) );
        shapes.add( new Square( 3.7 ) );

        for ( Shape shape : shapes )
        {
            System.out.printf( "The area of this shape is: %.2f m²\n", shape.calculateArea() );
        }

        // Exercise 4

        List<Integer> numbers = new ArrayList<>();
        numbers.add( 54 );
        numbers.add( 104 );
        numbers.add( 69 );
        numbers.add( 12 );
        numbers.add( 29 );
        System.out.println( "Before sort: " + numbers );
        Collections.sort( numbers );
        System.out.println( "After sort: " + numbers );

        List<Title> titles = new ArrayList<>();
        titles.add( new Title( "Test" ) );
        titles.add( new Title( "Jessica" ) );
        titles.add( new Title( "Romeu" ) );
        titles.add( new Title( "Anderson" ) );
        System.out.println( "Before sort: " + titles );
        Collections.sort( titles );
        System.out.println( "After sort: " + titles );

        List<String> strings = new ArrayList<>();

        strings.add( "Banana" );
        strings.add( "Orange" );
        strings.add( "Grape" );

        strings = new LinkedList<>(strings);
        System.out.println( strings );
    }
}
