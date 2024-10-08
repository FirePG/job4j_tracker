package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches > 3 || matches < 1 || matches > count) {
                System.out.println("Введённое недопустимое число, введите число от 1 до 3");
                turn = (!turn);
            } else if (matches == 1) {
                count = count - 1;
                System.out.println("Количество спичек на столе:" + count);
            } else if (matches == 2) {
                count = count - 2;
                System.out.println("Количество спичек на столе:" + count);
            } else if (matches == 3) {
                count = count - 3;
                System.out.println("Количество спичек на столе:" + count);
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}