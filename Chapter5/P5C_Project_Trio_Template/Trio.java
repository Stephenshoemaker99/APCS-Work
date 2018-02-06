import java.util.List;
import java.util.ArrayList;
public class Trio
   {
       private Sandwich sandwich;
       private Salad salad;
       private Drink drink;
       public Trio(Sandwich initialSandwich, Salad initialSalad, Drink initialDrink)
       {
           sandwich = initialSandwich;
           salad = initialSalad;
           drink = initialDrink;
       }
       private List<MenuItem> getOrder()
       {
           List<MenuItem> order = new ArrayList<MenuItem>();
           if(sandwich.getPrice() > salad.getPrice() && sandwich.getPrice() > drink.getPrice())
           {
               order.add(sandwich);
               if(salad.getPrice() > drink.getPrice())
               {
                   order.add(salad);
                   order.add(drink);
               }
               else
               {
                   order.add(drink);
                   order.add(salad);
               }
           }
           else
           {
               if(salad.getPrice() > drink.getPrice())
               {
                   order.add(salad);
                   if(drink.getPrice() > sandwich.getPrice())
                   {
                       order.add(drink);
                       order.add(sandwich);
                   }
                   else
                   {
                       order.add(sandwich);
                       order.add(drink);
                   }
               }
               else
               {
                   order.add(drink);
                   if(salad.getPrice() > drink.getPrice())
                   {
                       order.add(salad);
                       order.add(sandwich);
                   }
                   else
                   {
                       order.add(sandwich);
                       order.add(salad);
                   }
               }
           }
           return order;
       }
       
       
       public String getName()
       {
           String output = new String();
           List<MenuItem> order = getOrder();
           for(int index = 0; index < order.size(); index++)
           {
               output+= order.get(index).getName() + "/";
           }
           output += " Trio";
           return output;
       }
       public double getPrice()
       {
           double output;
           List<MenuItem> order = getOrder();
           output = order.get(0).getPrice() + order.get(1).getPrice();
           return output;
       }
    
   } // end class Trio
    