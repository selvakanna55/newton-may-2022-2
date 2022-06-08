package Recall;

public class ArrayExample {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n];
        int arr2[] = {10, 20, 30};
        arr2[1] = 100;
        System.out.println(arr2[0]);
//        double arr2[] = new double[n];
        boolean arr3[] = new boolean[n];
        //default int - 0
        // float -= 0.0
        //char = '' cannot read
        //doble 0.0
        //boolean  - false
        // string - null



//
//

        for(int idx = 0;idx<n;idx++){
            System.out.print(arr3[idx]+" ");
        }
        System.out.println();
        for(int idx = 0;idx<n;idx++){
            arr3[idx] = true;
        }

        for(int idx = 0;idx<n;idx++){
            System.out.print(arr3[idx]+" ");
        }

//        //
//
//        //datatype variablename[] = new datatype[size];
////        arr[0] = 10;
////        arr[1] = 100;
//        arr[2] = 990;
//        for(int idx = 0;idx<n;idx++){
//            System.out.println(arr[idx]);
//        }


    }
}
