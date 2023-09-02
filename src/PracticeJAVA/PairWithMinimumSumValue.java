package PracticeJAVA;

public class PairWithMinimumSumValue {

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4 };
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int a = 0, b = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                sum = ar[i] + ar[j];
                if (sum < min) {
                    min = sum;
                    a = ar[i];
                    b = ar[j];
                }
            }
        }
        System.out.println(a + " " + b);

    }
}
