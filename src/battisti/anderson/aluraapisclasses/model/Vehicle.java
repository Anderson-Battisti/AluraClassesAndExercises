package battisti.anderson.aluraapisclasses.model;

public class Vehicle
{
    private String type;
    private int yearOfRelease;
    private String color;
    private String description;

    public Vehicle( String type, int yearOfRelease, String color, String description )
    {
        this.type = type;
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.description = description;
    }
}
