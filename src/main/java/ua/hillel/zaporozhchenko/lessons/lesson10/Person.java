package ua.hillel.zaporozhchenko.lessons.lesson10;

public class Person {
    public static void main(String[] args) {
        String name1 = "Will";
        String name2 = "Jackie";
        String name3 = "Sherlock";

        String secName1 = "Smith";
        String secName2 = "Chan";
        String secName3 = "Holmes";

        String city1 = "New York";
        String city2 = "Shanghai ";
        String city3 = "London";

        String phone1 = "2936729462846";
        String phone2 = "12312412412";
        String phone3 = "37742123513";

        personInfo(name1, secName1, city1, phone1);
        personInfo(name2, secName2, city2, phone2);
        personInfo(name3, secName3, city3, phone3);
    }

    static String personInfo(String name, String secName, String city, String phone) {
        System.out.println("Зателефонувати громадянинові " + name + " " + secName + " із міста " + city + " можна за номером " + phone);
        return name; // secName, city, phone??
    }
}

