package battisti.anderson.aluraapisclasses;

import battisti.anderson.aluraapisclasses.controllers.ViaCepController;

public class MainFinalProject
{
    public static void main( String[] args )
    {
        ViaCepController.getInstance().saveCepDataInTextFile();
    }
}
