package Homework11;

public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        bucket.putFruit(new Apple());
        bucket.putFruit(new Apple());
        bucket.putFruit(new Apple());
        bucket.putFruit(new Banana());
        bucket.putFruit(new Banana());
        bucket.putFruit(new Banana());
        bucket.putFruit(new Orange());
        bucket.putFruit(new Orange());
        bucket.putFruit(new Orange());
        bucket.showBucket();
        bucket.takeFruit();
        bucket.takeFruit();
        bucket.takeFruit();
        bucket.takeFruit();
        bucket.takeFruit();
        bucket.showBucket();
    }
}
