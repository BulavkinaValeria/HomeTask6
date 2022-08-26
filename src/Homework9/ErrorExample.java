package Homework9;

public class ErrorExample {
    public void delenie() {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public void massiv() {
        try {
            int array[] = {2, 3, 4};
            array[5] = 5;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public void massiv2() {
        try {
            int array[] = {2, 3, 4, 6, 9};
            array[100] = 4;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public void delenie2() {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally - vypolnyaetsya v lyubom sluchae");
        }
    }
}

