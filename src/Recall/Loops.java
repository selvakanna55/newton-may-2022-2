package Recall;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //print 1 2 3 4 5 6 7
//        System.out.println(1);
        //loops -> repetitive actions
//
//        int number = 30;
//        if(number%7==0 || number%5==0){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//        int number = 20;
//
//        if(number==10){
//            System.out.println("TEN");
//        }else if(number==20){
//            System.out.println("TWENTY");
//        }else if(number==30){
//            System.out.println("THIRTY");
//        }else{
//            System.out.println("Invalid input");
//        }

        System.out.println("begin");
        //switch cases?
        //+ -> a+b, - ->a-b,

        //calcutor
        int a = 2;
        int b = 2;
        char ch = '+';
        switch (ch){
            case '+': //if(ch=='+')
                System.out.println(a+b);
                break;
            case '-':   //ch=='-'
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default: //      else
                System.out.println("Invalid input");
        }

        System.out.printf("%s--%d", "Dfv", 10);
//        if(ch=='+'){
//            System.out.println(a+b);
//        }else if(ch=='-'){
//            System.out.println(a-b);
//        }else if(ch=='*'){
//            System.out.println(a*b);
//        }else if(ch=='/'){
//            System.out.println(a/b);
//        }else{
//            System.out.println("Invalid input");
//        }
        System.out.println("end");
        Scanner sc  = new Scanner(System.in);

    }
}
