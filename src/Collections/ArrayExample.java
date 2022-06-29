package Collections;


import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int arr[] = new int[5];//not re size
        arr[0] = 10;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);



    }
}
