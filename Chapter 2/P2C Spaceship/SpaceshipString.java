public class SpaceshipString
    {
    private String output;
    private String name;
    private int x;
    private int y;
    private int randMove;
    public SpaceshipString(String initialName, int initialX, int initialY, int initialRandMove)
    {
        name = initialName;
        x = initialX;
        y = initialY;
        randMove = initialRandMove;
    }
    public String toString()
        {
            String output = new String();
            output = "Name: " + name+  "Coords: " + "(" + x + ", " + y + " )" + "Speed: " + randMove;
            return output;
        }
    }