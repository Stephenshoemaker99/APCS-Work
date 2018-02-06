import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**

* Write a description of class Baddies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Baddies extends Actor implements Character
{
    private String name;
    private int health;
    public Baddies(String initialName, int initialHealth)
    {
        name = initialName;
        health = initialHealth;
    }
    /*public List<Superhero> findSuperheroes()
    {
        //return getNeighbors(1000, true, <Superhero>);
    }*/
    public void move()
    {
    }   
}