package Assignment;

public class MagicNumber {
    static boolean isNineSevenPresent(int n) {
        boolean nine = false;
        boolean seven = false;
        while (n > 0) {
            int curr = n % 10;
            if (curr == 7) {
                seven = true;
            } else if (curr == 9) {
                nine = true;
            }
            n = n / 10;
        }
        if (nine && seven) {
            return true;
        }
        return false;
    }

    static int MagicNumber(int n) {
        int i = 0;
        while (isNineSevenPresent(n + i) == false && isNineSevenPresent(n - i) == false) {
            i++;
        }
        if (isNineSevenPresent(n - i) == true) {
            return n - i;
        } else return n + i;
    }
}

