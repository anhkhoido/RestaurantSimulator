package meal.menu;

import meal.Meal;

public class Pizza extends Meal {
    private String description;

    public Pizza() {
        description = "Pizza with";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Pizza [description=" + description + "]";
    }
}