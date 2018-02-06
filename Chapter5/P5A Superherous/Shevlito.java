import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shevlito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shevlito extends Baddies
{
    private int ballDamage;
    public Shevlito( String initialName, int initialHealth, int initialBallDamage)
    {
        super(initialName, initialHealth);
        ballDamage =  initialBallDamage;
    }
    public void throwBall()
    {
        // throws ball at current direction shevlito is facingf
    }
    public void act() 
    {
        
    }
}
