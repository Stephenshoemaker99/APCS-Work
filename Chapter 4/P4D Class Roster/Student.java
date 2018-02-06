public class Student
{
   private String fName;
   private String lName;
   private int gradYear;
   private double[] grades;
   private double gpa;
   private double english;
   private double math;
   private double science;
   private double fineArts;
   private double socialScience;
   
   
   public Student()
   {
      fName = null;
      lName= null;
      gradYear = 0;
      english = 0;
      math = 0;
      science = 0;
      fineArts = 0;
      socialScience = 0;   
      gpa = calcGpa();
   }// empty constructior
   public Student ( String initialFName, String initialLName, int initialGradYear, 
                  double initialEnglish, double initialMath, double initialScience, double initialFineArts, double initialSocialScience)
   {
      fName = initialFName;
      lName = initialLName;
      gradYear = initialGradYear;
      english = initialEnglish;
      math = initialMath;
      science = initialScience;
      fineArts = initialFineArts;
      socialScience = initialSocialScience;
      gpa = calcGpa();
   }//end four string constructor
   
   
   
   public double[] setGrades()
      {
         double[] grades = new double[5];
         grades[0] = english;
         grades[1] = math;
         grades[2] = science;
         grades[3] = fineArts;
         grades[4] = socialScience;
         return grades;
      }
   public double calcGpa()
      {
         double[] grades = setGrades();
         System.out.println(grades);
         double sum = 0;
         for(int index = 0; index < grades.length; index++)
            {
             sum += grades[index];
             System.out.println(index);
            }
         gpa = sum / grades.length;
         return gpa;
      }
   public double getGpa()
      {
         calcGpa();
         return gpa;
      }
   public void setGpa(double newGpa)
      {
      gpa = newGpa;
      }
   public double getMath()
      {
      return math;
      }
   public void setMath(double newMath)
      {
       math = newMath;
      }
   public String getLName()
      {
         return lName;
      }
   public String toString()
   {
     String output = new String();
     output = fName + " " + lName + " is graduating in " + gradYear + " with a cumulative gpa of "+ gpa + ".";
     return output;
   }//end toString
}