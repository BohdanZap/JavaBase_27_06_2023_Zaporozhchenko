package ua.hillel.zaporozhchenko.lessons.lesson14;

public class Main {
    public static void main(String[] args) {
        Android android = new Android();
        IPhones iPhones = new IPhones();

        android.call();
        android.getVersionLinuxOS();
        android.sms();
        android.internet();
        System.out.println();

        iPhones.call();
        iPhones.getVersionIOS();
        iPhones.sms();
        iPhones.internet();
    }
}
