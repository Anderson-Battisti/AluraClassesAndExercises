package battisti.anderson.aluraapisclasses.model;

public record Book( String title, String author, Publisher publisher )
{
    @Override
    public String toString()
    {
        return "Book: " + title + ", Author: " + author + ", Publisher: " + publisher;
    }
}
