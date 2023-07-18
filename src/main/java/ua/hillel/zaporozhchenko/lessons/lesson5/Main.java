package ua.hillel.zaporozhchenko.lessons.lesson5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str1 = "teamNavy";
        String str2 = "teamLiquid";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter NAVI players kills:");
        int playerNavi1 = 1;
        if (scanner.hasNextInt()) {
            playerNavi1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Please enter a number");
        }
        int playerNavi2 = 1;
        if (scanner.hasNextInt()) {
            playerNavi2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Please enter a number");
        }
        int playerNavi3 = 1;
        if (scanner.hasNextInt()) {
            playerNavi3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Please enter a number");
        }
        int playerNavi4 = 1;
        if (scanner.hasNextInt()) {
            playerNavi4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Please enter a number");
        }
        int playerNavi5 = 1;
        if (scanner.hasNextInt()) {
            playerNavi5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Please enter a number");
            System.exit(0);
        }
        System.out.println("Enter Liquid players kills:");
        int playerLiquid1 = 1;
        if (scanner.hasNextInt()) {
            playerLiquid1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Please enter a number");
        }
        int playerLiquid2 = 1;
        if (scanner.hasNextInt()) {
            playerLiquid2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Please enter a number");
        }
        int playerLiquid3 = 1;
        if (scanner.hasNextInt()) {
            playerLiquid3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Please enter a number");
        }
        int playerLiquid4 = 1;
        if (scanner.hasNextInt()) {
            playerLiquid4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Please enter a number");
        }
        int playerLiquid5 = 1;
        if (scanner.hasNextInt()) {
            playerLiquid5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Please enter a number");
            System.exit(0);
        }
        int avgNAVI = (playerNavi1 + playerNavi2 + playerNavi3 + playerNavi4 + playerNavi5) / 5;
        int avgLiquid = (playerLiquid1 + playerLiquid2 + playerLiquid3 + playerLiquid4 + playerLiquid5) / 5;

        if (avgNAVI > avgLiquid) {
            System.out.println("Перемогла команда " + str1 + " набравши " + avgNAVI + " очок");
        } else if (avgNAVI < avgLiquid) {
            System.out.println("Перемогла команда " + str2 + " набравши " + avgLiquid + " очок");
        } else {
            System.out.println("Обидві команди набрали однакову кількість очок: " + avgLiquid + " та " + avgNAVI);
        }


    }
}

