package PracticeJAVA;

import java.util.Scanner;

public class SmallestSubArray {
    static void subarray(int[] ar, int k) {
        for (int s = 1; s < ar.length; s++) {
            for (int i = 0; i <= ar.length - s; i++) {
                int sum = 0;
                for (int j = i; j < i + s; j++) {
                    sum += ar[j];
                }
                if (sum == k) {
                    for (int j = i; j < i + s; j++) {
                        System.out.print(ar[j] + " ");
                    }
                    return;
                }
            }
        }
        System.out.print("No subarray found");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int k = scanner.nextInt();
        // int n = scanner.nextInt();
        int ar[] = { 2, 3, 1, 4, 2, 5 };
        // for (int i = 0; i < ar.length; i++) {
        // ar[i] = scanner.nextInt();
        // }
        subarray(ar, 1000);
    }
}