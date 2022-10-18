package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error0 = new Error(false, 0, "Нет ошибки");
        Error error1 = new Error(true, 1, "Абонент не существует");
        Error error6 = new Error(true, 6, "Абонент не в сети");
        error.printInfo();
        error0.printInfo();
        error1.printInfo();
        error6.printInfo();
    }
}
