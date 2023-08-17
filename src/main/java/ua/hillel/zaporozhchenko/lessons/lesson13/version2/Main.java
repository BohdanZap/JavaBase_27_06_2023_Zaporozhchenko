package ua.hillel.zaporozhchenko.lessons.lesson13.version2;

public class Main {
    public static void main(String[] args) {
        MusicStyles classicGroup = new ClassicMusic();
        MusicStyles popGroup = new PopMusic();
        MusicStyles rockGroup = new RockMusic();

        MusicStyles[] groups = {classicGroup, popGroup, rockGroup};

        for (MusicStyles group : groups) {
            group.playMusic();
        }
    }
}
