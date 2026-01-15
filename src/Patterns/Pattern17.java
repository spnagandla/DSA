package Patterns;

public class Pattern17 {

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //Chars
            char ch = 'A';
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if (j < i) ch = (char) (ch + 1);
                else ch = (char) (ch - 1);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}


/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
 */