public class ArtistString
   {
   public static void main( String[] arg)
      {
      String[] artists = new String[4];
      artists[0] = new String("Queen");
      artists[1] = new String("Eminem"); 
      artists[1] = null;// null does not work beacause you can not make a string out of nothing, 
      //null is an empty thing ,there is nothing there not even an empty string
      
      artists[2] = new String("Coldplay");
      artists[3] = new String("The Killers");
      for( int index = 0; index < artists.length; index++)
        {
          System.out.println( artists[index]);
        }//end for loop
        
      for( int index = 0; index < artists.length; index++)
         {
             if (!artists[index].equals("Queen"))
                {
                   System.out.println("Queen was not found");
                } 
                else
                {
                   System.out.println("We found Queen");
                }// end if else statement  
         }//end for loop
      }
    }
    