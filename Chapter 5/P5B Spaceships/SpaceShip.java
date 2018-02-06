public class SpaceShip
{
    public String name;
    public int speed;
    public SpaceShip()
    {
        name = new String("Unnamed");
        speed = 0;
    }
    public SpaceShip(String initialName, int initialSpeed)
    {
        name = initialName;
        speed = initialSpeed;
    }
    
    public String toString()
    {
        String output = new String( "Spaceship: " + name + "\n" +
                                    "Speed: " + speed + "m/s");
        return output;
    }
}