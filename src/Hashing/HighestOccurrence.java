package Hashing;

public class HighestOccurrence {

    public static void findOccurrence(int[] arr){
        int max =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int[] visited = new int[max+1];

        for(int i=0;i<arr.length;i++){
            visited[arr[i]] ++;
        }
        int maxCount =0;
        int maxEle = -1;

        for(int i =0;i<=max;i++){
            if(visited[i] > maxCount){
                maxCount = visited[i];
                maxEle = i;
            }
        }

        System.out.println(maxEle);
    }


    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 3, 3};
        findOccurrence(arr);
    }
}

/*
Highest Occurring Element in an Array
Easy

Company
Given an array nums of n integers, find the most frequent element in it i.e., the element that occurs the maximum number of times.
If there are multiple elements that appear a maximum number of times, find the smallest of them.

Example 1
Input: nums = [1, 2, 2, 3, 3, 3]
Output: 3
Explanation: The number 3 appears the most (3 times). It is the most frequent element.

Example 2
Input: nums = [4, 4, 5, 5, 6]
Output: 4
Explanation: Both 4 and 5 appear twice, but 4 is smaller. So, 4 is the most frequent element.
 */