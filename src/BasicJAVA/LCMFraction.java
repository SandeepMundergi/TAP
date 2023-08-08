package BasicJAVA;

import java.util.Scanner;

public class LCMFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Value : ");
        int n = sc.nextInt();
        System.out.print("Enter M Value : ");
        int m = sc.nextInt();
        sc.close();
        int res = 0;
        for (int i = n; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                res = i;
                break;
            }
        }
        int lcm = m * n / res;
        System.out.println("HCF : " + res);
        System.out.println("LCM : " + lcm);
        System.out.println("Fraction : " + n / res + "/" + m / res);
    }
}
