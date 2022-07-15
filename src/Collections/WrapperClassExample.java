package Collections;

public class WrapperClassExample {
    public static void main(String[] args) {
        int a = 10; // primitive
        Integer aa = new Integer(10); // object oriented - class
        int y = 20;
        Integer num = y; //boxing
        int x = num; //unboxing
        System.out.println(aa);
        System.out.println(num);

        double d = 20.1;
        Double dd = new Double(20.1);
        Double num1 = 20.5;

        System.out.println(num1);

    }
}
