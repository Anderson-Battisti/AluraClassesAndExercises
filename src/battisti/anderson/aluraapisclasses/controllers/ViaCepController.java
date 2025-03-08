package battisti.anderson.aluraapisclasses.controllers;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ViaCepController
{
    private static ViaCepController instance;

    private ViaCepController() {}

    public static ViaCepController getInstance()
    {
        if ( instance == null )
        {
            return new ViaCepController();
        }

        return instance;
    }

    public void saveCepDataInTextFile()
    {
        Scanner reader = new Scanner( System.in );

        String cep = "";

        while ( ! cep.equalsIgnoreCase( "exit" ) )
        {
            System.out.println( "\n Enter a CEP to save in the file (JSON format) or enter 'exit' to exit: " );
            cep = reader.nextLine();

            if ( cep.equalsIgnoreCase( "exit" ) )
            {
                break;
            }

            HttpResponse<String> response = fetchCepData( cep );

            if ( response != null )
            {
                if ( response.statusCode() == 200 && ! response.body().contains( "erro" ) )
                {
                    FileController.getInstance().saveCepJson( response.body() + "\n" );

                    System.out.println( "\n Cep saved successfully." );
                }

                else
                {
                    System.out.println( "\n Cep not found. try again." );
                }
            }

            else
            {
                System.out.println( "\n An error occured while fetching Cep data, try again." );
            }
        }

        System.out.println( "\n\n Cep query ended successfully." );
    }

    private HttpResponse<String> fetchCepData( String cep )
    {
        HttpClient  client  = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                                         .uri( URI.create( "https://viacep.com.br/ws/" + cep + "/json/" ) )
                                         .build();

        try
        {
            return client.send( request, HttpResponse.BodyHandlers.ofString() );
        }

        catch ( Exception e )
        {
            e.printStackTrace();
            return null;
        }
    }
}
