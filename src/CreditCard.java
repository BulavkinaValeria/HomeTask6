public class CreditCard {
    String number;
    double summ;

    CreditCard(String number, double summ) {
        this.number = number;
        this.summ = summ;
    }

    void popolnenie(double summPopolneniya) {
        summ = summ + summPopolneniya;
    }

    void snyatie(double summSnyatiya) {
        summ = summ + summSnyatiya;
    }

    String infoAboutCards() {
        return "Number: " + this.number + " Summ: " + this.summ;
    }
}

