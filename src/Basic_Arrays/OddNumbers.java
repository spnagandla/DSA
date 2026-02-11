package Basic_Arrays;

public class OddNumbers {

    public static void countOddNumbers(int[] arr, int n) {

        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 !=0){
                count +=1;
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        countOddNumbers(arr, 5);
    }
}

/*
Count of odd numbers in array
Given an array of n elements. The task is to return the count of the number of odd numbers in the array.
Example 1
Input: n=5, array = [1,2,3,4,5]
Output: 3
Explanation: The three odd elements are (1,3,5).

Time Complexity = O(n)
Space Complexity = O(1)
 */
