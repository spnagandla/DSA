package Patterns;

public class Pattern8 {

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < (2 * n - 1)-(2*i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}

/*
 *********
 *******
 *****
 ***
 *
 */
