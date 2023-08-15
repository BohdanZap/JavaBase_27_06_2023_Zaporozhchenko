package ua.hillel.zaporozhchenko.lessons.lesson12;

public class Main {
    public static void main(String[] args) {
        System.out.println("USER 1");
        NewUser user1 = new NewUser("John", "Marston", 11, 10, 1965,
                "marston@gmail.com", "12345", 85, 70,
                5000);
        user1.printAccountInfo();
        System.out.println();

        System.out.println("USER 2");
        NewUser user2 = new NewUser("Mike", "Nike",5,2, 2006,
                "mike123@gmail.com", "99056", 65, 80, 12500);
        user2.printAccountInfo();
        System.out.println();

        System.out.println("USER 3");
        NewUser user3 = new NewUser("Jordan", "Carter", 13,9, 1996,
                "carti@gmail.com", "000000", 78, 65, 20000);
        user3.printAccountInfo();
        System.out.println();

        System.out.println("USER 2 NEW");
        user2.surname = "Dean";
        user2. weight = 80;
        user2.printAccountInfo();

        System.out.println();

        System.out.println("USER 3 NEW");
        user3.pulse = 90;
        user3.countSteps = 1000;
        user3.printAccountInfo();
    }
}
