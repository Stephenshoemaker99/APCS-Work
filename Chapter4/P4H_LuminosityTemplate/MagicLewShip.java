import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

public class MagicLewShip extends Actor
   {
   private String name;
   private int speed;
   private List<Star> starData;

   public MagicLewShip()
      {
      name = null;
      speed = 0;
      starData = new ArrayList<Star>();
      
      } // zero-arg

   public MagicLewShip( String initialName, int initialSpeed )
      {
      name = new String( initialName );
      speed = initialSpeed;
      starData = new ArrayList<Star>();
      } // end two-arg constructor

      
   public double calcAverageLuminosity()
      {
      starData = getWorld().getObjects( Star.class ); 
      double averageLuminosity = 0.0;
      double sum = 0;
      for( int index = 0; index < starData.size(); index++ )
         {
         if( starData.get( 
         index ) != null )
            {
            getWorld().showText( "Data in the ArrayList", getWorld().getWidth()/2, 100 );    
            getWorld().showText( starData.get( index ).getLuminosityAsString() , getWorld().getWidth()/2, 100 + 20*(index+1) );
            sum += starData.get(index).getLuminosity(); 
            } // end if
         } // end for
      averageLuminosity = sum/starData.size();
      return averageLuminosity;      
      } // end method calcAverageLuminosity
      
   public int getMaxLuminosity()
      {
      int maxLuminosity;
      starData = getWorld().getObjects( Star.class ); 
      if(starData.size()!=0)
      {
          System.out.println(starData.get(0).getLuminosity());
          maxLuminosity = starData.get(0).getLuminosity();
          for(Star star: starData)
          {
          if(star.getLuminosity() > maxLuminosity)
          {
              maxLuminosity = star.getLuminosity();
          }
        }
      }
      else
      {
          maxLuminosity = 0;
      }
      
      return maxLuminosity;      
      } // end method getMinLuminosity
      
   public void act()
      {
      getWorld().showText( "Coordinates: " + getX() + ", " + getY(), 
                           getWorld().getWidth()/2, 
                           getWorld().getHeight() - 300 );
                           
      getWorld().showText( "Average Luminosity: " + calcAverageLuminosity(), 
                           getWorld().getWidth()/2, 
                           getWorld().getHeight() - 200 );

      getWorld().showText( "Maximum Luminosity: " + getMaxLuminosity(), 
                           getWorld().getWidth()/2, 
                           getWorld().getHeight() - 100 );
      move(10);
      if( isAtEdge() )
         {
         turn( (int)(90 * Math.random() ) ); 
         } // end if
      } // end act


   public String toString()
      {
      return ( getX() + ", " + getY() );

      } // end toString

   } // end class Hero
  