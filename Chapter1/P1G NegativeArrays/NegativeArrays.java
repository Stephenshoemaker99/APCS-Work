public class NegativeArrays{
   public static void main( String[] arg)
   {
      int[] nums = new int[10];
      for(int index= 0; index<nums.length; index++)
      {
         double neg = Math.random();
         if(neg >= 0.5)
         {
            neg= -1;
         } 
         else{
            neg = 1;
         }//end if else statement
         int num = (int) Math.floor(Math.random() * 101 * neg);
         nums[index] = num;
      }// end for loop
      
      int index = 0;
      while( index < nums.length) 
      {
         System.out.println( nums[index]);
         index++;
      }// end while loop
      int count = 0;
      for(index = 0; index<nums.length; index++)
      {
         if( nums[index] > 0)
         {
            count++;
         }// end if statement
      }// end for loop
      
      for(index = 0; index<nums.length; index++)
      {
         nums[index] = nums[index] + 10;
      }// end for loop
      
      
      
      System.out.println("There are " + count + " Positive numbers");
   }
}