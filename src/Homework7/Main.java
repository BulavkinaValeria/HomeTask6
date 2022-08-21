package Homework7;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        director.printJob();
        worker.printJob();
        accountant.printJob();
    }
}
