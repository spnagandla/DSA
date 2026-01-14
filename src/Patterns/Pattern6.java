package Patterns;

public class Pattern6 {
    private static void pattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
