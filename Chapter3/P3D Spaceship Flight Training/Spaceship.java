import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
    private String name;
    private int speed;
    private Destination point;
    public Spaceship()
        {
         name = null;
         speed  = 0;
         point = new Destination(0,0);
        }
    public Spaceship( String initialName, int initialSpeed, Destination initialPoint)
        {
        name =  initialName;
        speed = initialSpeed;
        point = initialPoint;
        }
    public void turnTowards( Destination destination)
        {
            turnTowards(destination.getX(), destination.getY());
        }
    public void act() 
    {
       if(getWorld().getHeight() != getY())
         {
          turnTowards(point);
          move(speed);
         }
       if(getWorld().getHeight() == point.getY() - 1 && point.getIntersects())
          {
           setLocation(getWorld().getWidth()/2 , getWorld().getHeight()/2);
           getWorld().showText( "Mission Complete",getWorld().getHeight()/2 , getWorld().getHeight()/2);
           Greenfoot.stop();
          }
        
       
       
    }    
}
