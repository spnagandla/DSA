package Patterns;

public class Pattern20 {
    private static void upperHalf(int n) {
        for (int i = 0; i <= n - 1; i++) {

            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= ((2 * n - 2) - 2 * i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void lowerHlf(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        upperHalf(4);
        lowerHlf(4);
    }
}


/*
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *

 */

//Time Complexity: O(n2)

