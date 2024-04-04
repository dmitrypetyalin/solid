package domain;

/**
 * @author PetSoft
 * @date 03.04.2024 22:47
 */
public class Rectangle {
    private int width;
    private int height;
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int area() {
        return this.width * this.height;
    }
}
