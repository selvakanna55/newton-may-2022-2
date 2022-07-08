package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 19, 29, 34, 44};
        int n = arr.length;
        int k = 1;
        int left = 0, right = n-1, index = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==k){
                index = mid;
                break;
            }
            else if(arr[mid]>k){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        System.out.println(index);
    }
}

