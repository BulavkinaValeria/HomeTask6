package Homework7.Homework71;

public class Triangle extends Figure {
    int a = 3;
    int b = 2;
    int c = 3;
    int h = 5;
    double area = 0.5 * b * h;
    double perimeter = a + b + c;

    @Override
    void findArea() {
        System.out.println("Triangle's area = 0.5 * b * h = "+ area);
    }

    void findPerimeter() {
        System.out.println("Triangle's perimeter = a + b + c = " + perimeter);
    }
}
