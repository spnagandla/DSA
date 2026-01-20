package Patterns;

public class Pattern18 {
    public static void pattern(int n){
        char start =(char)('A'+(n-1));
        for(int i=0;i<=n-1;i++){
            for(char ch= (char)(start-i); ch<=start;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(4);

    }
}

/*
E

D E

C D E

B C D E

A B C D E
*/

//Time Complexity: near about O(N2)

