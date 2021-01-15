package Main;

import meal.Meal;
import meal.menu.Pizza;
import meal.menu.VietnameseBaguette;
import meal.menu.topping.*;
import meal.menu.topping.vegetable.*;
import meal.menu.topping.vegetable.bridge.GreenVegetable;
import meal.menu.topping.vegetable.bridge.OrangeVegetable;
import meal.menu.topping.vegetable.bridge.WhiteVegetable;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to my restaurant! Let's cook!\n");

        Meal pizza = new Pizza();
        pizza = new TomatoSauce(pizza);
        pizza = new Mozarella(pizza);
        pizza = new BellPepper(pizza, new GreenVegetable());
        pizza = new Carrot(pizza, new OrangeVegetable());
        pizza = new Onion(pizza, new WhiteVegetable());
        pizza = new HotPepper(pizza, new GreenVegetable());
        System.out.println("You ordered a " + pizza.getDescription() + ". The pizza costs $" + pizza.getPrice() + "\n");

        Meal vietnameseBaguette = new VietnameseBaguette();
        vietnameseBaguette = new Creton(vietnameseBaguette);
        vietnameseBaguette = new Radish(vietnameseBaguette, new WhiteVegetable());
        vietnameseBaguette = new Carrot(vietnameseBaguette, new OrangeVegetable());
        vietnameseBaguette = new Ham(vietnameseBaguette);
        vietnameseBaguette = new HotPepper(vietnameseBaguette, new GreenVegetable());
        System.out.println("You ordered a " + vietnameseBaguette.getDescription() + ". It costs $" + vietnameseBaguette.getPrice());
    }

}