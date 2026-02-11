package Basic_Arrays;

import java.util.Arrays;

public class ReverseArray {
//    public static void brute(int[] arr,int n){
//        int[] reverse = new int[arr.length];
//        for(int i =0;i<n;i++){
//            reverse[n-i-1] =arr[i];
//        }
//        for(int i =0;i<n;i++){
//            arr[i] = reverse[i];
//        }
//        System.out.println(Arrays.toString(arr));
//    }
    public static void optimal(int[] arr,int n){

        int left =0;
        int right=n-1;
        for(int i=0;i<n;i++){
            while(left < right){
                int temp =arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
//        brute(arr,5);
        optimal(arr,5);
    }
}

/*
Reverse an array
Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
Example 1
Input: n=5, arr = [1,2,3,4,5]
Output: [5,4,3,2,1]
Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]
 */
