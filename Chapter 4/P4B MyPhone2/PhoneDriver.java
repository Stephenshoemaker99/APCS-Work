public class PhoneDriver
{
   public static void main(String[] arg)
      {
         MyPhone phone = new MyPhone("Blue" , 100);
         System.out.println( phone );
         System.out.println( phone.stringSongLibrary());
         System.out.println( phone.totalPlayTime());
         phone.deleteAllSongs();
         System.out.println( phone );
         
         
      }
}