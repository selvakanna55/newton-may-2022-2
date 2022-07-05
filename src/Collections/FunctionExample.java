package Collections;

public class FunctionExample {
    //void -> nothing, 0
    public static  void printHello(){
        System.out.println("Hello");
        System.out.println("Newton");
    }
    public static int addTwoNumber(int a, int b) {
        int sum = a+b;
        return sum;
    }
        public static void main(String[] args) {
        System.out.println("Begin");
        int a = 10, b = 20;
        int sum = addTwoNumber(a, b);
        System.out.println("End");
    }
}
