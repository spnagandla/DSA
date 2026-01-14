package Patterns;

public class Pattern4 {

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
