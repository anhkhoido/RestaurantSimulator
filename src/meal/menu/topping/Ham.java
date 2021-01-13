package meal.menu.topping;

import meal.Meal;

public class Ham extends ToppingDecorator {

    private Meal meal;

    public Ham(Meal meal) {
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
        return meal.getDescription() + " Ham,";
    }
}
