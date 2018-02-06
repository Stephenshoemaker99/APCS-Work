import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
        String name = new String ("S.S. Shoe");
        int randMove = (int) Math.floor(Math.random() * 10);
        int randTurn = (int) (Math.floor(Math.random() * 10) -5);
        if (isAtEdge())
        {
            randTurn= (int) (Math.floor(Math.random() * 180) - 90);
        }// Add your action code here.
        move(randMove);
        turn(randTurn);
        
        int x = getX();
        int y = getY();
        String output = new SpaceshipString(name, x, y, randMove).toString();
        getWorld().showText( output , 250, 250);
        
    }
    
}

