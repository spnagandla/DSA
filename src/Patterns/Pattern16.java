package Patterns;

public class Pattern16 {
    private static void pattern(int n) {
        char start = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(start);
            }
            start = (char) (start + 1);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern(4);
    }
}



/*
A

BB

CCC

DDDD

EEEEE
*/

//Time Complexity: near about O(n2)

