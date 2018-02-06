public class FirstApp
{
   public static void main( String args[] )
   {
       //Rules for variable names
       // 1. alwats begin with a  lowercase letter
       // 2. may include a-z, A-Z, 0-9
       // 3. give variable meaningful names
       //    e.g. use "date" to represent a date, not 'x'
       // 4. use camelNotation when vatiables consist of two or more words
       
       // Note 1: Class names, like "FirstApp" above, begin with a capital letter
       // Note 2: Constants are all CAPS, e.g PI = 3.14......
       int date = 314;
       System.out.println( "The date is: " + date);
       double pi = 3.14;
       System.out.println(pi);
       boolean isFriday = true;
       System.out.println( isFriday );
       
       String month = new String( "September" );
       
       double sum = pi + date;//sum
       System.out.println( "The sum is : " + sum);
       
       
       double diff = pi - date; //diff
       System.out.println( "The difference is : " + diff);
       
       
       double product = pi * date;//product
       System.out.println( "The product is : " + product);
       
       
       double qoutient = pi / date;  //qoutient
       System.out.println( "The product is : " + qoutient);
   }
}
