import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{


    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Shoebacca("Shoebacca", 1000, 10000, true), 400,200);
        addObject(new Shevlito("Shevlito", 1000,100), 100, 200);
        addObject(new WaterMan("Lew", 100), 300, 200);
    }
}
