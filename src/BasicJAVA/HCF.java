package BasicJAVA;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Value : ");
        int n = sc.nextInt();
        System.out.print("Enter M Value : ");
        int m = sc.nextInt();
        sc.close();
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        System.out.print(n);
    }
}
