package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Gritsyn Pavel Ivanovich");
        student.setGroup("10D");
        student.setReceipt(new Date());

        System.out.println(student.getFullName() + " because - " + student.getGroup());
    }
}
