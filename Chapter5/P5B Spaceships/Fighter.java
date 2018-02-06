public class Fighter extends SpaceShip
{
    private String nation;
    public Fighter()
    {
        super();
        nation = new String("Unaligned");
    }
    public Fighter( String initialName, int initialSpeed, String initialNation)
    {
        super(initialName, initialSpeed);
        nation = initialNation;
    }
    public boolean isFriendly(String nationCheck)
    {
        boolean isFriendly = false;
        if(nationCheck.compareTo(nation) == 0)
        {
            isFriendly = true;
        }
        return isFriendly;
    }
    public String toString()
    {
        String output = new String( super.toString()  + "\n"
                                   + "Nation: " + nation);
        return output;
    }
}