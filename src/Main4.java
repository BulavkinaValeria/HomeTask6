import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard4 first = new CreditCard4();
        first.summ = 3000;
        first.number = 111;
        int popolnenie1 = scanner.nextInt();
        int itogoPopolnenie1 = first.summ + popolnenie1;

        CreditCard4 second = new CreditCard4();
        second.summ = 5000;
        second.number = 222;
        int popolnenie2 = scanner.nextInt();
        int itogoPopolnenie2 = second.summ + popolnenie2;

        CreditCard4 third = new CreditCard4();
        third.summ = 7000;
        third.number = 333;
        int snyatiye3 = scanner.nextInt();
        int itogoSnyatie3 = third.summ - snyatiye3;

        System.out.println("First card number: " + first.number + " Balans: " + itogoPopolnenie1);
        System.out.println("Second card number: " + second.number + " Balans: " + itogoPopolnenie2);
        System.out.println("Third card number: " + third.number + " Balans: " + itogoSnyatie3);
    }
}
