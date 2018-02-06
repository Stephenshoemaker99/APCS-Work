import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1);
        double xStart = 0;
        double yStart = 0;
        double xDest = 900;
        double yDest = 900;
        addObject( new Spaceship("S.S. Shoe", xDest , yDest , xStart, yStart, 10 ), (int)  xStart, (int) yStart);
    } 
    
}
