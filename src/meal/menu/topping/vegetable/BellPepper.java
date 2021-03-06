package meal.menu.topping.vegetable;

import meal.Meal;
import meal.menu.topping.ToppingDecorator;
import meal.menu.topping.vegetable.bridge.VegetableColour;

public class BellPepper extends ToppingDecorator {
    private Meal meal;
    private VegetableColour vegetableColour;

    public BellPepper(Meal meal, VegetableColour vegetableColour) {
        this.meal = meal;
        this.vegetableColour = vegetableColour;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public VegetableColour getVegetableColour() {
        return vegetableColour;
    }

    public void setVegetableColour(VegetableColour vegetableColour) {
        this.vegetableColour = vegetableColour;
    }

    @Override
    public String getDescription() {
        return meal.getDescription() + " " + vegetableColour + " Bell Pepper,";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 0.00;
    }
}
