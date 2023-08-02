package BasicJAVA;

import java.util.Scanner;

public class DivBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Value : ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println(n + " Divisible");
        } else {
            System.out.println(n + " Not Divisible");
        }
        sc.close();
    }
}
