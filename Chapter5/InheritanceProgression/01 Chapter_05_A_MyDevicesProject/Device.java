public abstract class Device
{
    private String color;
    private int memory;
    public Device()
    {
        color = "Black";
        memory = 16;
    }
    public Device(String newColor, int newMemory)
    {
        color = newColor;
        memory = newMemory;
    }
    public String getColor()
    {
        return color;
    }
    public int getMemory()
    {
        return memory;
    }
    public abstract String ToString();
}