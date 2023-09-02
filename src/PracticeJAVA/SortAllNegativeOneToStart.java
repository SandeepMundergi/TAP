package PracticeJAVA;

public class SortAllNegativeOneToStart {
    public static void main(String[] args) {
        int ar[] = { 5, -1, 3, -1, 4, 5, 3, -1 };
        int temp = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i + 1] == -1) {
                temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;
            }
            for (int k = 0; k < ar.length; k++) {
                System.out.print(ar[k] + " ");
            }
            System.out.println("\n");
        }
        // for (int i = 0; i < ar.length; i++) {
        // System.out.print(ar[i] + " ");
        // }
    }
}
