package Hashing;

public class LinearSearch {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {10,16,5,4,51};
        int k = 99;
        int index = -1; // k is not present in array
        for(int i=0;i<n;i++){
            if(k== arr[i] ){ // true -> matching
                index = i;
                break; // once k is found in array no need search further
            }
        }
        System.out.println(index);
    }
}
