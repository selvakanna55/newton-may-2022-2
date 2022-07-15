package Assignment;

import java.util.Scanner;

public class BubbleSortInPairArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // length of array
        int n = sc.nextInt(); // Array of Pair
        Pair arr[] = new Pair[n];
        int x, y;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            arr[i] = new Pair(x, y);
        }
        Pair arr1[] = SortPair(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i].x + " " + arr1[i].y + " ");
        }
    }

    static Pair[] SortPair(Pair arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j].x < arr[j + 1].x || (arr[j].x == arr[j + 1].x && arr[j].y < arr[j + 1].y)) { // desc
                    Pair temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

//Pair code not needed while copying into newton dashboard
class Pair {
    int x;
    int y;

    // Constructor
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
