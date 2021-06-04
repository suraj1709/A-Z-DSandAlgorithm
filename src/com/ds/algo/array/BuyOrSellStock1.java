package com.ds.algo.array;

public class BuyOrSellStock1 {

    /*
     * Question Number 12:
     * Problem Statement :
     * Max profit when you buy a stock sell it with one transaction
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
        int prevMin=Integer.MAX_VALUE;
        int res=0;
        for(int price: nums)
        {
            prevMin=Math.min(prevMin,price);
            res=Math.max(res,price-prevMin);
        }
        return res;
    }

    public static void main(String[] args) {
        int result=BuyOrSellStock1.maxProfit(new int[]{3,2,3,6,5});
        System.out.println("Max Profit " +result);
    }
}
