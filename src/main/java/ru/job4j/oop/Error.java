package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Активно: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Ошибка: " + message);
    }

    public static void main(String[] args) {
        Error notFound = new Error(true, 404, "Не найдено");
        Error notAcceptable = new Error(true, 406, "Cервер не может вернуть ответ");
        Error crash = new Error();
        notFound.printInfo();
        crash.printInfo();
        notAcceptable.printInfo();
    }
}