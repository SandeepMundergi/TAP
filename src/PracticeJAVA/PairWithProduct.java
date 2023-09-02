package PracticeJAVA;

public class PairWithProduct {
    public static void main(String[] args) {
        int[] ar = { 2, 4, 6, 3, 8, 9 };
        int k = 12;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] * ar[j]) == k) {
                    System.out.print(ar[i] + " " + ar[j]);
                }
            }
            System.out.println();
        }
    }
}

// !Output
// 2 6
// 4 3