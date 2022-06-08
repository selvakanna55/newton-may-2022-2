package Recall;

public class Functions {
    //name given to few lines of code
    // used code resubaleity
    public static void printHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Begin");
//        int num1 = 200;
//        int num2 = 100;
//        int ans = diffTwoOfNumber(num1, num2);
//        System.out.println(ans);
        int num = 88;
        if(isMultipleOf8(num)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        System.out.println("End");
    }
    public static boolean isMultipleOf8(int n){
        boolean ans = (n%8==0);
        return ans;
    }


    public static int diffTwoOfNumber(int a, int b){
        int diffTwo = a-b;
        return diffTwo;
    }


}
