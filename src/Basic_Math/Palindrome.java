package Basic_Math;

public class Palindrome {

    private static void palindrome(int n){
        int original =n;
        int reverse =0;
        int last_digit=0;

        while(n>0){
            last_digit = n%10;
            reverse = (reverse*10)+last_digit;
            n=n/10;
        }
        System.out.println(reverse == original ? "true" : "false");
    }
    public static void main(String []args){
        palindrome(121);
    }
}

/*
Palindrome Number
You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.

A palindrome number is a number which reads the same both left to right and right to left.

Example 1
Input: n = 121
Output: true

Explanation: When read from left to right : 121.
When read from right to left : 121.


 */