package Basic_Math;

public class Factorial {

    private static void factorial(int n){
        int ans=1;
        for(int i =1;i<=n;i++){
            ans= ans*i;
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        factorial(9);
    }
}


/*
Factorial of a given number

You are given an integer n. Return the value of n! or n factorial.
Factorial of a number is the product of all positive integers less than or equal to that number.

Example 1
Input: n = 2
Output: 2
Explanation: 2! = 1 * 2 = 2.

time complexity: O(n)
space complexity:O(1)
 */