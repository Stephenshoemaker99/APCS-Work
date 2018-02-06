public class IntArray
   {
   public static void main(String[] arg)
      {
       int[] array = new int[10];
       array[0] = -9;
       array[1] = 2;
       array[2] = 3;
       array[3] = 4;
       array[4] = 7;
       array[5] = 9;
       array[6] = 10;
       array[7] = 23;
       array[8] = 45;
       array[9] = 67;
       int search = 99;
       int searchIndex = -1;
       for ( int index = 0; index < array.length; index++)
         {
         if (array[index] == search)
            {
             searchIndex = index;
            }
         }
       System.out.println(searchIndex);
      }
   }
