package Assignment;

public class Palindrome {
    static boolean check_Palindrome(String str, int s, int e) {
        while (s <= e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
