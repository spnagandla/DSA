package Basic_Math;

public class Reverse {

    public static void reverse(int n){
        int last_digit =0;
        int reverse=0;
        while(n>0){
            last_digit = n%10;
            reverse = (reverse*10)+last_digit;
            n=n/10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args){
        reverse(5432);
    }
}

/*

Reverse a number
You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

Example 1

Input: n = 25
Output: 52

Explanation: Reverse of 25 is 52.

Time Complexity:
O(log₁₀ n), where n is the input number

Space Complexity:
O(1), since only constant extra space is used
 */
