package BasicJAVA;

import java.util.Scanner;

public class PrimeCheck {
    static Boolean Prime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Value : ");
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = 1; count < n; i++) {
            if (Prime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
