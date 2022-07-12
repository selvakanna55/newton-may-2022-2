package strings;

public class ArrayComp {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(arr.length);
        System.out.println(arr[0]);

        //print first n elements -> 1 2
        int n = 2;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        arr[0] = 99;
    }
}
