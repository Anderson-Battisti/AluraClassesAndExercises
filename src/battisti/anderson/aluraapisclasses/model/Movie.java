package battisti.anderson.aluraapisclasses.model;

public class Movie
{
    private String title;
    private String description;
    private int yearOfRelease;
    private String director;

    public Movie(String title, String description, int yearOfRelease, String director )
    {
        this.title = title;
        this.description = description;
        this.yearOfRelease = yearOfRelease;
        this.director = director;
    }
}
