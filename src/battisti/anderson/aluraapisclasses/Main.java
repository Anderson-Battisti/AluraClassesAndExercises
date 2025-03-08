package battisti.anderson.aluraapisclasses;

import battisti.anderson.aluraapisclasses.apis.GitHubAPI;
import battisti.anderson.aluraapisclasses.apis.GoogleBooksAPI;
import battisti.anderson.aluraapisclasses.apis.TheMealDBAPI;
import battisti.anderson.aluraapisclasses.controllers.FileController;
import battisti.anderson.aluraapisclasses.model.Book;
import battisti.anderson.aluraapisclasses.model.Movie;
import battisti.anderson.aluraapisclasses.model.Person;
import battisti.anderson.aluraapisclasses.model.Vehicle;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main
{
    public static void main( String[] args )
    {
        //Class
        GoogleBooksAPI.makeRequest();
        TheMealDBAPI.makeRequest();


        //Exercise 1 and 2
        String jsonData = """
        {
            "name" : "Anderson",
            "age" : 25,
            "city": "Lajeado-RS"
        }
        """;

        Gson   gson   = new GsonBuilder().setPrettyPrinting().create();
        Person person = gson.fromJson( jsonData, Person.class );

        System.out.println( person );


        // Exercise 3
        String nestedJson = """
        {
            "title": "Battisti's Book",
            "author": "Anderson Battisti",
            "publisher": 
            {
                "name": "Famiglia Battisti",
                "city": "Trento-TN"
            }
        }        
        """;

        Gson nestedGson = new Gson();
        Book myBook     = nestedGson.fromJson( nestedJson, Book.class );

        System.out.println( myBook );


        // Exercise consuming GitHub API
        GitHubAPI.makeRequest();


        // Exercise creating and writing a text file (module 4 exercise 1)
        FileController.getInstance().createTextFile( "archive", "Content to be saved in the file" );

        // Module 4 exercise 2 and 3
        Movie HarryPotter1 = new Movie ( "Harry Potter 1", "The first movie of the Harry Potter saga", 2001, "Chris Columbus" );
        String HarryPotterJson = gson.toJson( HarryPotter1 );
        System.out.println( HarryPotterJson );

        // Module 4 exercise 4
        Vehicle car = new Vehicle( "Car", 2013, "Gray", "This is a gray car released in 2013" );
        String carJson = gson.toJson( car );
        System.out.println( carJson );
    }
}
