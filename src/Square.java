public class Square extends Figure {
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    public int calculatePerimeter() {
        return 4 * side;
    }
}