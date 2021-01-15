package meal.menu.topping;

import meal.Meal;

public class Pepperoni extends ToppingDecorator {
    private Meal meal;

    public Pepperoni(Meal meal) {
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
        return meal.getDescription() + " Pepperoni,";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 0.50;
    }
}
