package ua.hillel.zaporozhchenko.lessons.lesson11;

public class Burger {
    String bread;
    String meat;
    String cheese;
    String greens;
    String sauce;

    Burger(String bread, String meat, String cheese, String greens, String sauce) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.sauce = sauce;
        System.out.println("Склад класичного бургера: " + this.bread + ", " + this.meat + ", " + this.cheese + ", " + this.greens + ", " + this.sauce);
    }

    Burger(String bread, String meat, String cheese, String greens) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Склад дієтичного бургера: " + this.bread + ", " + this.meat + ", " + this.cheese + ", " + this.greens);
    }

    Burger(String bread, String meat, String cheese, String greens, String sauce, int counterMeat) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.sauce = sauce;
        System.out.println("Склад doubleMeat бургера: " + this.bread + ", " + counterMeat + " " + this.meat +  ", " + this.cheese + ", " + this.greens + ", " + this.sauce);
    }
}
