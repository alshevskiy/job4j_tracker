package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Clean code", 200);
        Book two = new Book("Head First Java", 300);
        Book three = new Book("Effective Java", 400);
        Book four = new Book("Java: Full tutorial", 500);
        Book[] books = new Book[4];
        books[0] = one;
        books[1] = two;
        books[2] = three;
        books[3] = four;

        for (Book book : books) {
            System.out.println("name: " + book.getName() + ", pages: " + book.getPages());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book bk : books) {
            if (bk.getName().equals("Clean code")) {
                System.out.println("name: " + bk.getName() + ", pages: " + bk.getPages());
            }
        }
    }
}