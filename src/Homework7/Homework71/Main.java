package Homework7.Homework71;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[5];
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        for (int i = 0; i < figure.length; i++) {
            figure[i] = new Triangle();
            triangle.findPerimeter();
            figure[i++] = new Circle();
            circle.findPerimeter();
            figure[i++] = new Square();
            square.findPerimeter();
            figure[i++] = new Square();
            triangle.findPerimeter();
            figure[i++] = new Square();
            square.findPerimeter();
            System.out.println("Perimeter's summ = " + (triangle.perimeter * 2 + square.perimeter * 2 + circle.perimeter));
        }
    }
}
