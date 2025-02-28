package battisti.anderson.listsanddatacollections.modulefinalproject;

import battisti.anderson.listsanddatacollections.modulefinalproject.model.CreditCard;
import battisti.anderson.listsanddatacollections.modulefinalproject.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainFinalProject
{
    public static void main( String[] args )
    {
        List<Product> products = new ArrayList<>();
        CreditCard    myCard   = new CreditCard( 200 );
        Scanner       scanner  = new Scanner( System.in );

        int userChoice = 1;

        while ( userChoice != 0)
        {
            System.out.println( "Write the product's name: " );
            String name = scanner.nextLine();

            System.out.println( "Write the product's price: " );
            double price = scanner.nextDouble();
            scanner.nextLine();

            if ( myCard.getCreditLimit() >= price )
            {
                products.add( new  Product( name, price ) );
                myCard.setCreditLimit( myCard.getCreditLimit() - price );
                System.out.println( "\nThe product has been added to the list." );
                System.out.println( "Current credit limit is " + myCard.getCreditLimit() );
            }

            else
            {
                System.out.println( "Limit: " + myCard.getCreditLimit() );
                System.out.println( "The credit limit is insuficient for this purchase!" );
            }

            System.out.println( "\nDigite 0 para sair ou aperte qualquer tecla para continuar: " );
            String userInput = scanner.nextLine();

            userChoice = isInteger( userInput ) ? Integer.parseInt( userInput ) : 1;
        }

        Collections.sort( products );

        System.out.println( "\n\nPurchase finished!" );
        System.out.println( "Items bought: " +  products );
    }

    public static boolean isInteger( String text )
    {
        try
        {
            Integer.parseInt( text );
            return true;
        }
        catch ( NumberFormatException e )
        {
            return false;
        }
    }
}
