package ua.hillel.zaporozhchenko.lessons.lesson4;

public class Main {
    public static void main(String[] args) {
       int a = 10;
       int b = 5;
       int result = ++a - b++ - a++ + ++a;
        System.out.println("result = " + result);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
