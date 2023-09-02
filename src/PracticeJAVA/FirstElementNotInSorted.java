package PracticeJAVA;

public class FirstElementNotInSorted {
    static int returnUnsorted(int ar[]) {
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] < ar[i + 1]) {
                continue;
            } else {
                return ar[i + 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 6, 4, 5, 7 };
        System.out.println(returnUnsorted(ar));

    }
}
