package Patterns;

public class Pattern13 {
    private static void pattern(int n) {
        int start =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start + " ");
                start = start +1;
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        pattern(4);
    }
}
