package Basic_Math;

public class CountPrimeNumbers {

    public static void countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                count += 1;
            }
        }
        System.out.println(count);

    }

    private static boolean isPrimeNumber(int n) {
        if (n == 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        countPrimes(20);
    }
}


/*
Count of Prime Numbers till N
You are given an integer n. You need to find out the number of prime numbers in the range [1, n] (inclusive). Return the number of prime numbers in the range.
A prime number is a number which has no divisors except, 1 and itself.

Example 1
Input: n = 6
Output: 3
Explanation: Prime numbers in the range [1, 6] are 2, 3, 5.


Time Complexity: O(N * Sqrt(n)) because we are running the for loop and also another for loop in the primeNumber check so
Space Complexity: O(1)

 */