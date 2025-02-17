package battisti.anderson.aluraoopclasses.Modules.Challenge;

import battisti.anderson.aluraoopclasses.Interfaces.Calculable;

public class Podcast
    extends Audio
{
    private String presenterName;

    @Override
    public int getClassification()
    {
        return this.getNumberOfReproductions() > 0 && this.getNumberOfReproductions() < 500 ? 5 :
               this.getNumberOfReproductions() >= 500 ? 8 :
               10;
    }
}
