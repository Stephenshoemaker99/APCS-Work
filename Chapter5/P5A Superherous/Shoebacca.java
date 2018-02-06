import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shoebacca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shoebacca extends Baddies
{
    private int slapDamage;
    private boolean isUnderwater;
    public Shoebacca(String initialName, int initialHealth, int initialSlapDamage, boolean initialIsUnderwater)
    {
        super(initialName, initialHealth);
        slapDamage = initialSlapDamage;
        isUnderwater = initialIsUnderwater;
    }
    public void toggleUnderwater()
    {
        isUnderwater = !isUnderwater;
    }
    public void Slap( Character character)
    {
        //
    }
    
    public void act() 
    {

    }    
}
