package Basic_Math;

public class LCM {
    private static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;

        int i = 1;// start with one as 5*1=5 so
        int maxNum = Math.max(a, b);
        do {
            int multiple = i * maxNum;
            if (multiple % a == 0 && multiple % b == 0) return multiple;
            i++;
        } while (true);
    }

    public static void main(String[] args) {
        System.out.println(lcm(3, 5));
    }
}


/*
LCM of two numbers
You are given two integers n1 and n2. You need find the Lowest Common Multiple (LCM) of the two given numbers. Return the LCM of the two numbers.

The Lowest Common Multiple (LCM) of two integers is the lowest positive integer that is divisible by both the integers.


Example 1
Input: n1 = 4, n2 = 6
Output: 12
Explanation: 4 * 3 = 12, 6 * 2 = 12.

12 is the lowest integer that is divisible both 4 and 6.

Time Complexity: Time Complexity will be O(min(N1,N2)) because loop runs for O(N1*N2/max(N1,N2)) which is equal to the O(min(N1,N2))
Space Complexity:O(1)
 */