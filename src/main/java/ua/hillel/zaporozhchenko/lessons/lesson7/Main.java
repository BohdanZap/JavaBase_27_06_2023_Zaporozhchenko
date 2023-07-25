package ua.hillel.zaporozhchenko.lessons.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.

        int min = 18;
        int max = 40;
        int sumTeam1 = 0;
        int sumTeam2 = 0;
        int[] team1 = new int[25];
        for (int i = 0; i < team1.length; i++) {
            team1[i] = ((int) (Math.random() * (max - min + 1) + min));
            sumTeam1 += team1[i];
        }
        System.out.println("Age of each team1 player: " + Arrays.toString(team1));
        int[] team2 = new int [25];
        for (int j = 0; j < team2.length; j++) {
            team2[j] = ((int) (Math.random() * (max - min + 1) + min));
            sumTeam2 += team2[j];
        }
        System.out.println("Age of each team2 player: " + Arrays.toString(team2));
        System.out.println("Team1 average age: " +  ((double)sumTeam1 / team1.length));
        System.out.println("Team2 average age: " +  ((double)sumTeam2 / team2.length));
    }
}
