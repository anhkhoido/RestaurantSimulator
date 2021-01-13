package meal.menu.topping;

import meal.Meal;

public class TomatoSauce extends ToppingDecorator {
    private Meal meal;

    public TomatoSauce(Meal meal) {
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
        return meal.getDescription() + " Tomato Sauce,";
    }
}
