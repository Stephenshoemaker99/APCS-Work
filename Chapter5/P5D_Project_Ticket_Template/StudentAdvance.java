public class StudentAdvance extends Advance
   {
       public StudentAdvance(int days)
       {
           super(days);
       }
       public double getPrice()
       {
           return super.getPrice() / 2;
       }
       public String toString()
       {
           String output = new String();
           output += super.toString() + "\n" +
                     "Student ID Required";
           return output;
       }
       
   } // end class StudentAdvance
