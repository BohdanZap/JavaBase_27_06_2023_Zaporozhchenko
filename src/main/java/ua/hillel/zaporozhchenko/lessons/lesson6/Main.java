package ua.hillel.zaporozhchenko.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the number from 0 to 10");
        int randomNum = (int)(Math.random() * 11);
        while (true) {
            int userNum = scan.nextInt();
            if (randomNum == userNum) {
                System.out.println("Congratulations! You guessed the number");
                break;

            } else {
                System.out.println("Try again");
            }
        } scan.close();
    }
}
