package BasicJAVA;

import java.util.Scanner;

public class LCF {
    static int lcf(int a, int b) {
        int res = 0;
        for (int i = 1; i < a && i < b; i++) {
            if (a % i == 0 && b % i == 0) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Value : ");
        int n = sc.nextInt();
        System.out.print("Enter M Value : ");
        int m = sc.nextInt();
        sc.close();
        System.out.println("lcf : " + lcf(n, m));
    }
}
