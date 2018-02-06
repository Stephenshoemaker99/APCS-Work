public class Transport extends SpaceShip
{
    private String destination;
    public Transport()
    {
        super();
        destination = "Awaiting destination";
    }
    public Transport(String initialName, int initialSpeed, String initialDestination)
    {
        super(initialName, initialSpeed);
        destination = initialDestination;
    }
    public void reroute(String newDestination)
    {
        destination = newDestination;
    }
    
    public String toString()
    {
        String output = new String( super.toString() + "\n" + 
                                    "Destination: " + destination);
        return output;
    }
}