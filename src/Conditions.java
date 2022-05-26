import java.util.Scanner;

class Conditions {
    public static void main(String[] args) {
        //simple if
        //print yes if n is multiple of 3
//        int n = 10;
//        if(n%3==0){
//            System.out.println("YES");
//        }

        //if else
        //print yes if n is multiple 3 otherwise print no
//        int n = 9;
//        if (n % 3 == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

        //divisible of 3,5 -> YES
        //otherwise NO

        //nested if
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        if (n % 3 == 0) {
//            if (n % 5 == 0) {
//                System.out.println("YES");
//            }else{
//                System.out.println("NO");
//            }
//        } else {
//            System.out.println("NO");
//        }
//
//        if(n%3==0 && n%5==0){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }

//        if(n==1){
//            System.out.println("ONE");
//        }else if(n==2){
//            System.out.println("TW0");
//        }else if(n==3){
//            System.out.println("THREE");
//        }else if(n==4){
//            System.out.println("FOUR");
//        }else{
//            System.out.println("input should be in the range 1 to 4");
//        }

//        switch (n){
//            case 1://if(n==1){
//                System.out.println("ONE");
//                break;
//            case 2://if(n==2){
//                System.out.println("TW0");
//                break;
//            case 3://if(n==3){
//                System.out.println("THREE");
//                break;
//            case 4://if(n==4){
//                System.out.println("FOUR");
//                break;
//            default://else
//                System.out.println("input should be in the range 1 to 4");
//                break;
//        }

       /* String word = sc.next();
        switch (word){
            case "THREE":
                System.out.println(3);
                break;
            case "ONE":
                System.out.println(1);
                break;
            case "TWO":
                System.out.println(2);
                break;
            case "FOUR":
                System.out.println(4);
                break;
            default:
                System.out.println("input should be in range 1 top 4");
        }*/

//        if(n==10){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }

        String ans = (n==10) ? "YES":"NO";
       if(n%10==0){
                if(n%3==0){
                    System.out.println("10 3");
                }else{
                    System.out.println("10");
                }
            }else{
                System.out.println("3");
        }
        System.out.println( (n%10==0) ? (n%3==0) ? "10 3":"10" : "NO");
    }
}
