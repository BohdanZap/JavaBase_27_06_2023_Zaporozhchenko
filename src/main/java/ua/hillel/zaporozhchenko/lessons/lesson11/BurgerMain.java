package ua.hillel.zaporozhchenko.lessons.lesson11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger classicBurger = new Burger("булочка", "мясо", "сир", "зелень", "майонез");
        Burger withoutMayo = new Burger("булочка", "мясо", "сир", "зелень");
        Burger doubleMeat = new Burger("булочка", "мясо", "сир", "зелень", "майонез", 2);
    }
}
