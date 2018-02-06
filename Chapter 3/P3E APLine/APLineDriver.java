public class APLineDriver
{
   public static void main(String[] arg)
   {
      APLine line1= new APLine (5, 4, -17);
      double slope1 = line1.getSlope(); 
      System.out.println(slope1);// should be 1.25
      boolean onLine1 = line1.isOnLine(5, -2); 
      System.out.println(onLine1); // should be true
      
      APLine line2 = new APLine(-25, 40, 30);
      double slope2= line2.getSlope(); 
      System.out.println(slope2); // should be 0.625
      boolean onLine2= line2.isOnLine(5, -2); 
      System.out.println(onLine2); // false
   }
}
