package Patterns;

public class Pattern14 {
    private static void pattern(int n) {
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        pattern(5);
    }
}
