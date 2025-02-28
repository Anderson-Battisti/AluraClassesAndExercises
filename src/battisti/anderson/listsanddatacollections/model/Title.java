package battisti.anderson.listsanddatacollections.model;

public class Title
    implements
        Comparable<Title>
{
    private String name;

    public Title( String name )
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public int compareTo( Title title )
    {
        return this.name.compareTo( title.name );
    }
}
