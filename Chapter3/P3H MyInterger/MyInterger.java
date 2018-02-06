public class MyInterger
{
   private int num;
   public MyInterger()
      {
         num = 0;
      } // 0 arg constructor
   public MyInterger( int initialNum)
      {
         num = initialNum;
      }// 1 arg constructor
   public int calculateSum()
      {
         int length = 0;
         double numTemp = num;
         int sum = 0;
         while(numTemp % 10 >= 1 )
            {
               numTemp /=  10;
               length++;
            }// calculates length of number
         
         if(num == 0)
            {
               length = 1;
            }// sets the length to 1 if number is 0
         System.out.println(length);
         int[] array = new int[length];
         for( int index = 0; index < array.length; index ++)
            {
            array[index] = (num / (int) Math.pow(10, array.length - index - 1)) - (10*(num / (int) Math.pow(10, array.length - index)));
            //System.out.println("index " + index + ": " + array[index]);
            sum += array[index]; 
            }
         System.out.println(sum);
         return sum;
         
      }
   public String toString()
      {
         String output = new String("Number: " + num); 
         return output;
      }
}