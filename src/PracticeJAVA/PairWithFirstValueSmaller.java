package PracticeJAVA;

public class PairWithFirstValueSmaller {
    public static void main(String[] args) {
        int ar[] = { 3, 1, 5, 4, 2 };
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }
}
// ! Output
// 3 5
// 3 4
// 1 5
// 1 4
// 1 2
