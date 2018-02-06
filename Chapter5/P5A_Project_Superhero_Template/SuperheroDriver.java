import java.util.List;
import java.util.ArrayList;
public class SuperheroDriver
   {
   public static void main( String[] args )
      {
          List<Superhero> justiceSociety = new ArrayList<Superhero>();
          justiceSociety.add(new WaterMan("Aquarius", 100));
          justiceSociety.add(new FireGuy("Hot Man", 9999999));
          justiceSociety.add(new IceHero("Cooldown", 10));
          for( Superhero hero : justiceSociety)
          {
              System.out.println(hero.getMotto());
          }
          
      
      } // end method main
   } // end SuperheroDriver