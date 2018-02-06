public class Student
{
   private String fName;
   private String lName;
   private int gradYear;
   private double[] grades;
   private double gpa;
   
   public Student()
   {
      grades = new double[5];
      fName = null;
      lName= null;
      gradYear = 0;
      grades[0] = 0;
      grades[1] = 0;
      grades[2] = 0;
      grades[3] = 3;
      grades[4] = 4;
      grades[5] = 5;
      gpa = calcGpa();
   }// empty constructior
   public Student ( String initialFName, String initialLName, int initialGradYear, 
                  double initialEnglish, double initialMath, double initialScience, double initialFineArts, double initialSocialScience)
   {
      grades = new double[5];
      fName = initialFName;
      lName = initialLName;
      gradYear = initialGradYear;
      grades[0] = initialEnglish;
      grades[1] = initialMath;
      grades[2] = initialScience;
      grades[3] = initialFineArts;
      grades[4] = initialSocialScience;
      gpa = calcGpa();
   }//end four string constructor
   
   public double calcGpa()
      {
         double sum = 0;
         for(int index = 0; index < grades.length; index++)
            {
             sum += grades[index];
            }
         gpa = sum / grades.length;
         return gpa;
      }
   public double getGpa()
      {
       return gpa;
      }
   public void setGpa(double newGpa)
      {
      gpa = newGpa;
      }
   public double getMath()
      {
      return grades[1];
      }
   public void setMath(double newMath)
      {
       grades[1] = newMath;
      }
   public String toString()
   {
     String output = new String();
     output = fName + " " + lName + " is graduating in " + gradYear + " with a cumulative gpa of "+ gpa + ".";
     return output;
   }//end toString
}