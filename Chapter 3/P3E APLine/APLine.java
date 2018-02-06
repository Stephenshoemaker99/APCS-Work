public class APLine
{
   private int a;
   private int b;
   private int c;
   public APLine(int initialA, int initialB, int initialC)
      {
         a = initialA;
         b= initialB;
         c= initialC;
      }// three part constructor
      
      
   public double getSlope()
      {
         double negA = -a;
         
         double slope = negA/b;
         return slope;
      }// get slope function
   
   public boolean isOnLine( int x, int y)
      {
         if ( a*x + b*y + c == 0)
            {
               return true;
            }
         return false;
      }// isOnLine detection
}