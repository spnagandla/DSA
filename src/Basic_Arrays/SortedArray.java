package Basic_Arrays;

public class SortedArray {

    public static boolean sorted_brute(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]< arr[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sorted_optimal(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {1,2,5};
        System.out.println(sorted_brute(arr));
        System.out.println(sorted_optimal(arr));
    }
}


/*
Check if the Array is Sorted I
Given an array arr of size n, the task is to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order. If the array is sorted then return True, else return False.
Example 1
Input: n = 5, arr = [1,2,3,4,5]
Output: True
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

optimal O(N)
brute O(n) *2
 */
