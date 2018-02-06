import java.util.*;
public class SpaceShipDriver
{
    public static void main(String[] args)
    {
        List<SpaceShip> fleet = new ArrayList<SpaceShip>();
        fleet.add(new Fighter("Falcon-1", 50, "Bird Imperium"));
        fleet.add(new Fighter("Falcon-2", 50, "Bird Imperium"));
        fleet.add(new Transport("Babybird", 50, "The Nest"));
        
        for( SpaceShip ship: fleet)
            {
                System.out.println(ship);
                System.out.println(" ------------------------------ \n\n\n");
            }
        
        SpaceShip[] armada = new SpaceShip[3];
        armada[0] = new Fighter("Falcon-1", 50, "Bird Imperium");
        armada[1]= new Fighter("Falcon-2", 50, "Bird Imperium");
        armada[2] = new Transport("BabyBird", 50, "The Nest");
        for(SpaceShip ship : armada)
            {
                System.out.println(ship);
                System.out.println(" ------------------------------ \n\n\n");
            }
    }
}
