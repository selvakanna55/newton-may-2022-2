package Recusion2;

public class SimpleFunctionCall {
    static int count = 1; // without creating object -> static
    public static  void  printHello(){
        if(count>3){ // condition, base condition
            return;
        }
        count++; // -> count = count+1 increment by 1
        System.out.println("Hello world");
        printHello();
    }
    public static void main(String[] args) {
        //break  & continue used in loops/switch case
        System.out.println("Begin");
        printHello();
        System.out.println("End");
    }
}
