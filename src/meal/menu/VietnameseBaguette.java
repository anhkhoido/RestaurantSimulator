package meal.menu;

import meal.Meal;

public class VietnameseBaguette extends Meal {

    private String description;

    public VietnameseBaguette() {
        super();
        description = "Vietnamese Baguette with";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "VietnameseBaguette [description=" + description + "]";
    }
}