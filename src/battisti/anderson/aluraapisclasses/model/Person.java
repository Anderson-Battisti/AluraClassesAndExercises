package battisti.anderson.aluraapisclasses.model;

public record Person( String name, int age, String city )
{
    @Override
    public String toString()
    {
        return "Person: Name: " + this.name + ", Age: " + this.age + ", City: " + this.city;
    }
}
