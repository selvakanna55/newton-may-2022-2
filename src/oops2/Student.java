package oops2;

class Student {
    // can contains variables and functions
    int rollNo;
    String name;
    double percentage;

    // this = current object
    public Student(int rollNo, String name, double percent) {
        this.name = name;
        this.rollNo = rollNo;
        percentage = percent;
    }

    void sayHello() {
        System.out.println("Hi! Im student");
    }
}
