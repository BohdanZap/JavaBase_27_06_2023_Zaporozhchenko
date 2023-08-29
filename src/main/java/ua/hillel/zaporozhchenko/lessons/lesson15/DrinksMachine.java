package ua.hillel.zaporozhchenko.lessons.lesson15;

public enum DrinksMachine {
    COFFEE("КОФЕ"),
    TEA("ЧАЙ"),
    LEMONADE("ЛИМОНАД"),
    MOJITO("МОХІТО"),
    WATER("МІНЕРАЛЬНА ВОДА"),
    COCA_COLA("КОКА КОЛА");


    final private String drinkType;

    DrinksMachine(String drinkType) {
        this.drinkType = drinkType;
    }

    void makeCoffee () {
        System.out.println("Making coffee...");
    }
    void makeTea() {
        System.out.println("Making tea...");
    }
    void makeLemonade() {
        System.out.println("Making lemonade...");
    }
    void makeMojito() {
        System.out.println("Making mojito");
    }
    void makeWater() {
        System.out.println("Making water...");
    }
    void makeCocaCola() {
        System.out.println("Making coca cola...");
    }
}
