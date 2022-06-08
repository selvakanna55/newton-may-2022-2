package Recall;

public class Loops2 {
    public static void main(String[] args) {



//        for(int i=1;i<=5;i++){
//            if(i==3){
//                break;
//            }
//            System.out.println(i);
//        }

//        int i=1;
//        while(i<=5){
//            if(i==3){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//        }
//

        //do while

//        int i=10;
//        do {
//            System.out.println("Hello");
//            i++;
//        } while(i<3);


            //break, continue
        int a = 10;
        int b = 20;
        int maximumNumber;
        maximumNumber = a>b ? a:b;
        //         condition ? True:False
        if(a>b){
            maximumNumber = a;
        }else{
            maximumNumber = b;
        }
        //                   condition ? True:False
        System.out.println(maximumNumber);


        //multiple of 5, 10 -> YES
        //25->no
        //30 -> yes
//        String ans;
//        ans = a%5==0 ? (a%10==0) ? "YES":"NO" :"NO";
//        if(a%5==0){
//            if(a%10==0){
//                ans = "YES";
//            }else {
//                ans = "NO";
//            }
//        }else{
//            ans ="NO";
//        }
//        System.out.println(ans);
        ////                cond ? true:false
//        if(a>b){
//            maximumNumber = a;
//        }else{
//            maximumNumber = b;
//        }
        System.out.println(maximumNumber);








    }
}
