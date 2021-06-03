package com.ds.algo.array;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingInteger {

    /*
     * Question Number 9:
     * Problem Statement :
     * First non repeating integer in an array
     * Example :
     * Input : [1,2,1,3,2,4,5]
     * Output : 3
     * */


    /*
     *
     * Time Complexity :O(n)
     * Space Complexity : O(n)
     *
     * */

    public static int firstNonRepeatingInteger(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int result = FirstNonRepeatingInteger.firstNonRepeatingInteger(new int[]{1, 2, 1, 3, 2, 4, 5});
        System.out.println("Result is " + result);
    }
}
