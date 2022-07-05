package sorting;

public class MergeTwoSortedArrays {
    //https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/visualize/
    public static void main(String[] args) {
        int a1[] ={1, 3, 5, 7, 14, 22};
        int a2[] = {2, 4, 6, 11, 17, 19, 27, 41};
        int n1 = a1.length;
        int n2 = a2.length;
        int result[] = new int[n1+n2];
        int i = 0, j = 0, k = 0;
        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                //a1[i] smaller
                result[k] = a1[i];
                i++;
            }else{
                result[k] = a2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            result[k] = a1[i];
            i++;
            k++;
        }
        while (j<n2){
            result[k] = a2[j];
            j++;
            k++;
        }
        //TC: O(n1+n2), SC: O(n1+n2)
        //TC: O(n), SC:O(n)
        for(int z=0;z<result.length;z++){
            System.out.print(result[z]+" ");
        }
        System.out.println();
    }
}

