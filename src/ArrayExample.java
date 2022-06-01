import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        int n = 5;

        int arr[] = new int[n];
        //datatype variable name  = new (allocate memory) datatype[size]

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
//
        System.out.println();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);


//        System.out.println(arr[1]);
        int arr2[] = new int[3];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        //arr[3] = 40;//array index out of bound exception
        for(int i=0;i<3;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
