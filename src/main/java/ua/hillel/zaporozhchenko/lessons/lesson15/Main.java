package ua.hillel.zaporozhchenko.lessons.lesson15;

import java.util.Arrays;
import java.util.Scanner;

import static ua.hillel.zaporozhchenko.lessons.lesson15.DrinksMachine.*;

public class Main {
    public static void main(String[] args) {
        runMachine();
    }

    static void runMachine() {
        Scanner scan = new Scanner(System.in);

        int drinkCounter = 0;

        Drinks drinksPrices = new Drinks();

        DrinksMachine[] drinks = DrinksMachine.values();
        DrinksMachine drink = null;

        int userChoice;
        int totalPrice = 0;
        int drinkCost = 0;

        while (true) {
            System.out.println("Press 1 to continue. Press 2 to end");
            while (true) {
                if (scan.hasNextInt()) {
                    userChoice = scan.nextInt();
                    if (userChoice == 1 || userChoice == 2) {
                        break;
                    } else {
                        System.out.println("Please enter 1 or 2");
                    }
                } else {
                    System.out.println("Wrong data. Please enter 1 or 2");
                    scan.nextLine();
                }
            }


            if (userChoice == 1) {
                while (drink == null) {
                    System.out.println("Please choose a drink from the list: " + Arrays.toString(drinks));
                    scan.nextLine();
                    String userValue = scan.nextLine().toUpperCase();
                    for (DrinksMachine drinkType : drinks) {
                        if (userValue.equals(drinkType.toString())) {
                            drink = DrinksMachine.valueOf(userValue);
                            break;
                        }
                    }
                }

                switch (drink) {
                    case COFFEE -> {
                        System.out.println("Coffee price: " + drinksPrices.getCOFFEE_VALUE());
                        COFFEE.makeCoffee();
                        drinkCost = drinksPrices.getCOFFEE_VALUE();
                    }
                    case TEA -> {
                        System.out.println("Tea price: " + drinksPrices.getTEA_VALUE());
                        TEA.makeTea();
                        drinkCost = drinksPrices.getTEA_VALUE();

                    }
                    case LEMONADE -> {
                        System.out.println("Lemonade price: " + drinksPrices.getLEMONADE_VALUE());
                        LEMONADE.makeLemonade();
                        drinkCost = drinksPrices.getLEMONADE_VALUE();

                    }
                    case MOJITO -> {
                        System.out.println("Mojito price: " + drinksPrices.getMOJITO_VALUE());
                        MOJITO.makeMojito();
                        drinkCost = drinksPrices.getMOJITO_VALUE();

                    }
                    case WATER -> {
                        System.out.println("Water price: " + drinksPrices.getWATER_VALUE());
                        WATER.makeWater();
                        drinkCost = drinksPrices.getWATER_VALUE();

                    }
                    case COCA_COLA -> {
                        System.out.println("CocaCola price: " + drinksPrices.getCOCA_COLA_VALUE());
                        COCA_COLA.makeCocaCola();
                        drinkCost = drinksPrices.getCOCA_COLA_VALUE();
                    }
                }
                totalPrice += drinkCost;
                drinkCounter++;
                System.out.println("Drink counter = " + drinkCounter);
                drink = null;
            } else {
                scan.nextLine();
                System.out.println("You choose " + drinkCounter + " drinks");
                System.out.println("You need to pay " + totalPrice);
                System.out.println("Thank you for using. Bye");
                break;
            }
        }
        scan.close();
    }
}





