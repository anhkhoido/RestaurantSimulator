package meal.menu.topping.vegetable.bridge;

import java.awt.*;

public class OrangeVegetable implements VegetableColour {

    @Override
    public void setColour(Graphics graphics) {
        graphics.setColor(Color.ORANGE);
    }

    @Override
    public String toString() {
        return "Orange";
    }
}