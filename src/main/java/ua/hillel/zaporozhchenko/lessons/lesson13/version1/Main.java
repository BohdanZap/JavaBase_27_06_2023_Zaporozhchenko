package ua.hillel.zaporozhchenko.lessons.lesson13.version1;

public class Main {
    public static void main(String[] args) {
        ClassicMusic classicGroup = new ClassicMusic();
        RockMusic rockGroup = new RockMusic();
        PopMusic popGroup = new PopMusic();

        MusicStyles[] groups = {classicGroup, rockGroup, popGroup};

        for (MusicStyles group : groups) {
            group.playMusic();
        }
    }
}
