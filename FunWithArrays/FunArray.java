public class FunArray
   {
   public static void main( String[] args)
      {
      //1. Create an array of ints cap 10
      int array[] = new int[10];
      
      //2. populate the array with even numbers beginning with 0
      // using a for loop
      int num;//number used in for loop
      for( int index = 0; index<array.length; index++ )
         {
            num = (int) (Math.floor(Math.random() * 10) * 2);
            array[index] = num;
            if (index == 0)
               {
               array[index] = 0;
               }
         }//close for loop
      
      //3. print the array
      for( int index = 0; index<array.length; index++)
         {
         System.out.println(array[index]);
         }// end print for loop
      //4. beginning with element 1, replace each number in the array with
      // the sum of value of current index and the pervius index
      // for example if the array is initially o 2 4 6etc.,
      System.out.println("Printing sum of current and previus indices..");
      System.out.print( 0 + ", \t");
      int sum = 0;// the sum value
      for ( int index = 1; index<array.length; index++)
         {
         sum = array[index] + array[index -1];
         System.out.print( sum + ", \t" );
         }//end for loop
      //5. beginning with element 0,
      //replace current value with the value of the sum of the current index and the next index
      for (int index = 0; index<(array.length-1); index++)
         {
         array[index] += array[index+1];
         }// end for loop
      //6. printout current array after array alements have been changed
      for (int index = 0; index<array.length; index++)
         {
         System.out.println(array[index]);
         }//end for loop
      }// end main
   }