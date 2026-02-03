package Basic_Math;

public class PerfectNumber {
    public static void perfectNumber(int n){
        int sum =0;
        int original =n;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                sum += i;
            }
        }
        System.out.println(original == sum);
    }

    public static void main(String[] args){
        perfectNumber(7);
    }
}

/*
Check for Perfect Number
You are given an integer n. You need to check if the number is a perfect number or not. Return true if it is a perfect number, otherwise, return false.
A perfect number is a number whose proper divisors (excluding the number itself) add up to the number itself.


Example 1
Input: n = 6
Output: true
Explanation: Proper divisors of 6 are 1, 2, 3.
1 + 2 + 3 = 6.

Time Complexity:O(n)
space complexity: O(1)

 */
