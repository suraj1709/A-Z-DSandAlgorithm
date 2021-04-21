package com.ds.algo.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
* Question Number 3:
 * Problem Statement :
 * Contain Duplicate in an Array or Not
 * Example :
 * Input : [1,1,3]
 * Output : true
 * Example :
 * Input :[1,2,3]
 * Output :false
 * */
public class ContainDuplicateI {
    /*
     * Runtime Complexity : O(N)
     * Space Complexity : O(N)
     * */
    public static boolean containsDuplicateApproach1(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }
        return false;

    }

    public static boolean containsDuplicateApproach2(int[] arr)
    {
        /*
         * Runtime Complexity : O(N)
         * Space Complexity : O(N)
         * */
        Set<Integer> duplicateElement= new HashSet<>();
        for(int element:arr)
        {
            /*Check Contain in a set is O(1)*/
            if(duplicateElement.contains(element))
            {
                return true;
            }
            /*Add element in a set is O(1)*/
            duplicateElement.add(element);
        }
        return false;
    }
}
