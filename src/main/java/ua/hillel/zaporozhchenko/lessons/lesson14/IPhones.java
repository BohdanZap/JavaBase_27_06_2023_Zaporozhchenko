package ua.hillel.zaporozhchenko.lessons.lesson14;

public class IPhones implements  Smartphones, IOS {

    @Override
    public void call() {
        System.out.println("iPhone call");
    }

    @Override
    public void sms() {
        System.out.println("iPhone send sms");
    }

    @Override
    public void internet() {
        System.out.println("iPhone use internet");
    }

    @Override
    public void getVersionIOS() {
        System.out.println("iPhone get iOS version");
    }
}
