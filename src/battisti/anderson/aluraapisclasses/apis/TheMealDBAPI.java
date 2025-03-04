package battisti.anderson.aluraapisclasses.apis;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDBAPI
{
    private static HttpResponse<String> fetchData( String recipeName ) throws Exception
    {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                                         .uri( URI.create( "https://www.themealdb.com/api/json/v1/1/search.php?s=" + recipeName ) )
                                         .build();

        return client.send( request, HttpResponse.BodyHandlers.ofString() );
    }

    public static void makeRequest()
    {
        try
        {
            Scanner reader = new Scanner( System.in );

            System.out.println( "Enter a recipe to search for: " );
            String recipeName = reader.nextLine();

            System.out.println(  fetchData( recipeName ).body() );
        }

        catch ( Exception e )
        {
            System.out.println( "Recipe not found, try again: " + e.getMessage() );

            makeRequest();
        }
    }
}
