package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 250);
        Book life = new Book("Life", 400);
        Book emma = new Book("Emma", 190);
        Book tarzan = new Book("Tarzan", 320);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = life;
        books[2] = emma;
        books[3] = tarzan;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getAmount());
        }
        System.out.println("Swap the first and four book");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getAmount());
        }
        System.out.println("Search for books named Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName());
            }
        }
    }
}