package LinkedList;

class Student{
    String name;
    int rollNo;
    Student(String studName, int studRoll){
        name = studName;
        rollNo = studRoll;
        System.out.println("constructor is called");
    }
}

public class SImpleClassExample {
    public static void main(String[] args) {
        Student s1 = new Student("Newton", 101);
        System.out.println("hello");
        Student s2 = new Student("ABCD",11);
        System.out.println(s1.name+" "+s1.rollNo);
        System.out.println(s2.name+" "+s2.rollNo);
    }
}
