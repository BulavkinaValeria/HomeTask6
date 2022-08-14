import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        Scanner scanner = new Scanner(System.in);
        int popolnenie = scanner.nextInt();
        int snyatiye = scanner.nextInt();
        int itogoPopolnenie = CreditCard.summ + popolnenie;
        int itogoSnyatie = CreditCard.summ - snyatiye;
        System.out.println(itogoPopolnenie);
        System.out.println(itogoSnyatie);
    }
}
