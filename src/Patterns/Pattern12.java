package Patterns;

public class Pattern12 {
    public static void pattern(int n){

        //outer loop O(N)
        for(int i=1;i<=n;i++){

            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=1;j<=(2*n)-(2*i);j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        pattern(4);
    }

}



/*
1        1
12      21
123    321
1234  4321
1234554321
 */

//Time Complexity: O(n2)
//Space Complexity: O(1)

