import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int dimensionX = 750;
    int dimensionY = 750;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super (1000, 1000, 1);
        int ctr = 0;
        while(ctr<100 )
        {
            addObject( new Aeroplane( 10, 100, true, "PlaneymcPlaneyface" ), ctr*300, ctr *300);
            ctr++;
        }
        addObject(new Aeroplane(), 250, 250);
    }
}
