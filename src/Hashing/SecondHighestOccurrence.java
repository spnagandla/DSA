package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class SecondHighestOccurrence {


    public static void secondMostFrequent(int[] nums) {
        Map<Integer, Integer> freq_map = new HashMap<>();
        for (int x : nums) {
            freq_map.put(x, freq_map.getOrDefault(x, 0) + 1);
        }

        if (freq_map.size() < 2) {
            System.out.println(-1);
            return;// not enough distinct elements
        }

        int el1 = -1, el2 = -1;                 // best and second-best numbers
        int ef1 = -1, ef2 = -1;                   // their frequencies

        for (Map.Entry<Integer, Integer> e : freq_map.entrySet()) {
            int ele = e.getKey();
            int freq = e.getValue();

            if (freq > ef1) {
                //First do the transfer from e1 -> e2
                el2 = el1;
                ef2 = ef1;

                //then do th update the e1 with current values from iteration

                el1 = ele;
                ef1 = freq;

            } else if (freq == ef1) {
                el1 = Math.min(ele, el1);

            } else if (freq > ef2) {
                ef2 = freq;
                el2 = ele;

            } else if (freq == ef2) {
                el2 = Math.min(el2, ele);

            }
        }
        System.out.println(el2);

    }

    public static void main(String[] args) {
        int[] arr = {5,5,5, 4,4,4, 7,7};
        secondMostFrequent(arr);
    }
}


/*
Second Highest Occurring Element

Given an array of n integers, find the second most frequent element in it.
If there are multiple elements that appear second most frequent times, find the smallest of them.
If second most frequent element does not exist return -1.

Example 1
Input: arr = [1, 2, 2, 3, 3, 3]
Output: 2
Explanation:
The number 2 appears the second most (2 times) and number 3 appears the most(3 times).

Example 2
Input: arr = [4, 4, 5, 5, 6, 7]
Output: 6
Explanation:
Both 6 and 7 appear second most times, but 6 is smaller.



1) Time complexity:
Building the map : for (int x : nums) freq_map.put(x, freq_map.getOrDefault(x,0)+1); This loop runs N times.

Each getOrDefault / put is O(1) average, O(n) worst-case (rare, but that’s the formal statement).

So:Average: O(N)
Worst-case: O(N^2) (theoretical HashMap worst-case)

Scanning the map: for (Map.Entry<Integer,Integer> e : freq_map.entrySet()) , This does NOT run N times necessarily.

It runs K times where: K = number of distinct elements (size of the map) K ≤ N

So the second loop is: O(K) average

✅ Total average time:
O(N + K) → which is basically O(N).

2) Space complexity:

The map stores counts for distinct keys:Space: O(K) (not always O(N), but worst-case K=N)

So: Worst-case: O(N)

More accurate: O(K)
 */