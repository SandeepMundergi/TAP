package PracticeJAVA;

public class CommonRepeatingOddElementsinSortedArrays {
    public static void main(String[] args) {
        int ar1[] = { 2, 4, 6, 8 };
        int ar2[] = { 1, 3, 5, 7 };
        int i = 0;
        int j = 0;
        boolean flag = false;
        while (i < ar1.length && j < ar2.length) {
            if ((ar1[i] == ar2[j]) && ar1[i] % 2 != 0) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                flag = false;
            } else if (ar1[i] < ar2[j]) {
                i++;
                flag = true;
            } else {
                j++;
                flag = true;
            }
        }
        if (flag) {
            System.out.println("No common odd elements found.");
        }
    }
}
