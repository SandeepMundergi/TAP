package PracticeJAVA;

public class CountSmallestOccurence {
    public static void main(String[] args) {
        int ar[] = { 5, 4, 4, 4, 3, 3, 2, 1 };
        int min = Integer.MIN_VALUE;
        int c = 0;
        for (int i = 0; i < ar.length; i++) {
            int count = 1;

            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                }
            }
            if (count > min) {
                min = count;
                c = ar[i];
            }
            // if (count == 1) {
            // c = -1;
            // }
        }
        System.out.println(c);
    }
}
