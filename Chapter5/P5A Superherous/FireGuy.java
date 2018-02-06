public class FireGuy extends Superhero
{
    private int heat;
    public FireGuy( String initialName, int initialHeat)
    {
        super(initialName);
        heat = initialHeat;
    }
    public String getHeat()
    {
        return new String("It's " + heat + " degrees");
    }
    public String getMotto()
    {
        return new String("Crispy");
    }
    public void act()
    {
    }
}
