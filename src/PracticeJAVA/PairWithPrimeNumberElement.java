package PracticeJAVA;

public class PairWithPrimeNumberElement {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int ar[] = { 2, 3, 5, 7, 9 };
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (isPrime(ar[i]) || isPrime(ar[j])) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }
}

// ! Output
// 2 3
// 2 5
// 2 7
// 2 9
// 3 5
// 3 7
// 3 9
// 5 7
// 5 9
// 7 9