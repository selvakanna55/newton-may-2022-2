package maths;

public class Factor2 {
    public static void main(String[] args) {
        //factors of n
        int n = 36;
        int sqrt = (int) Math.sqrt(n);
        int arr[] = new int[n];
        int p1 = 0, p2 = n-1;
        for(int i=1;i<=sqrt;i++){
            if(n%i==0){
                arr[p1++] = i;
                if(n/i!=i){
                    arr[p2--]=(n/i);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=0) System.out.print(arr[i]+" ");
        }

    }
}
