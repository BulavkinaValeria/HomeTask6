import java.util.Random;

public class CreditCard {
    static int number;
    static int summ;
Random random = new Random();

    public CreditCard() {
        number = random.nextInt(1500000000);
        summ = 2500000;
    }
}
