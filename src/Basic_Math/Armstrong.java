package Basic_Math;

public class Armstrong {

    public static void armstrong(int n){
        int sum=0;
        int count = (int) (Math.log10(n)+1);
        int original = n;
        while(n>0){
            int last_digit = n%10;
            sum += (int) Math.pow(last_digit,count);
            n=n/10;
        }
        System.out.println(original == sum ? true : false);
    }
    public static void main(String [] args){
        armstrong(153);
    }
}

/*

Check if the Number is Armstrong
You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.

An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

Example 1
Input: n = 153
Output: true
Explanation: Number of digits : 3.

13 + 53 + 33 = 1 + 125 + 27 = 153.

Therefore, it is an Armstrong number.


Time Complexity: O(log10(N)) – N is being divided by 10 until it becomes zero resulting in log10(N) iterations and in each iteration constant time operations are performed.

Space Complexity: O(1) – Using a couple of variables i.e., constant space, regardless of the size of the input.
 */
