public class Drink implements MenuItem
   {
    private String name;
    private double price;
    public Drink(String initialName, double initialPrice)
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
      
   } // end class Drink