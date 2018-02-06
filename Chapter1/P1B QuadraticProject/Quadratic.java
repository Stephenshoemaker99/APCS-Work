public class Quadratic
   {
   public static void main( String []arg)
      {
      //starting variables
      double a = 1;
      double b =3;
      double c =-15;
      //b^2
      double b2 = (b*b);
      // negative b
      double bNeg = -b;
      System.out.println(b2);
          
      // right side of inside the square root
      double preDesc = (4*(a*c));
      System.out.println(preDesc);
          
      //full inside of square root
      double descriminant = (b2 - preDesc);
          
      //test if descriminant is negative
      if (descriminant < 0)
         {
         System.out.println( " The descriminant is negative " );
         }
      else
         {
         // square root predescrimant
         double desc = Math.sqrt(descriminant);
         System.out.println(desc);
         //Negative descriminant
         double secondDesc= (-1 * desc);
         // first root
         double firstRootNum = (bNeg - desc);
         double firstRoot = (firstRootNum / (a / 2)); 
         //second root
         double secondRootNum = (bNeg - secondDesc);
         double secondRoot = (secondRootNum / (a /2)) ; 
         //both roots
         System.out.println( "The roots are : " + firstRoot + " and " + secondRoot);
         }
      }
   }