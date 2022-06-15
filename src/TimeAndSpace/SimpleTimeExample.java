package TimeAndSpace;

import java.util.Scanner;

public class SimpleTimeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = 100000000;
//        System.out.println(chottu(n));
//        System.out.println(mottu(n));
//        int rows = 3;
//        int cols = 4;
//        int arr[][] = new int[rows][cols];
//        for(int r = 0;r<rows;r++){
//            for(int c=0;c<cols;c++){
//                arr[r][c] = sc.nextInt();
//            }
//        }

//        int n = 2048;
////        int arr[] = new int[n];
//        for(int i=1;i<=n;i=i*2){ //O(n)
//            System.out.println(i);
//        }

        int  n = 4;
        for (int i=1;i<=n; i++){
            for (int j=1;j<=i;j++){
                System.out.println("hello");
            }
        }
        //O(N*N)
        //TC: O(N*N) SC: O(1)
        //new





//        int arr2[] = {10, 20, 30, 40, 50};
//        int arr[] = {10, 20, 30, 40, 50};
//        System.out.println(f(arr, arr2));
    }
    public  static boolean f(int arr[], int arr1[]){
        if(arr.length==0){
            return false;
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=arr1[i]){
                    return false;
                }
            }
            return true;
        }
    }
    public static int mottu(int n){
        int a = n;
        int b = (n+1);
        int ans = a*b/2;
        return ans;
//        return  n*(n+1)/2;
    }
    public static int chottu(int n){
        int sum = 0;

        for(int i=1;i<=n;i++){
            sum = sum+i;
        }

        return sum;
    }


}
