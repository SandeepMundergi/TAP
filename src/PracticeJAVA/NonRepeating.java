package PracticeJAVA;

public class NonRepeating {
    public static void main(String[] args) {
        int ar1[] = { 1, 2, 3, 4, 5 };
        int ar2[] = { 2, 4, 6, 8, 10, 12 };

        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i] == ar2[j]) {
                    System.out.print(ar2[j] + " ");
                }
            }
        }

    }
}
