package Assignment;

public class IceCream {
    static int Icecreams(int N, int D) {
        for (int i = 1; i <= D; i++) {
            int eat = N / 2;
            int remain = N - eat;
            int trippled = remain * 3;
            N = trippled;
        }
        return N;
    }
}
