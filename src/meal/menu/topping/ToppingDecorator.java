package meal.menu.topping;

import meal.Meal;

public abstract class ToppingDecorator extends Meal {
    public abstract String getDescription();
}