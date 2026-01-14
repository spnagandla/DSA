package Patterns;

public class Pattern15 {

    private static void pattern(int n){

        for(int i=0;i<n;i++){
            for(char ch='A';ch < 'A'+(n-i);ch++){
                System.out.print(ch+ " ");
            }
            System.out.println();

        }
    }
    public static void main(String [] args){
        pattern(4);
    }
}
