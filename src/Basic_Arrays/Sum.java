package Basic_Arrays;

public class Sum {
    public static void arrayElementsSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 2};
        arrayElementsSum(arr);
    }
}


/*
Given an array arr of size n, the task is to find the sum of all the elements in the array.
Example 1
Input: n=5, arr = [1,2,3,4,5]
Output: 15
Explanation: Sum of all the elements is 1+2+3+4+5 = 15

Time Complexity: O(n) n no of elements
Space Complexity: O(1)
 */