package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, -1, -9, 22, 7};
        int n = arr.length;
        int k = 11;
        int index = -1; // assume k is not found
        // -1 means not found
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) { // found it
                index = i;
                break;
            }
        }
        System.out.println(index);
        // T: O(n), S:O(1)
    }
}
