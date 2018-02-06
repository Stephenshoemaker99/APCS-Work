import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Warehouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warehouse extends World
{

    /**
     * Constructor for objects of class Warehouse.
     * 
     */
    public Warehouse()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject( new Robot( 4 , 1, 90), 0, 0);
        
    }
}
