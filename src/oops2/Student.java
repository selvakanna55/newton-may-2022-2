package oops2;

class Student {
    // can contains variables and functions
    int rollNo;
    String name;
    double percentage;

    // this = current object
    Student() { // default/ no argument / empty
        System.out.println("No args constructor");
    }

    Student(int rollNo) {
        System.out.println("1 args constructor");
        this.rollNo = rollNo;
    }

    Student(int rollNo, String name) {
        System.out.println("2 args constructor");
        this.rollNo = rollNo;
        this.name = name;
    }

    Student(int rollNo, String name, double percent) {
        System.out.println("3 args constructor");
        //may or may not parameters
        this.name = name;
        this.rollNo = rollNo;
        percentage = percent;
    }


    void sayHello() {
        System.out.println("Hi! Im student");
    }
}
