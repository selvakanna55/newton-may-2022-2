package oops;

import java.util.Scanner;

class Student{
    String name;
    int age;
    char gender;
    double percentage;
    int rollNo;
}

public class SimpleClassExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        //Scanner sc  = new Scanner();
        s1.name = "newton";
        s1.age = 44;
        s1.gender = 'M';
        s1.percentage = 99.1;
        s1.rollNo = 1;

        Student s2 = new Student();
        s2.name = "albert";
        s2.age = 17;
        s2.gender = 'M';
        s2.percentage = 77.5;
        s2.rollNo = 2;
    }
}
