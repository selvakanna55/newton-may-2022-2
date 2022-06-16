package maths;

public class PrimeNumbers {

    static public boolean isPrimeOn(int n){
        for(int i=1;i<=n-1;i++){
            if(n%i==0){//7%6==1
                System.out.println("Not a prime");
                return false;
            }
        }
        System.out.println("Prime");
        return true;
    }
    static  public boolean isPrimeSqrt(int n){
        if(n<2) return  false;
        int sqrt = (int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(n%i==0){//7%6==1
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //n is prime or not
        int n = 2;
        System.out.println(isPrimeSqrt(10));
    }
}
