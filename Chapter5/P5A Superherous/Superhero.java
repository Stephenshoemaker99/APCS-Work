import greenfoot.*;
public abstract class Superhero extends Actor implements Character
   {
   private String name;
   
   public Superhero( String initialName )
      {
      name = initialName;   
      } // end one-arg constructor
      
   public abstract String getMotto();
   } 