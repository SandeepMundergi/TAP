package PracticeJAVA;

import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        double result = ((a + (c / 30)) / b);
        if (result > (int) result) {
            System.out.println((int) (result + 1));
        } else {
            System.out.println((int) result);
        }
    }
}
