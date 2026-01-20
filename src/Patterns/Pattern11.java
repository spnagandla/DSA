package Patterns;

public class Pattern11 {
    private static void pattern(int n) {

        for (int i = 1; i <= n; i++) {

            int start = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start+ " ");
                start = 1-start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}


/*
1

0 1

1 0 1

0 1 0 1

1 0 1 0 1
 */

//Time Complexity: near about O(n2)
//Space Complexity: O(1)
