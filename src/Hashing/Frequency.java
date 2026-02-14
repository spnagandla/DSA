package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

    public static void elementFrequency(int[] arr){

        Map<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,3,1,4,5};
        elementFrequency(arr);
    }
}


/*
How many times each number is repeated in the array.
 */