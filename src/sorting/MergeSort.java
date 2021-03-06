package sorting;

public class MergeSort {
    public static void merge(int arr[], int l, int mid, int r){
        int n1 = mid-l+1; //1-0+1 = 2
        int n2 = r-mid; // 3-1 = 2

        int a1[] = new int[n1];
        int a2[] = new int[n2];

        for(int i=0;i<n1;i++){
            a1[i] = arr[l+i]; //0+0
        }
        for(int j=0;j<n2;j++){
            a2[j] = arr[mid+j+1]; //1+0
        }

        int i = 0, j =0, k = l;

        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                //a1[i] smaller
                arr[k] = a1[i];
                i++;
            }else{
                arr[k] = a2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = a1[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = a2[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int arr[], int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid); //[l..mid]
            mergeSort(arr, mid+1, r); //[mid+1.... r]
            merge(arr, l, mid, r); //[l, r] -> sorted
        }

    }
    public static void main(String[] args) {
        int arr[] = {25, -7, 4, 18, 10};
        int n = arr.length;
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        mergeSort(arr, 0, n-1);
        for(int num:arr){
            System.out.print(num+" ");
        }

        //O(nlogn)
        //O(n)
    }
}

