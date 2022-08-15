
public class Main {
    public static void main(String[] args) {
        CreditCard first = new CreditCard("56787F65",700000);
        CreditCard second = new CreditCard("6D575675",600000);
        CreditCard third = new CreditCard("5D656736",800000);

        first.popolnenie(5000);
        second.popolnenie(6000);
        third.snyatie(50000);

        System.out.println(first.infoAboutCards());
        System.out.println(second.infoAboutCards());
        System.out.println(third.infoAboutCards());
    }
}
