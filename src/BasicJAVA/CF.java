package BasicJAVA;

import java.util.Scanner;

public class CF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Value : ");
        int n = sc.nextInt();
        System.out.print("Enter M Value : ");
        int m = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                System.out.println(i + " ");
            }

        }
    }
}
