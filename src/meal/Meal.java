package meal;

public abstract class Meal {
    String description = "Unknown meal";
    double price = 0.00;

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

}
