package BasicJAVA;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N value : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}
