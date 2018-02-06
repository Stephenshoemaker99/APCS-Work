import java.util.*;
public class ArrayListObjects
{
   public static void main(String[] args )
   {
      List<Integer> nums = new ArrayList<Integer>();
      for(int index = 0; index < 10; index++)
      {
         nums.add(new Integer((index + 1) * 3));
      }
      
      for(int index = 0; index < nums.size(); index++)
      {
         System.out.println(nums.get(index));
      }
      
      for(int index = 0; index < nums.size(); index++)
      {
         if(nums.get(index) % 2 == 1)
         {
            nums.remove(index);
            index--;
         }
      }
      
      for(int index = 0; index < nums.size(); index++)
      {
         System.out.println(nums.get(index));
      }
   }
}