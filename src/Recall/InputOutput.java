package Recall;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        int arr[] = new int[n];
        String nums = sc.nextLine();
        String temp[] = nums.split(" ");
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(temp[i]);
        }
        //maximum of arr
        int maxiIndex = 0;
        for(int i=1;i<n;i++){
            if(arr[maxiIndex]<arr[i]){
                maxiIndex = i;
            }
        }
        System.out.println(arr[maxiIndex]);
    }
}
