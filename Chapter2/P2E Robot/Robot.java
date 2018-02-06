import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private int speed;
    private double battery;
    private double direction;
    private int ctrBattery;
    
    Robot(int initialSpeed, double initialBattery, double initialDirection)
    {
        speed =  initialSpeed;
        battery = initialBattery;
        direction = initialDirection;
        ctrBattery = 0;
    }
    public String toString()
    {
        String output =  new String();
        output = "Speed: " + speed + "\n" +
                 "Direction: " +  direction + "\n" +
                 "Battery Percent: " + battery + "\n";
        return output;
        
    }
    public void act() 
    {
        
        
        if (battery > 0)
            {
                move(speed);
                ctrBattery++;
            }// moves if there is still battery
        if (ctrBattery == 3)
            {
               battery -= .01; 
               ctrBattery = 0;
            } // lowers battery
        System.out.println(toString());
    }    
}
