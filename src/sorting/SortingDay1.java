package sorting;

public class SortingDay1 {
    public static void bubbleSort(int arr[], int n) {
        //https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) { //n-1
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

   public static void insertionSort(int arr[], int n){
        //https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/visualize/
        for(int i=1;i<n;i++){
            int hole = i;
            int value = arr[i];
            while (hole>0 && arr[hole-1]>value){
                arr[hole] = arr[hole-1];
                hole--;
            }
            arr[hole] = value;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, -1, -5, 7}; // input
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        insertionSort(arr, n);

        //input, output not considered time and space complexity
        //TC:O(n^2) SC: O(1)

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}





















