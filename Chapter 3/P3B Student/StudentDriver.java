public class StudentDriver
{
   public static void main( String[] arg)
   {
      String firstName = new String("Joe");
      String lastName = new String("Senior");
      int gradYear = 2018;
      double english = 4.0;
      double math = 4.0;
      double science = 4.0;
      double fineArts = 4.0;
      double socialScience = 4.0;// initial variables

      Student joe = new Student( firstName, lastName, gradYear,
                                english, math, science, fineArts, socialScience);// creating Joe
      
      System.out.println( joe.toString());
      System.out.println(joe.getMath());
      joe.setMath(4);
      System.out.println(joe.calcGpa());
      System.out.println(joe.toString());
   }
}