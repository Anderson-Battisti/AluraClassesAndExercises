package battisti.anderson.aluraoopclasses.Modules.Challenge;

public class Song
        extends Audio
{
    private String albumName;
    private String artistName;

    public void setAlbumName( String albumName )
    {
        this.albumName = albumName;
    }

    public String getAlbumName()
    {
        return this.albumName;
    }

    public void setArtistName( String artistName )
    {
        this.artistName = artistName;
    }

    public String getArtistName()
    {
        return this.artistName;
    }

    @Override
    public int getClassification()
    {
        return this.getLikes() > 0 ? 10 : 0;
    }
}
