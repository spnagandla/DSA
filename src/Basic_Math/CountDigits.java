package Basic_Math;

public class CountDigits {
    private static void count(int n){

        if(n == 0)  System.out.println(1);
        Integer no_of_digits =0;
        while(n>0){
            n=n/10;
            no_of_digits = no_of_digits+1;
        }
        System.out.println(no_of_digits);
    }

    public static void main(String[] args){
        count(54723);
    }
}


/*

Count all Digits of a Number

The number will have no leading zeroes, except when the number is 0 itself.


Example 1

Input: n = 4

Output: 1

Explanation: There is only 1 digit in 4.

Time Complexity: O(No_of_digits) loops runs for no of digits time
Space Complexity: O(1) Constant, Just one count.
 */