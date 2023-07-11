// ! Pattern 11

// * 01 02 03 04 05 
// * 02          10 
// * 03          15 
// * 04          20 
// * 05 10 15 20 25 

package PatternPackage;

public class Pattern11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 5 || j == 5) {
                    if (i * j < 10) {
                        System.out.print("0");
                    }
                    System.out.print(i * j + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }
}
