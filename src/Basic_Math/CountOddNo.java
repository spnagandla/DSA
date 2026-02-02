package Basic_Math;

public class CountOddNo {
    public static void countOdd(int n){
        int count=0;
        int last_digit =0;
        while(n>0){
            last_digit = n%10;
            if(last_digit %2 ==1) count++;
            n =n/10;
        }
        System.out.println(count);
    }

    public static void main(String[] args){
        countOdd(532);
    }
}


/*

Count number of odd digits in a number : You are given an integer n. You need to return the number of odd digits present in the number.

The number will have no leading zeroes, except when the number is 0 itself.

Example 1

Input: n = 5

Output: 1

Explanation: 5 is an odd digit.


Time Complexity: O(No_of_digits) loops runs for no of digits time
Space Complexity: O(1) Constant, Just one count.
 */