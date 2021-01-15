package meal.menu;

import meal.Meal;

public class VietnameseBaguette extends Meal {

    private String description;
    private double price;

    public VietnameseBaguette() {
        super();
        description = "Vietnamese Baguette with";
        price = 7.99;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "VietnameseBaguette [description=" + description + "]";
    }
}