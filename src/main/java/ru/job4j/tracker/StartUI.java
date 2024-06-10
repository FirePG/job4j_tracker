package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item Item = new Item();
        LocalDateTime created = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String createdDateTimeFormat = created.format(formatter);
        System.out.println(createdDateTimeFormat);
    }
}
