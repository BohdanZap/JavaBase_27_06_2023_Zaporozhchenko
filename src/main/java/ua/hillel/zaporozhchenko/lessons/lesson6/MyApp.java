package ua.hillel.zaporozhchenko.lessons.lesson6;

public class MyApp {
    public static void main(String[] args) {
//        int counter = 0;
//        int i = 1;
//        while (counter < 100) {
//            i++;
//            if (a / 10 == 4 || a / 10 == 9 || a % 10 == 4 || a % 10 == 9) {
//                continue;
//            } else if (); //// НЕ ЗМІГ ПРИДУМАТИ УМОВУ ДЛЯ ТРЬОХЗНАЧНИХ ЧИСЕЛ
//            System.out.println(a);
//            ; counter++;
//        }
//        System.out.println("counter = " + counter);

        int counter = 0;
        for (int i = 1; counter < 100 ; i++) {
            boolean ok = true;
            int temp = i;
            while (temp > 0) {
                int res = temp % 10;
                if (res == 4 || res == 9) {
                    ok = false;
                    break;
                } temp /= 10;
            } if (ok) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("counter = " + counter);




    }
}