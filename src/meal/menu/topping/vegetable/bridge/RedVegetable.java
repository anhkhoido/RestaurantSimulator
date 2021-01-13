package meal.menu.topping.vegetable.bridge;

import java.awt.*;

public class RedVegetable implements VegetableColour {
    @Override
    public void setColour(Graphics graphics) {
        graphics.setColor(Color.RED);
    }

    @Override
    public String toString() {
        return "Red";
    }
}
