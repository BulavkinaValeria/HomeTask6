package Homework7.Homework71;

public class Circle extends Figure {
    int r = 5;
    final double PI = 3.14;
    double area = PI * r * r;
    double perimeter = 2 * PI * r;

    @Override
    void findArea() {
        System.out.println("Circle's area = PI * r * r = " + area);
    }

    void findPerimeter() {
        System.out.println("Circle's perimeter = 2 * PI * r = " + perimeter);
    }
}
