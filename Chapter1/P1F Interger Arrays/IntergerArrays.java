public class IntergerArrays
{
   public static void main( String[] arg)
   {
      int[] ints = new int[10];
      for( int index = 0; index<ints.length; index++)
      {
         ints[index] = (int) Math.floor((Math.random() * 101));
      }//end for loop
      
      
      
      for( int index = 0; index<ints.length; index++)
      {
         System.out.print( ints[index] + " ");
      }//end for loop
      
      
      
      int sum = 0;
      for ( int index = 0;index<ints.length; index ++)
      {
         sum += ints[index];
      }//end for loop
      
      
      System.out.println();// making new line
      System.out.println(sum);
      for ( int index = (ints.length - 1); index >= 0; index--)
      {
         System.out.print( ints[index] +" "); 
      }//end for loop
   }  
}