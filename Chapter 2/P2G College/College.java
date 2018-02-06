public class College
{
   public static void main( String[] arg)
   {
       String[] collegeList = new String[4];
       collegeList[0] = new String("San Los Obisbo");
       collegeList[1] = new String("UC");
       collegeList[2] = new String("Berkeley");
       collegeList[3] = new String("Rice");
       
       for (int index = 0; index < collegeList.length; index++)
       {
           System.out.println(collegeList[index]);
       }// end name for loop
       
       int min = 0;  
       for(int index = 0; index < collegeList.length; index++)
       {
          if(collegeList[index].length()< collegeList[min].length())
            {
               min = index;
            }//changes the min value to the new lowest value
       }// searches the index for smallest value
       
       System.out.println(collegeList[min]);
       collegeList[0] = null;
       
       for( int index = 0; index < collegeList.length; index++)
         {
            System.out.println(collegeList[index]);
         }// print out college names
       
       for( int index = 0; index < collegeList.length; index++)
         {
            if (collegeList[index] != null)
               {
                  System.out.println(collegeList[index].length());
               }// checks if the value is null
         }// prints out lengths of values
   }
}