package ua.hillel.zaporozhchenko.lessons.lesson14;

public class Android implements  Smartphones, LinuxOS {

    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void sms() {
        System.out.println("Android send sms");
    }

    @Override
    public void internet() {
        System.out.println("Android use internet");
    }

    @Override
    public void getVersionLinuxOS() {
        System.out.println("Android get LinuxOS version");
    }
}
