package BasicJAVA;

import java.util.Scanner;

public class ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Value : ");
        int n = sc.nextInt();
        if (n % 15 == 0) {
            System.out.println("BTM");
        } else if (n % 5 == 0) {
            System.out.println("Acadamy");
        } else if (n % 3 == 0) {
            System.out.println("TAP");
        }
        sc.close();
    }
}
