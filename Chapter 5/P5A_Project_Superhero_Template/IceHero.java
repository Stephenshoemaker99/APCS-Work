public class IceHero extends Superhero
{
    private int iceVolume;
    public IceHero( String initialName, int initialIceVolume)
    {
        super(initialName);
        iceVolume = initialIceVolume;
    }
    public int getIceVolume()
    {
        return iceVolume;
    }
    public String getMotto()
    {
        return new String("Ice to meet you");
    }
}
