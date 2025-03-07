package battisti.anderson.aluraapisclasses;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileController
{
    private static FileController fileController;

    private FileController() {}

    public static FileController getInstance()
    {
        if ( fileController == null )
        {
            return new FileController();
        }

        return fileController;
    }

    public void createTextFile( String archiveName, String textToSave )
    {
        try ( FileWriter myTextFile = new FileWriter( archiveName + ".txt" ) )
        {
            myTextFile.write( textToSave );

            System.out.println( "Text file created successfully. Archive: " + archiveName + ".txt" );
        }
        catch ( IOException e )
        {
            System.out.println( e.getMessage() );
            e.printStackTrace();
        }
    }
}
