package ua.hillel.zaporozhchenko.lessons.lesson4;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int c = 4;
        int volume = a * b * c;
        int lenght = a + b + c;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Сумарна довжина сторін = " + lenght);



        int leeWarrior = 13;
        int leeArcher = 24;
        int leeRider = 46;
        int amountLee = 860;
        int totalstrenghtLee = ((leeWarrior+leeRider+leeArcher) * amountLee);

        int minWarrior = 9;
        int minArcher = 35;
        int minRider = 12;
        double amountMin = amountLee * 1.5;
        int totalstrenghtMin = ((minWarrior+minArcher+minRider) * (int)amountMin);

        int commonpower = totalstrenghtLee + totalstrenghtMin;

        System.out.println("Загальний показник атаки династії Лі = " + totalstrenghtLee);
        System.out.println("Загальний показник атаки династії Мінь = " + totalstrenghtMin);
        System.out.println("Загальний показник атаки обох династій = " + commonpower);



    }
}
