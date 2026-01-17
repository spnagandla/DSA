package Patterns;

public class Pattern19 {
    private static void upperHalf(int n){
     for(int i =0;i<=n-1;i++){
         for(int j=1;j<=n-i;j++){
             System.out.print("*");
         }
         for(int j=1;j<=2*i;j++){
             System.out.print(" ");
         }
         for(int j=1;j<=n-i;j++){
             System.out.print("*");
         }
         System.out.println();
     }

    }
    private static void lowerHalf(int n){
        for(int i =0;i<=n-1;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*n-2)-2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        upperHalf(4);
        lowerHalf(4);
    }
}



// trick here is divide the problem into two half's upper and lower half as we see the symmetry
// now work on the individual part

/*
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 */