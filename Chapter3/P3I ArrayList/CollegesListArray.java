import java.util.List;
import java.util.ArrayList; 
public class CollegesListArray
{
   public static void main(String[] args)
      {
       ArrayList<String> colleges = new ArrayList<String>();
       colleges.add("San Los Ibisbo");
       colleges.add("Berkeley");
       colleges.add("UCLA");
       for( int index = 0; index < colleges.size() ; index++)
         {
             if (colleges.get(index) != null)
               {
                  System.out.println(colleges.get(index));
               }
         }
       System.out.println(colleges);
       colleges.remove(0);
       colleges.add(1, "San Los Obisbo");
       System.out.println(colleges);
      }
}