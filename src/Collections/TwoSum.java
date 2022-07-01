package Collections;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {16, 25, 44, 13, 5, 6};
        int n = arr.length;
        int k = 11; // 4+5 (5+6) => 11
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
        //O(n2) -> O(n)

    }
}
