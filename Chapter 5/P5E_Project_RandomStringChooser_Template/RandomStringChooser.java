import java.util.*;

public class RandomStringChooser
   {
   private String[] wordList;
   public RandomStringChooser(String[] initialList)
   {
       wordList = initialList;
   }
   
   public String getNext()
   {
       boolean nullCheck =false;
       int index = 0;
       while(!nullCheck && index <wordList.length)
       {
           if(wordList[index] != null)
           {
               nullCheck = true;
           }
           index++;
       }
       if(!nullCheck)
       {
           return "NONE";
       }
       else
       {
           index = (int) Math.floor(Math.random()*wordList.length);
           while(wordList[index] == null)
           {
           index =(int) Math.floor(Math.random()*wordList.length);
           }
           String output = wordList[index];
           wordList[index] = null;
           return output;
       }
   }
   
   public String toString()
      {
      String output = new String();
      
      for( String word : wordList )
         {
         output += word + ", ";    
         } // end for
         
      return output;
      } // end method toString
   } // end RandomStringChooser