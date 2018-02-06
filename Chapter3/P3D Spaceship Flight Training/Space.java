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
        super(800, 600, 1);
        Destination initialDestination = new Destination(800,0);
        Spaceship spaceship = new Spaceship("S.S. Shoe", 10, initialDestination);
        initialDestination.identifySpaceship(spaceship);
        addObject(spaceship, 0, 0);
        addObject(initialDestination, 800, 0);
    }
}

