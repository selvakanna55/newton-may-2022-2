package strings;

import java.util.Locale;
import java.util.Scanner;

public class BasicsStrings {
    public static void main(String[] args) {
        int num = 10;
        String s = "123";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        //character at 0th index

//        Scanner sc = new Scanner(System.in);
        String s2 = new String("newton");
        //constructor gets called when we initialize an object
        //string pool
        System.out.println(s.substring(0, 2));
        System.out.println(s2.substring(0, 4));
//        s.charAt(0) = 'X';
        //immutable -> cannot modify, update
        //StringBuffer, StringBuilder -> allow to modify
        System.out.println(s2.toUpperCase());
        //set of character
        //ascii value
        //
        System.out.println(s2.concat(s));
        System.out.println(s2 + s);
        System.out.println(s.replace('1', '9'));
        System.out.println(s);
        System.out.println(s.contains("1"));
        System.out.println(s.contains("9"));
        //' -> char
        //" -> string
        String a1 = "Newton";
        String a2 = "Newton";
        String a3 = new String("Newton");
        if(a1==a2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
//        if(a1==a3){
        if(a3.equals(a3)==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
