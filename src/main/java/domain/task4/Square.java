package domain.task4;

/**
 * @author PetSoft
 * @date 04.04.2024 9:41
 */
public class Square extends Rectangle {
    public Square(int edge) {
        super(edge, edge);
    }

    public void setSize(int edge) {
        super.setHeight(edge);
        super.setWidth(edge);
    }

    @Override
    public int area() {
        return super.area();
    }
}
