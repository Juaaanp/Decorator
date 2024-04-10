package com.decorator.uniquindio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Client
       HawaiianPizza pizza = new HawaiianPizza();
       System.out.println("Plain Hawaiian Pizza: " + pizza.getPrice());

       ExtraCheeseTopping moreCheese = new ExtraCheeseTopping(pizza);
       ExtraCheeseTopping someMoreCheese = new ExtraCheeseTopping(moreCheese);
       System.out.println("Hawaiian Pizza with double extra cheese: " + someMoreCheese.getPrice());

       ExtraPineappleTopping morePineapple = new ExtraPineappleTopping(someMoreCheese);
       System.out.println("Hawaiian Pizza  with double extra cheese with Extra Pineapple: " + morePineapple.getPrice());
    }
}
