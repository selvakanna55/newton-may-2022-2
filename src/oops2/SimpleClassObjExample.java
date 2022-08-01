package oops2;

import oops2.Student;


public class SimpleClassObjExample {
    public static void main(String[] args) {
        Student s1 = new Student(140, "Newton", 91.6);
        System.out.println("name: " + s1.name);
        System.out.println("rollNo: " + s1.rollNo);
        System.out.println("percentage: " + s1.percentage);
        s1.sayHello();
        Student s2 = new Student(141, "Varun", 92.6);
        s2.sayHello();
    }
}
