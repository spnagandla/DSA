package Basic_Math;

public class Largest_Digit {

    public static void largestDigit(int n){
        int largest=0;
        while(n>0){
            int last_digit = n%10;
            if(last_digit > largest) largest = last_digit;
            n=n/10;
        }
        System.out.println(largest);
    }
    public static void main(String[] args){
        largestDigit(13971);
    }
}

/*
Return the Largest Digit in a Number
You are given an integer n. Return the largest digit present in the number.

Example 1
Input: n = 25
Output: 5

Explanation: The largest digit in 25 is 5.

Time Complexity:
O(log₁₀ n), where n is the input number
Space Complexity:
O(1), since only constant extra space is used

Time Complexity:
O(log₁₀ n), where n is the input number.
Space Complexity:
O(1), since only constant extra space is used.
 */
