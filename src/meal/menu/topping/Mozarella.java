package meal.menu.topping;

import meal.Meal;

public class Mozarella extends ToppingDecorator {
    private Meal meal;

    public Mozarella(Meal meal) {
        this.meal = meal;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    @Override
    public String getDescription() {
        return meal.getDescription() + " Mozarella,";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 0.50;
    }
}