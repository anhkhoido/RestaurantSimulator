package meal.menu.topping;

import meal.Meal;

public class Avocado extends ToppingDecorator {
    private Meal meal;

    public Avocado(Meal meal) {
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
        return meal.getDescription() + " Avocado,";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 1.00;
    }
}