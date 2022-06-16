package maths;

public class PrimeSeive {

    public static void main(String[] args) {
        int n = 50;
        boolean isPrime[] = new boolean[n+1]; // O(n)
        //bit arr
        //assume all are primes
        for(int i=0;i<=n;i++){
            isPrime[i] = true;
        }
        //mark 0 and 1 as not prime
        isPrime[0] = isPrime[1] = false;
        int sqrt = (int)Math.sqrt(n);
        // 2..sqrt(n)
        for(int i=2;i<=sqrt;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=0;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }

        //TC: O(n*log(log(n))
        // O(n (log n) (log log n))
        //SC: O(n)
        //1 to 3 what all primes?

    }
}
