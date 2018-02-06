import java.util.ArrayList;
import java.util.List;
public class CollegeArrayList
{
   public static void main( String[] args)
      {
         List<String> collegeList = new ArrayList<String>();
         
         
         collegeList.add("Berkeley");
         collegeList.add("UCLA");
         collegeList.add("San Los Obisbo");
         collegeList.add("TCUU");
         collegeList.add("Cornell");
         collegeList.add("UMass");
         collegeList.add("Army");
         collegeList.add("Navy");
         
         
         for(int index = 0; index < collegeList.size(); index++)
            {
               System.out.println(collegeList.get(index));
            }// print out the colleges list
            
         for(int index = 0; index < collegeList.size(); index++)
            {
               if(collegeList.get(index).length() == 4)
                  {
                     collegeList.remove(index);
                     index--;// needed to not skip an index
                  }// if statement to remove length 4
            }//remove colleges with length 4
            
         for(int index = 0; index < collegeList.size(); index++)
            {
               System.out.println(collegeList.get(index));
            
            }// print out colleges again    
     }// end main
}