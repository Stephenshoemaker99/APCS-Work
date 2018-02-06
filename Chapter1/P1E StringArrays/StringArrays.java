public class StringArrays
{
   public static void main( String[] arg )
   {
      String[] movies= new String[3];
      movies[0] = new String("Pulp Fiction");
      movies[1] = new String("Ant Man");
      movies[2] = new String("Inglorious Bastards");
      for( int index = 0; index < movies.length; index++)
      {
         System.out.println( movies[index]);
      }
      String[] songs = new String[3];
      songs [0] = new String("Bohemian Rapshody \t");
      songs [1] = new String("Rap God \t");
      songs [2] = new String("Feel it Still \t");
      int index = 0;
      while (index < movies.length )
      {
         System.out.print( songs[index]);
         index++;
      }
   }
}
