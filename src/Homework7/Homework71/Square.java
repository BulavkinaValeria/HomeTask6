package Homework7.Homework71;

public class Square extends Figure {
    int a = 5;
    double area = a * a;
    double perimeter = a * 4;

    @Override
    void findArea() {
        System.out.println("Square's area = a * a = " + area);
    }

    void findPerimeter() {
        System.out.println("Square's perimeter = a * 4 = " + perimeter);
    }
}
