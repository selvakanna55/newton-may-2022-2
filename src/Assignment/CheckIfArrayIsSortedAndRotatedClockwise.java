package Assignment;



import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CheckIfArrayIsSortedAndRotatedClockwise {
    static boolean isAscSortedRotated(int arr[], int n) {
        int id = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                id = i;
                break;
            }
        }
        if (id == 0) return false;
        for (int curr = id + 1; curr != id + n; curr++) {
            if (arr[curr] <= arr[curr - 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isDescSortedRotated(int arr[], int n) {
        int id = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                id = i;
                break;
            }
        }
        if (id == 0) return false;
        for (int curr = id + 1; curr != id + n; curr++) {
            if (arr[curr] >= arr[curr - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();//1
        while (tc > 0) {
            int n = sc.nextInt();
            int arr[] = new int[2 * n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                arr[n + i] = arr[i];
            }
            if (isAscSortedRotated(arr, n) || isDescSortedRotated(arr, n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");

            }
            tc--;
        }
    }
}
