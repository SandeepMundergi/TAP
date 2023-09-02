package PracticeJAVA;

public class ContingPair {
    public static void main(String[] args) {
        // int ar[] = { 1, 2, 3, 4, 5 };
        int ar[] = { -1, 0, 1 };
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                count++;
            }
        }
        System.out.println(count);
    }
}
