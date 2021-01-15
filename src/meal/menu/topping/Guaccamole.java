package meal.menu.topping;

import meal.Meal;

public class Guaccamole extends ToppingDecorator {

    private Meal meal;

    public Guaccamole(Meal meal) {
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
        return meal.getDescription() + " Guaccamole,";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 0.50;
    }
}