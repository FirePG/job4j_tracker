package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спят усталые игрушки, книжки спят");
            default -> System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox kid = new Jukebox();
        kid.music(5);
        kid.music(2);
        kid.music(1);
    }
}