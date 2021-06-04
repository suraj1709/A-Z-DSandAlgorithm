package com.ds.algo.array;

public class BuyOrSellStock2 {

    /*
     * Question Number 12:
     * Problem Statement :
     * Max profit when you buy a stock sell it with N transaction
     * Case -->You can buy stock when you sell stock.
     * Example :
     * Input : [3,2,3,6,5]
     * Output : 4
     * */


    /*
     *
     * Time Complexity :O(n)
     * Space Complexity : O(1)
     *
     * */
    public static int maxProfit(int[] nums)
    {
        int profit;
        int res=0;
        for(int i=0;i<nums.length-1;i++)
        {
            profit=nums[i+1]-nums[i];
            res=Math.max(res,profit+res);
        }
        return res;
    }

    public static void main(String[] args) {
        int result=BuyOrSellStock2.maxProfit(new int[]{3,2,3,6,5});
        System.out.println("Max Profit " +result);
    }
}
