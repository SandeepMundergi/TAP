package PracticeJAVA;

public class LargestRepeatingElement {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 2, 2, 3, 3, 4, 5 };
        int count = 1;
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                count++;
            } else {
                count = 1;
            }
        }
        System.out.println(count);

    }
}
