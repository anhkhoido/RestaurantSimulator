package meal.menu.topping.vegetable.bridge;

import java.awt.*;

public class GreenVegetable implements VegetableColour {

    @Override
    public void setColour(Graphics graphics) {
        graphics.setColor(Color.GREEN);
    }

    @Override
    public String toString() {
        return "Green";
    }
}