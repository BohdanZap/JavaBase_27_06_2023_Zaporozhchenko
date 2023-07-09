package ua.hillel.zaporozhchenko.lessons.lesson2;

public class MyApp {
    public static void main(String[] args) {
        double latitude = 29.976480;
        double longitude = 31.131302;
        System.out.println("Longitude: " + longitude + " Latitude: " + latitude
        );
        char specSymbol = '\u00B0';
        char specSymbol2 = '\'';
        byte num1 = 29;
        byte num2 = 58;
        float num3 = 35.3280f;
        byte num4 = 31;
        byte num5 = 7;
        float num6 = 52.6872f;
        System.out.println("DMS Lat:" + " " + num1 + specSymbol + " " + num2 + specSymbol2 + " " + num3 + "'' N DMS Long:" + " " + num4 + specSymbol + " " + num5 + specSymbol2 + " " + num6 + "'' E");
    }
}
