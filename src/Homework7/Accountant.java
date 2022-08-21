package Homework7;

public class Accountant extends Human implements PrintJob {

    @Override
    void getJob() {
        System.out.println("I'm a human");
    }

    @Override
    public void printJob() {
        System.out.println("I'm an accountant");
    }
}
