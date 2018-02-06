public class HiddenWord
   {
   private String word;
   
   public HiddenWord( String initialWord )
      {
      word = new String( initialWord );    
      } // end one-arg constructor
       
      
   public String getHint( String guess )  
      {
       String output;
       if( guess.compareTo(word) == 0)
       {
          return word;
       }
       else
       {
          output = "";
          for( int index = 0; index < guess.length(); index ++)
          {
             
            if(word.substring(index, index + 1).compareTo(guess.substring(index, index + 1)) == 0)
            {
                output += word.substring(index, index + 1);
            }
            else
            {
              boolean isThere = false;
              for(int ctr = 0; ctr < guess.length(); ctr++)
              {
                 if(guess.substring(index, index + 1).compareTo(word.substring(ctr, ctr + 1)) == 0)
                 {
                    if(!isThere)
                    {
                       isThere = true;
                       output += "+";
                    }
                 }
              }
              if(!isThere)
              {
                 output+= "*";
              }
            }
          }
          return output;
       }
      } // end method getHint
      
   public String toString()
      {
      return word;   
      } // end method toString
   } // end class HiddenWord