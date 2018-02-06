public class CollegeShoemaker
{
   public static void main( String[] args)
   {
      String[] westCoastColleges = new String[7];
      String[] eastCoastColleges = new String[7];
      String[] myCollegeChoice;// initializing arrays, my college does not have a length yet
      
      int length = 0;
      if(westCoastColleges.length < eastCoastColleges.length)
         {
            length = eastCoastColleges.length;
         }// sets length to higher length
      else
         {
            length = westCoastColleges.length;
         }// else statement to assign length
      myCollegeChoice = new String[length];// assigning length based on length of college lists
      
      
      westCoastColleges[0] = null;
      westCoastColleges[1] = new String("S");
      westCoastColleges[2] = null;
      westCoastColleges[3] = new String("Gonzaga");
      westCoastColleges[4] = new String("Oregon");
      westCoastColleges[5] = null;
      westCoastColleges[6] = new String("UCSD");
      
      eastCoastColleges[0] = null;
      eastCoastColleges[1] = new String("MIT");
      eastCoastColleges[2] = new String("Fordham");
      eastCoastColleges[3] = null;
      eastCoastColleges[4] = new String("Harvard");
      eastCoastColleges[5] = null;
      eastCoastColleges[6] = new String("Penn");
      
      for (int index = 0; index < myCollegeChoice.length ; index++)// loop to determine which schools go in final list
         {
            if( eastCoastColleges[index] != null && westCoastColleges[index] != null)// checking to make sure neither are null
            {
               if( eastCoastColleges[index].length() > westCoastColleges[index].length())
                  {
                   myCollegeChoice[index] = westCoastColleges[index];
                  }// checking to see if West is smaller
               else
                  {
                  if( westCoastColleges[index].length() > eastCoastColleges[index].length())
                     {
                        myCollegeChoice[index] = eastCoastColleges[index];
                     }// checking to see if east is smaller
                  else
                     {
                        if (Math.random() >.5)// randomly determining college
                        {
                           myCollegeChoice[index] = westCoastColleges[index];
                        }// end if statement to determine randomness
                        else
                        {
                           myCollegeChoice[index] = eastCoastColleges[index];
                        }// else statement from randomness
                     }// end else statement for when neither west or east is bigger
                  }// end of else statement for when west is larger
            }
            else
            {
               if(eastCoastColleges[index] == null && westCoastColleges[index] != null)
               {
                  myCollegeChoice[index] = westCoastColleges[index];
               }//end of if statement that determines if east is null and west isnt
               else
               {
                  if(eastCoastColleges[index] != null && westCoastColleges[index] == null)
                  {
                     myCollegeChoice[index] = eastCoastColleges[index];
                  }// end of if statement when east is null and west is null
                  else
                  {
                     myCollegeChoice[index] = new String("meditate under a tree for a year");
                  }// end of else statement if both west and east are null
               }// end of else statement for when east is not null or when west is null
            }// end of else statement if one of the entries is null
      }// end of for loop to determine which college goes in myCollegeChoice
      
      System.out.println("index\tWest Coast Colleges\tEast Coast Colleges\t My College Choice");  
      for (int index = 0; index < myCollegeChoice.length; index++)
      {   
         System.out.println(index + "\t" + westCoastColleges[index] + "\t" + eastCoastColleges[index] + "\t" + myCollegeChoice[index]);
      }// printing out final myCollegeChoice 
   }
}