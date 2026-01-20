package Patterns;

public class Pattern3 {

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
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

12

123

1234

12345
 */

//Time Complexity: near about O(n2)
//Space Complexity: O(1)