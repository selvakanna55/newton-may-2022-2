import java.lang.Math;
class FunctionExample {
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return  sum;
    }

    public static int multiply(int num1, int num2){
        int multi = num1*num2;
        return multi;
    }


    public static void main(String[] args) {
//        System.out.println("Start");//for example
//        int a = 10;
//        int b = 20;
//        int sumOfTwoNumbers = calculateSum(a, b);
//        System.out.println(sumOfTwoNumbers);
//        int mulOfTwoNumbers = multiply(a, b);
//        System.out.println(mulOfTwoNumbers);
//        System.out.println("End"); //for example
//        System.out.println(Math.floor(10.9));
//        System.out.println(Math.ceil(10.9));
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

        int a  = 10;
        double b = (double) a;
        float c = (float) a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int num1 = 37;
        String num2 = Integer.toString(num1);
        System.out.println(num2);

        String num3 = "36";
        int num4 = Integer.parseInt(num3);
        System.out.println(num4);


    }
}
