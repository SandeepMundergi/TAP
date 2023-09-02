package PracticeJAVA;

public class ConsigitiveElement {
    public static void main(String[] args) {
        int ar[] = { 5, 12, 13, 14, 9, 2, 3, 4, 5, 8 };
        for (int i = 0; i < ar.length - 1; i++) {
            if ((ar[i] - ar[i + 1]) == 1 || (ar[i] - ar[i + 1]) == -1) {
                System.out.print(ar[i] + " ");
            } else {
                System.out.println(ar[i]);
            }
        }
        System.out.println(ar[ar.length - 1]);

    }
}
