package PracticeJAVA;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println(a);
        } else if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println(b);
        } else if ((c > a && c < b) || (c > b && c < a)) {
            System.out.println(c);
        }
    }
}
