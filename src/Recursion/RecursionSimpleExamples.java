package Recursion;

public class RecursionSimpleExamples {
    static int num  = 1;
    static void f(){
        if(num>3){
            return;
        }
        num = num+1;
        System.out.println("Hello");
        f();//added
    }
    public static void main(String[] args) {
        System.out.println("Begin"); //not required
        f();
        System.out.println("End"); // not required

    }
}
