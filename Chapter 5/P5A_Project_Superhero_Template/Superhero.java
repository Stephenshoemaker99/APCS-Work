public abstract class Superhero
   {
   private String name;
   
   public Superhero( String initialName )
      {
      name = initialName;   
      } // end one-arg constructor
      
   public abstract String getMotto();
   }