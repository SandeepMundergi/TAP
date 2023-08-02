package BasicJAVA;

import java.util.Scanner;

public class LastDig0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Value : ");
        int n = sc.nextInt();
        if (n % 10 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        sc.close();
    }
}
