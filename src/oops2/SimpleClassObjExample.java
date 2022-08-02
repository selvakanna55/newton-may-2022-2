package oops2;

import oops2.Student;


public class SimpleClassObjExample {
    double x = 91;
    double y = 91.5;
    public static void main(String[] args) {
        Student s1 = new Student(140, "Newton", 91);
        Student s2 = new Student();
        Student s3 = new Student(101);
        Student s4 = new Student(102, "Varun");
//        Student s5= new Student("ldkfjvnkl", 99.4);


        //what is s1 ->
//        a) refernce b) address of the student
//        c) instance of student d) object
        System.out.println("name: " + s1.name);
        System.out.println("rollNo: " + s1.rollNo);
        System.out.println("percentage: " + s1.percentage);
        s1.sayHello();
        Student s6 = new Student(141, "Varun", 92.6);
        s2.sayHello();
    }
}
