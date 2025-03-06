package battisti.anderson.aluraapisclasses.apis;

import battisti.anderson.aluraapisclasses.exceptions.UserNotFoundException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GitHubAPI
{
    private static HttpResponse<String> fetchGitHubUser( String gitHubUsername ) throws Exception
    {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                                         .uri( URI.create( "https://api.github.com/users/" + prepareUserInput( gitHubUsername ) ) )
                                         .build();

        return client.send( request, HttpResponse.BodyHandlers.ofString() );
    }

    public static void makeRequest()
    {
        Scanner usernameReader = new Scanner( System.in );

        System.out.println( "Enter a user's name to search in github: " );

        String gitHubUsername = usernameReader.nextLine();

        try
        {
            HttpResponse response = fetchGitHubUser( gitHubUsername );

            if ( response.statusCode() == 404 )
            {
                throw new UserNotFoundException( "User not found!" );
            }

            System.out.println( response.body() );
        }

        catch ( UserNotFoundException userNotFoundException )
        {
            System.out.println( "The user was not found, try again. Error message: " + userNotFoundException.getMessage() );

            userNotFoundException.printStackTrace();
        }

        catch ( Exception ex )
        {
            System.out.println( "Something went wrong, try again. Error message: " + ex.getMessage() );

            ex.printStackTrace();
        }
    }

    public static String prepareUserInput( String gitHubUsername )
    {
        return gitHubUsername.replace( " ", "+" );
    }
}
