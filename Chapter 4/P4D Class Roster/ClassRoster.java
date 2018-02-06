import java.util.ArrayList;
import java.util.List;
public class ClassRoster
{
   private String courseName;
   private ArrayList<Student> students;
   public ClassRoster(String initialCourseName)
      {
         courseName = initialCourseName;
         for( int ctr = 0; ctr <5; ctr++)
         {
            students.add(new Student());
         }
      }
   public String studentWithMaxGpa()
      {
         int maxIndex = 0;
         for(int index = 0; index < students.size(); index++)
            {
               if( students.get(index).getGpa() >= students.get(maxIndex).getGpa())
                  {
                     maxIndex = index;
                  }
            }
         String output = students.get(maxIndex).getLName();
         return output;
      }
   public int dropStudent(double minGpa)
      {
         int dropCtr = 0;
         for( int index = 0; index<students.size(); index++)
            {
               if(students.get(index).getGpa() < minGpa)
                  {
                     students.remove(index);
                     index--;
                     dropCtr++;
                  }
            }
         return dropCtr;
      }
   public void addStudent( Student newStudent)
      {
         students.add(newStudent);
      }
   public void addStudent(  String fName,String lName,int gradYear,double english,double math,double science,double fineArts,double socialScience)
    {
       students.add( new Student( fName, lName, gradYear, english, math, science, fineArts, socialScience));
    }
}