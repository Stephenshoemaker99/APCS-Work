public class Baseball
{
   public static void main( String[] args)
      {
      double[] average = new double[9];
      
      for (int index = 0; index< average.length; index++)
         {
         average[index] = Math.random()*.500;
         }// sets random batting average
         
      for (int index = 0; index<average.length; index++)
         {
         System.out.print(average[index] + "  ");
         }// prints out every value
      System.out.println();
      
      
      for (int index = 0; index<average.length; index++)
         {
         average[index]+=.02;   
         }// corrects batting averages
         
      for (int index = 0; index< average.length; index++)
         {
         System.out.print(average[index] + "  ");
         }// prints out corrected averages
      System.out.println();
      
      
      for (int index = average.length - 1; index>= 0; index--)
         {
         System.out.print(average[index] + "  ");
         }// prints out averages backwards
      System.out.println();
         
      double max = average[0];
      for ( int index = 0; index< average.length; index++)
         {
         if(average[index] > max)
            {
            max = average[index];
            }// creates new max
         }// interates to find new max
      System.out.println(max);// print new max
      }
}