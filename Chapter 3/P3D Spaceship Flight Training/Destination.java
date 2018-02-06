import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the destination that the spaceship is always travelling towards
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Destination extends Actor
{
    private int x;
    private int y;
    private boolean justTurned = false;
    private boolean intersects;
    private Spaceship spaceship;
    private int ctr = 0;
    private boolean goingLeft = true;
    public Destination()
        {
            x = 0;
            y = 0;
        }
    
    public Destination (int initialX, int initialY)
        {
            x = initialX;
            y = initialY;
        }
    public void identifySpaceship( Spaceship initialSpaceship)
        {
        spaceship = initialSpaceship;
        }
    public int getX()
        {
            return x;
        }
    public int getY()
        {
            return y;
        }
    public boolean getIntersects()
        {
            return intersects;
        }
    public void setX( int newX)
        {
        x = newX;
        }
    public void setY( int newY)
        {    
         y = newY;
        } 
    public void act() 
        {
        intersects = intersects(spaceship);
        
        if (intersects && ctr % 2 == 0)
            {
            if(!justTurned)
                {
                System.out.println("turn 1" + ctr);
                setY( getY() + 1);
                justTurned = true;
                }
            else
                {
                System.out.println("turn 2" + ctr);
                if (goingLeft)
                    {
                    setX(0);
                    goingLeft = false;
                    }
                else
                    {
                    setX(800);
                    goingLeft =  true;
                    }
                justTurned = false;
                ctr++;
                }
        }
        ctr ++;
        setLocation(getX(), getY());
        //getWorld().showText( new String( "( " + getX() + ", " + getY() + ")"), getWorld().getWidth() /2, getWorld().getHeight()/2 );
       }    
}
