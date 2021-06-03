package com.ds.algo.array;

public class MaximumSubArraySum {

    /*
     * Question Number 8:
     * Problem Statement :
     * Maximum sub array sum
     * Example :
     * Input : [2,-1,-3,4,1]
     * Output : 5
     * */


    /*
     *
     * Time Complexity :O(n)
     * Space Complexity : O(1)
     *
     * */


    public static int maxSubArraySum(int[] nums) {

        int res = 0;
        int resMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(nums[i], res + nums[i]);
            resMax = Math.max(res, resMax);

        }
        return resMax;

    }

    public static void main(String[] args) {
        int result = MaximumSubArraySum.maxSubArraySum(new int[]{2, -1, -3, 4, 1});
        System.out.println("Result is " + result);
    }
}
