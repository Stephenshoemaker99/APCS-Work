public class WaterMan extends Superhero
{
    private int waterVolume;
    public WaterMan(String initialName, int initialWaterVolume)
    {
        super(initialName);
        waterVolume = 10;
    }
    
    public void increaseWaterVolume(int changeInWaterVolume)
    {
        waterVolume += changeInWaterVolume;
    }
    
    public String getMotto()
    {
        String output = new String();
        output = "Shlurp";
        return output;
    }
    public void act()
    {
       
    }
}