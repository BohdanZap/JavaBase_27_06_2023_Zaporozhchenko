package ua.hillel.zaporozhchenko.lessons.lesson6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int minNum = 0;
        int maxNum = 10;
        int randomNum = (int) (Math.random() * (maxNum - minNum + 1) + minNum);
        System.out.println("Guess the number from 0 to 10");
        Scanner scan = new Scanner(System.in);
        int attempts = 5;
         while (attempts > 0){
             int userNum = scan.nextInt();
             if (userNum == randomNum) {
                    System.out.println("Congratulations! You won!");
                    break;
                } else if (userNum > maxNum) {
                    System.out.println("Enter the number from 0 to 10. Attempts: " + --attempts );
                }  else if (userNum < minNum) {
                    System.out.println("Enter the number from 0 to 10. Attempts: " + --attempts);
                } else {
                    System.out.println("Try again. Attempts: " + --attempts);
                } if (attempts == 0) {
                 System.out.println("You loose!");
             }
            } scan.close();
    }
}

