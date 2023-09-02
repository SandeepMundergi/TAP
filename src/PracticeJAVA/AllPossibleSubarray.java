package PracticeJAVA;

public class AllPossibleSubarray {

    public static void main(String[] args) {
        int ar[] = { 10, 20, 30, 40 };
        subarray(ar);
    }

    static void subarray(int[] ar) {
        for (int k = 0; k < ar.length; k++) {
            for (int s = 1; s <= ar.length; s++) {
                for (int i = 0; i <= ar.length - s; i++) {
                    if (ar[i] == ar[k]) {
                        for (int j = i; j < i + s; j++) {
                            System.out.print(ar[j] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
