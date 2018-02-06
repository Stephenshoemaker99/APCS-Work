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
    private double xDestination;
    private double yDestination;
    private int speed;
    private double startingX;
    private double startingY;
    private int oldX;
    private int oldY;
    Spaceship()
        {
        name  = null;
        xDestination = 0;
        yDestination = 0;
        speed = 0;
        startingX = 0;
        startingY= 0;
        }
    
    Spaceship( String initialName, double initialXDestination, double initialYDestination, double x, double y, int initialSpeed)
        {
        name = initialName;
        xDestination = initialXDestination;
        yDestination = initialYDestination;
        speed = initialSpeed;
        startingX = x;
        startingY = y;
        }
    
    public double calcTripDistance()
        {
        double distance =Math.sqrt( (( yDestination - getY() )* (yDestination - getY() ) ) + (xDestination - getX()) * (xDestination -getX() ));
        return distance;
        
        }
    public double calcTravelTime()
        {
        double travelTime = calcTripDistance() / speed;
        return travelTime;
        }
    
    public String toString()
        {
        String output = new String( "Name: " + name + "\n" +
                                    "Speed: " + speed + "\n" +
                                    "Destination: (" + xDestination + ", " + yDestination + ")");
        return output;
        }
   
    public void act() 
    {
        //int randMove = (int) Math.floor(Math.random() * 10);
        //int randTurn = (int) (Math.floor(Math.random() * 10) -5);
        int oldX = getX();
        int oldY= getY();
        int speed = 10;
        /*if (isAtEdge())
        {
            randTurn= (int) (Math.floor(Math.random() * 180) - 90);
        }*/
        //move(randMove);
        //turn(randTurn);
        turnTowards((int) xDestination, (int) yDestination);
        move(speed);
        int x = getX();
        int y = getY();
        getWorld().showText( "", oldX, oldY - 50);
        getWorld().showText( toString() , getX(), getY() - 50);
        getWorld().showText( "Distance to destination is: " + calcTripDistance() + " km",
                            getWorld().getWidth()/2, getWorld().getHeight() - 100 );
        getWorld().showText( "Time to destination is: " + calcTripDistance() + " seconds",
                            getWorld().getWidth()/2, getWorld().getHeight() - 50 );
        
    }
    
}

