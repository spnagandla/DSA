package Patterns;

public class Pattern2 {
    private static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}


/*
 *

 **

 ***

 ****

 *****
 */

//Time Complexity: near about O(n2)
//Space Complexity: O(1)