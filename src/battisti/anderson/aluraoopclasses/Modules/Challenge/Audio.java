package battisti.anderson.aluraoopclasses.Modules.Challenge;

import battisti.anderson.aluraoopclasses.Interfaces.Challenge.Classification;

import java.time.Duration;

public class Audio
        implements
            Classification
{
    private String title;
    private Duration duration;
    private int likes;
    private int numberOfReproductions;

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setDuration(Duration duration)
    {
        this.duration = duration;
    }

    public Duration getDuration()
    {
        return this.duration;
    }

    public void addLike()
    {
        this.likes++;
    }

    public int getLikes()
    {
        return this.likes;
    }

    public void addReproduction()
    {
        this.numberOfReproductions++;
    }

    public int getNumberOfReproductions()
    {
        return this.numberOfReproductions;
    }

    @Override
    public int getClassification()
    {
        if ( this.likes == 0 )
        {
            return 0;
        }
        else if ( this.likes > 0 && this.likes < 50 )
        {
            return 5;
        }
        else
        {
            return 10;
        }
    }
}
