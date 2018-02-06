import greenfoot.*;

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
   {
   private int luminosity;
   
   
   public Star()
      {
      luminosity = (int)(100* Math.random() );   
      } // end zero-arg constructo
        
   public void setLuminosity( int newLuminosity )
      {
      luminosity  = newLuminosity;   
      } // end method setLuminosity
   
   public int getLuminosity()
      {
      return luminosity;    
      } // end method getLuminosity
   
   public String getLuminosityAsString()
      {
      return "" + luminosity;    
      }
   
   public void act() 
      {
      getWorld().showText( getLuminosityAsString(), getX(), getY() );    
      turn(100);
      luminosity--;
      if( luminosity < 0 )
         {
         getWorld().removeObject( this );    
         } // end if
      } // end method act
   
   } // end class Star
