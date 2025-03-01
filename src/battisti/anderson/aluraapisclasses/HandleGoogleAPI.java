package battisti.anderson.aluraapisclasses;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpHandlers;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class HandleGoogleAPI
{
    private static HttpResponse<String> fetchBookData( String movieName ) throws Exception
    {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                                         .uri( URI.create( "https://www.googleapis.com/books/v1/volumes?q=" + movieName + "&key=AIzaSyDmihO5UfH7L-CT3xUo3zM65hrD5IdhLPk" ) )
                                         .build();

        return client.send( request, HttpResponse.BodyHandlers.ofString() );
    }

    public static void makeRequest()
    {
        try
        {
            Scanner reader = new Scanner( System.in );

            System.out.println( "Enter a book name to search for: " );

            String bookName = reader.nextLine();

            HttpResponse<String> response = fetchBookData( bookName );

            System.out.println( response.body() );
        }

        catch ( Exception e )
        {
            System.out.println( "Invalid input, try again - " + e.toString() );

            makeRequest();
        }
    }
}
