package Assignment;

public class PrintDigits {
    static void Print_Digits(int N) {
        String ans = "";
        while (N > 0) {
            int curr = N % 10;
            if (curr == 0) {
                ans = "zero " + ans;
            } else if (curr == 1) {
                ans = "one " + ans;
            } else if (curr == 2) {
                ans = "two " + ans;
            } else if (curr == 3) {
                ans = "three " + ans;
            } else if (curr == 4) {
                ans = "four " + ans;
            } else if (curr == 5) {
                ans = "five " + ans;
            } else if (curr == 6) {
                ans = "six " + ans;
            } else if (curr == 7) {
                ans = "seven " + ans;
            } else if (curr == 8) {
                ans = "eight " + ans;
            } else if (curr == 9) {
                ans = "nine " + ans;
            }
            N = N / 10;
        }
        System.out.println(ans);
    }
}
