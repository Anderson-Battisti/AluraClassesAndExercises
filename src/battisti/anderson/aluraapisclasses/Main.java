package battisti.anderson.aluraapisclasses;

import battisti.anderson.aluraapisclasses.apis.GoogleBooksAPI;
import battisti.anderson.aluraapisclasses.apis.TheMealDBAPI;
import battisti.anderson.aluraapisclasses.model.Book;
import battisti.anderson.aluraapisclasses.model.Person;
import com.google.gson.Gson;

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

        Gson   gson   = new Gson();
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
    }
}
