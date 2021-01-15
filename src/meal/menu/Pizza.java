package meal.menu;

import meal.Meal;

public class Pizza extends Meal {
    private String description;
    private double price;

    public Pizza() {
        description = "Pizza with";
        price = 15.00;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Pizza [description=" + description + "]";
    }
}