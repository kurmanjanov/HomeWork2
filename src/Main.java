public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        Square square = new Square("Square", 4);

        System.out.println(circle.getName() + " perimeter: " + circle.calculatePerimeter());
        System.out.println(square.getName() + " perimeter: " + square.calculatePerimeter());

        Figure[] figures = {new Circle("Circle", 5), new Triangle("Triangle", 3, 4, 5), new Square("Square", 4),
                new Rectangle("Rectangle", 6, 8), new Triangle("Another Triangle", 7, 7, 7), new Circle("Another Circle", 8)};

        for (Figure figure : figures) {
            System.out.println(figure.getName() + " perimeter: " + figure.calculatePerimeter());
        }
    }
}
