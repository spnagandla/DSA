package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurrence {

    public static void findOccurrence(int[] arr){
        int max =0;
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

    public static void findOccurrence_HashMap(int[] arr){

        Map<Integer,Integer> frequency = new HashMap<>();

        for(int num : arr){
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }

        int maxFreq =0;
        int ans = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> e : frequency.entrySet()){

            int num = e.getKey();
            int count = e.getValue();

            if(count > maxFreq){
                maxFreq = count;
                ans = num;
            } else if(count == maxFreq){
                ans = Math.min(ans,num);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 3, 3};
        findOccurrence(arr);
        findOccurrence_HashMap(arr);
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


not using hashMap:
Time Complexity:

O(n + m) where n is the length of nums and m is the maximum value in nums. The first loop iterates through nums once (O(n)). The second loop iterates through nums once (O(n)).
The third loop iterates up to the maximum value (O(m)). Therefore, the total time complexity is O(n + m).
Space Complexity
O(m) where m is the maximum value in nums. An auxiliary array `visited` of size `max + 1` is created, where `max` is the maximum value in `nums`.
This array stores the counts of each element up to the maximum value. Therefore, the space complexity is O(m).





for (Map.Entry<Integer, Integer> e : freq.entrySet())

freq.entrySet() → gives all key-value pairs
Map.Entry<Integer, Integer> → type of each pair
e → variable holding each pair
: → means "for each"
whole thing → "For each key-value pair in the map"

freq = {1=1, 2=2, 3=3} => I1 e = (1,1) => I2 e = (2,2) => I3 e = (3,3)
 */