package sorting;

public class BasicSortingExample {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        //result: 20, 10, 30
        //swapping
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
}
