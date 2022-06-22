package maths;

public class GCDExample {
    void gcdOld(int a, int b){
        int mini = Math.min(a,b);
        int ans = 1;
        for(int i=mini;i>1;i--){
            if(a%i==0 && b%i==0){
                ans = i;
                break;
            }
        }
    }
    public static int gcd(int a, int b){
        if(b==0) return  a;
        return gcd(b, a%b);
    }
    public static int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 50, b = 12;
        //gcd(33, 12)
//        System.out.println(gcd(a, b));
//        System.out.println(lcm(a, b));
        int arr[] = {1,2,3,4,5};
        //34512 -> print from index 2->3->4->0->1
        int n = 5;
        for(int i=2;i<=2+n;i++){
            System.out.print(arr[i%n]+" ");
        }



    }
}
