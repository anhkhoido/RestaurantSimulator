package meal.menu.topping.vegetable.bridge;

import java.awt.*;

public class WhiteVegetable implements VegetableColour {
    @Override
    public void setColour(Graphics graphics) {
        graphics.setColor(Color.WHITE);
    }

    @Override
    public String toString() {
        return "White";
    }
}
