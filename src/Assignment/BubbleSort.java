package Assignment;


interface ISort {
    public int[] sort(int[] arr);
}

// implement classes here


class BubbleSort implements ISort {
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) { //n-1
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}


class InsertionSort implements ISort {
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int currValue = arr[i];
            int hole = i;

            while (hole >= 1 && arr[hole - 1] > currValue) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = currValue;
        }
        return arr;
    }
}


class MergeSort implements ISort {
    void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        //crate temp arr
        int temp1[] = new int[n1];
        int temp2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            temp1[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            temp2[j] = arr[mid + j + 1];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (temp1[i] < temp2[j]) arr[k++] = temp1[i++];
            else arr[k++] = temp2[j++];
        }

        while (i < n1) arr[k++] = temp1[i++];
        while (j < n2) arr[k++] = temp2[j++];

    }

    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public int[] sort(int[] arr) {
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        return arr;
    }
}


class SelectionSort implements ISort {
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int miniInex = i;

            for (int j = i + 1; j < n; j++) {//0 to i is already sorted
                if (arr[miniInex] > arr[j]) {
                    miniInex = j;
                }
            }

            if (miniInex != i) {
                //swap
                int temp = arr[miniInex];
                arr[miniInex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}