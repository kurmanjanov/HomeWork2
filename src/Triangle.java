public class Triangle extends Figure {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(String name, int side1, int side2, int side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public int calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
