// ! Pattern 6
/*
 * *****
 *  ****
 *   ***
 *    **
 *     *
 */
package PatternPackage;

public class Pattern6 {
     public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();        }    
    }
}