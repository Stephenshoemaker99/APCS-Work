import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Aeroplane extends Actor
{
    private int speed;
    private double altitude;
    private boolean stop;
    private String stopString;
    private String name;
    private int turnRand;
    Aeroplane()
        {
        speed = 0;
        altitude = 0.0;
        stop = false;
        name =  null;
        stopString = null;
        turnRand = 0;
        }
    Aeroplane( int initialSpeed, double initialAltitude, boolean initialStop, String initialName)
        {
            speed = initialSpeed;
            altitude = initialAltitude;
            stop = initialStop;
            name = initialName;
            stopString = new String("No");
            if(stop)
                {
                stopString = new String("Yes");
                }
            turnRand = 0;
        }
    public String toString()
        {
        String output = new String( "Name: " + name + "\n" +
                                        "Altitude: " + altitude + "\n" +
                                        "Speed: " + speed+ "\n" +
                                        "Non-Stop: " + stopString);
        return output;                               
        }
    public int speed()
            {
            return speed;
            }
    public void act() 
       {
       if (isAtEdge())
       {
           int x = getX();
           int y = getY();
           setLocation(1000 - x, 1000 - y);
           
                
       }
       turnRand= (int) Math.floor(Math.random() * 10) -5;
       move(speed());
       //speed = (int) Math.floor(Math.random() * 11);
       speed = 10;
       altitude = getY();
       
       turn(turnRand);
       String output = toString();
       getWorld().showText( output , 500, 500);
   
    }
}
