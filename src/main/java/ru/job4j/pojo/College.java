package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Алшевский Никита Александрович");
        student.setGroup("ИГЭС-1-18");
        student.setDate("15.08.2015");
        System.out.println("Студент: " + student.getFullName() + "; группа: " + student.getGroup()
                + "; дата поступления: " + student.getDate());
    }
}