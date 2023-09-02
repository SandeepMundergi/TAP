package OOPs;

import java.util.Scanner;

public class MethodOverLoading {
    static int add(int a, int b) {

        return a + b;
    }

    static int add(int a, int b, int c) {

        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {

        return a + b + c + d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        sc.close();

        System.out.println(add(a, b));
        System.out.println(add(a, b, c));
        System.out.println(add(a, b, c, d));

    }
}
