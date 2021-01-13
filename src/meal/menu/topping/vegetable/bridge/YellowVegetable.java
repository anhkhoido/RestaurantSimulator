package meal.menu.topping.vegetable.bridge;

import java.awt.*;

public class YellowVegetable implements VegetableColour {
    @Override
    public void setColour(Graphics graphics) {
        graphics.setColor(Color.YELLOW);
    }

    @Override
    public String toString() {
        return "Yellow";
    }
}
