// ! Pattern 2

/*

 * 01 02 03 04 05 
 * 06 07 08 09 10 
 * 11 12 13 14 15 
 * 16 17 18 19 20 
 * 21 22 23 24 25 
  
 */

package PatternPackage;

public class Pattern2 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (count < 10) {
                    System.out.print("0");
                }
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
