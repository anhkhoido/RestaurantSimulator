package meal.menu.topping;

import meal.Meal;

public class Tomato extends ToppingDecorator {
    private Meal meal;

    public Tomato(Meal meal) {
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
        return meal.getDescription() + " Tomato,";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 0.00;
    }
}
