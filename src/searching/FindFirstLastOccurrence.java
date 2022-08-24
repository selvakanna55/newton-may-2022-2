package searching;

public class FindFirstLastOccurrence {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 3, 4, 4, 5, 5};
        int n = arr.length;
        // 0 0 0 0 1 1 1 1
        int l = 0, r = n - 1, start = -1, end = -1, num = 3;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == num) {
                start = mid;
                r = mid - 1;
            } else if (arr[mid] > num) r = mid - 1;
            else l = mid + 1;
        }
        l = 0;
        r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == num) {
                end = mid;
                l = mid + 1;
            } else if (arr[mid] > num) r = mid - 1;
            else l = mid + 1;
        }
        System.out.println(start + " " + end);
        System.out.println(end - start + 1);
    }
}
