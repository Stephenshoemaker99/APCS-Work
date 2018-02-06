public class Sandwich implements MenuItem
   {
    private String name;
    private double price;
    public Sandwich(String initialName, double initialPrice)
    {
        name = initialName;
        price = initialPrice;
    }
    public double getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }
    } // end class Sandwich