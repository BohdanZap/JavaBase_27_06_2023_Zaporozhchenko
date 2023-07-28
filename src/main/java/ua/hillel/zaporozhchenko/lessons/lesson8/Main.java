package ua.hillel.zaporozhchenko.lessons.lesson8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[7];
        int min = 0;
        int max = 9;
        for (int i = 0; i < array1.length; i++) {
            array1[i] =((int) (Math.random() * (max - min + 1) + min));
        }
        int[] array2 = new int[7];
        for (int j = 0; j < array2.length; j++) {
            array2[j] = ((int) (Math.random() * (max - min + 1) + min));
        }
        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));

        int counter1 = 0;
        for (int i = 0; i < array1.length - 1; i++) {
            counter1++;
            for (int j = 0; j < array1.length - 1 - i; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array1 = " + Arrays.toString(array1));

        int counter2 = 0;
        for (int i = 0; i < array2.length - 1; i++) {
            counter2++;
            for (int j = 0; j < array2.length - 1 - i; j++) {
                if (array2[j] > array2[j + 1]) {
                    int temp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array2 = " + Arrays.toString(array2));
        System.out.println("counter1 = " + counter1);
        System.out.println("counter2 = " + counter2);

        int index = 0;
        int counterCoincidence = 0;
        for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    System.out.println("Збіги: " + array1[i] + " та " + array2[i] + " в комірках з індексом " + index);
                    counterCoincidence++;
                } index++;
        } System.out.println("Кількість збігів: " + counterCoincidence);
    }
}


