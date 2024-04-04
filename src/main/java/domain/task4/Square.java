package domain;

import domain.Rectangle;

/**
 * @author PetSoft
 * @date 04.04.2024 9:41
 */
public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width;
    }
    @Override
    public void setHeight(int height) {
        super.width = height;
        super.height = height;
    }
}
